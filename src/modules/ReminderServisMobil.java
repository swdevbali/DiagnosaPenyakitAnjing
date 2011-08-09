/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

import core.system.DB;
import java.util.Calendar;
import java.util.StringTokenizer;
import smsgateway.SMS;
import smsgateway.TimerExecution;

/**
 *
 * @author Eko SW
 */
public class ReminderServisMobil extends TimerExecution {

    public ReminderServisMobil() {
    }

    @Override
    public void executeTimer() {
        //ambil semua pelanggan pada sistem, beserta standar bulan servis mobilnya
        String data[][] = DB.getInstance().getDataSet("select p.idpelanggan,m.standar_bulan_service,p.hp,standar_km_servis from pelanggan p, mobil m where p.idpelanggan = m.idpelanggan order by idpelanggan", false);
        if (data.length > 0) {
            for (int i = 0; i < data.length; i++) {
                //ambil servis terakhirnya
                String servis[][] = DB.getInstance().getDataSet("select idpelanggan_servis, tanggal_servis, km_servis, m.nopol_mobil,reminder_sudah_dikirim from pelanggan_servis p,mobil m,pelanggan pe where p.idpelanggan = pe.idpelanggan and m.idpelanggan = pe.idpelanggan and p.idpelanggan=" + data[i][0] + " order by idpelanggan_servis desc limit 1", false);
                if (servis.length > 0) {
                    if (servis[0][4].equals("0")) {
                        //hitung waktu dari servis terakhir sampai dengan tanggal sekarang
                        StringTokenizer tok = new StringTokenizer(servis[0][1], "-");
                        String year = tok.nextToken();
                        String month = tok.nextToken();
                        String day = tok.nextToken();
                        Calendar dateServis = Calendar.getInstance();
                        dateServis.set(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
                        Calendar dateMinus7dariServis = Calendar.getInstance();
                        dateMinus7dariServis.add(Calendar.DATE, -7);
                        dateServis.add(Calendar.MONTH, Integer.parseInt(data[i][1]));//cek x bulan setelah servis terakhir
                        if (dateServis.compareTo(dateMinus7dariServis) >= 0) {
                            String[] dataOutbox = new String[3];
                            //jika 1 minggu lagi adalah servis bulanan mobil, maka kirimkan reminder
                            int yearServis = dateServis.get(Calendar.YEAR);
                            int monthServis = dateServis.get(Calendar.MONTH);
                            int dayServis = dateServis.get(Calendar.DATE);
                            dataOutbox[0] = data[i][2];
                            dataOutbox[1] = "Yth. pelanggan " + servis[0][3] + " anda service kembali pada tanggal " + dayServis + "/" + monthServis + "/" + yearServis + " atau mencapai " + (Integer.parseInt(servis[0][2]) + Integer.parseInt(data[i][3])) + " Km. Terimakasih";
                            dataOutbox[2] = "p0";
                            SMS.getSingleton().insertOutbox(dataOutbox);
                            //tandai reminder sudah dikirim.
                            DB.getInstance().executeQuery("update pelanggan_servis set reminder_sudah_dikirim=true where idpelanggan_servis=" + servis[0][0]);
                        //selesai
                        }
                    }

                    //reminder suku cadang
                    String sukucadang[][] = DB.getInstance().getDataSet("select p.idpelanggan_servis_sukucadang,p.idsuku_cadang,s.nama_sukucadang,standar_bulan_service,p.harga from pelanggan_servis_sukucadang p,suku_cadang s where p.idsuku_cadang = s.idsuku_cadang and p.idpelanggan_servis=" + servis[0][0] + " and p.reminder_sudah_dikirim=false order by idpelanggan_servis", false);
                    String pesanSukuCadang = null;
                    if (sukucadang.length > 0) {
                        for (int j = 0; j < sukucadang.length; j++) {
                            pesanSukuCadang = "Mohon periksa kembali suku cadang Anda, ";
                            StringTokenizer tok = new StringTokenizer(servis[0][1], "-");
                            String year = tok.nextToken();
                            String month = tok.nextToken();
                            String day = tok.nextToken();
                            Calendar dateServis = Calendar.getInstance();
                            dateServis.set(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
                            Calendar dateMinus7dariServis = Calendar.getInstance();
                            dateMinus7dariServis.add(Calendar.DATE, -7);
                            dateServis.add(Calendar.MONTH, Integer.parseInt(sukucadang[j][3]));//cek x bulan setelah servis terakhir
                            if (dateServis.compareTo(dateMinus7dariServis) >= 0) {
                                pesanSukuCadang = pesanSukuCadang  + sukucadang[j][2] + " : " + sukucadang[j][4];
                            }
                            String[] dataOutbox = new String[3];
                            dataOutbox[0] = data[i][2];
                            dataOutbox[1] = pesanSukuCadang;
                            dataOutbox[2] = "p0";
                            SMS.getSingleton().insertOutbox(dataOutbox);
                            DB.getInstance().executeQuery("update pelanggan_servis_sukucadang set reminder_sudah_dikirim=true where idpelanggan_servis_sukucadang=" + sukucadang[j][0]);
                        }
                    }
                }
            }
        }
    }
}
