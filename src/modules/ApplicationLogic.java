package modules;

/**
 *
 * @author PRAM WEE
 */
public class ApplicationLogic {

    private static ApplicationLogic instance = null;

    public static ApplicationLogic getInstance() {
        if (instance == null) {
            instance = new ApplicationLogic();
        }
        return instance;
    }

    private ApplicationLogic() {
    }

    public String getQueryDaftarServisMobil() {
        return "SELECT idpelanggan_servis,tanggal_servis as `Tanggal Servis`,km_servis as `KM Servis`,nama as `Pelanggan` FROM pelanggan_servis p,pelanggan pe WHERE pe.idpelanggan=p.idpelanggan";
    }

    public String getQueryItemServis() {
        return "select iditem_servis,nama_item as `Item Servis`,harga `Harga` from item_servis order by nama_item";
    }

    public String getQueryPelangganForHP(String noHp) {
        return "SELECT * FROM pelanggan where hp='" + noHp + "'";
    }

    public String getInsertPelanggan(String nama, String pin, String hp, String alamat) {
        String sql = "insert into pelanggan(nama,pin,hp,alamat) values('" + nama + "','" + pin + "','" + hp + "','" + alamat + "')";
        return sql;
    }

    public String getQueryDaftarMobil() {
        return "SELECT idmobil,nopol_mobil,nama_mobil,standar_km_servis, standar_bulan_service, p.nama FROM mobil m,pelanggan p where m.idpelanggan = p.idpelanggan";
    }

    

    public String getQueryOutbox() {
        return "select IDsms_outbox,no_telp,pesan,status,waktu from sms_outbox Order BY waktu desc";
    }

    public String getQueryDaftarPelanggan() {
        return "SELECT idpelanggan,nama,alamat,hp,status from pelanggan Order BY nama";
    }

    public String getQueryServisItem(String id) {
        return "SELECT idpelanggan_servis_item,nama_item as `Jenis Layanan`,p.Jumlah,p.Harga,p.jumlah * p.harga as `Total Harga` FROM pelanggan_servis_item p, item_servis i WHERE p.iditem_servis = i.iditem_servis and p.idpelanggan_servis =" + id;
    }

    public String getQueryServisSukuCadang(String id) {
        return "SELECT idpelanggan_servis_sukucadang,nama_sukucadang as `Suku Cadang`,p.Jumlah,p.Harga,p.jumlah * p.harga as `Total Harga` FROM pelanggan_servis_sukucadang p, suku_cadang i WHERE p.idsukucadang = i.idsuku_cadang and p.idpelanggan_servis ="+id;
    }

    public String getQuerySukuCadang() {
        return "SELECT idsuku_cadang, nama_sukucadang as `Suku Cadang`, harga_standar as `Harga Standard`,standar_bulan_service as `Standar Bulan Servis` from suku_cadang order by `nama_sukucadang";
    }
}
