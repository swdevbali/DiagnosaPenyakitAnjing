package modules.riwayatservis;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
import modules.ApplicationLogic;
import core.gui.TableController;
import core.system.Startup;
import java.awt.Font;
import javax.swing.UIManager;

/**
 *
 * @author  PRAM WEE
 */
public class DaftarRiwayatServis extends javax.swing.JPanel {

    private static DaftarRiwayatServis instance = null;
    private TableController tblDataController = null;
    private TableController tblData2Controller = null;

    public static DaftarRiwayatServis getInstance() {
        if (instance == null) {
            instance = new DaftarRiwayatServis();
        }
        return instance;
    }

    private DaftarRiwayatServis() {
        try {
            Startup.getInstance().setLookAndFeel(Startup.ALLOY_LAF);
            Startup.getInstance().setUIFont(new javax.swing.plaf.FontUIResource("Tahoma", Font.PLAIN, 11));
            UIManager.setLookAndFeel(Startup.getInstance().getLookAndFeel());
            initComponents();
            tblDataController = new TableController(this, "pelanggan", ApplicationLogic.getInstance().getQueryDaftarPelanggan(), tblSukuCadang, null, "idpelanggan", true);
            tblDataController.setState(TableController.STATE_BROWSE);
            tblData2Controller = new TableController(this, "pelanggan", ApplicationLogic.getInstance().getQueryDaftarPelanggan(), tblItemServis, null, "idpelanggan", true);
            tblData2Controller.setState(TableController.STATE_BROWSE);
            cboPelangganActionPerformed(null);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaftarRiwayatServis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DaftarRiwayatServis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DaftarRiwayatServis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(DaftarRiwayatServis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSukuCadang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cboPelanggan = new core.dataview.JCombBoxEx();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblItemServis = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblSukuCadang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblSukuCadang);

        jLabel1.setText("Pelanggan");

        cboPelanggan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "xx", "xxxx" }));
        cboPelanggan.setFieldName("idpelanggan");
        cboPelanggan.setSqlSelect("select idpelanggan,nama from pelanggan order by nama");
        cboPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPelangganActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Riwayat Servis Suku Cadang");

        tblItemServis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblItemServis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemServisMouseClicked(evt);
            }
        });
        tblItemServis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblItemServisKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblItemServis);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Riwayat Item Servis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblItemServisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemServisMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemServisMouseClicked

    private void tblItemServisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblItemServisKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemServisKeyPressed

    private void cboPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPelangganActionPerformed
        tblDataController.loadTable("select  p.idpelanggan_servis, p.tanggal_servis as `Tanggal Servis`,s.nama_sukucadang as `Suku Cadang`,ps.Jumlah,ps.Harga,ps.jumlah * ps.harga as Total from suku_cadang s, pelanggan pp, pelanggan_servis p,pelanggan_servis_sukucadang ps where p.idpelanggan=" + cboPelanggan.getAutoIdFromSelectedIndex() + "  and p.idpelanggan_servis=ps.idpelanggan_servis and pp.idpelanggan=p.idpelanggan and ps.idsukucadang=s.idsuku_cadang order by p.idpelanggan_servis");
        tblData2Controller.loadTable("select  p.idpelanggan_servis, p.tanggal_servis as `Tanggal Servis`,s.nama_item as `Suku Cadang`,ps.Jumlah,ps.Harga,ps.jumlah * ps.harga as Total from item_servis s, pelanggan pp, pelanggan_servis p,pelanggan_servis_item ps where p.idpelanggan=" + cboPelanggan.getAutoIdFromSelectedIndex() + "  and p.idpelanggan_servis=ps.idpelanggan_servis and pp.idpelanggan=p.idpelanggan and ps.iditem_servis=s.iditem_servis order by p.idpelanggan_servis");
    }//GEN-LAST:event_cboPelangganActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private core.dataview.JCombBoxEx cboPelanggan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblItemServis;
    private javax.swing.JTable tblSukuCadang;
    // End of variables declaration//GEN-END:variables
}
