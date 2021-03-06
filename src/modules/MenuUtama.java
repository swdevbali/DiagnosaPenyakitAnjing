package modules;


import modules.gejala.DaftarGejala;
import modules.pasien.DaftarPasien;
import modules.penyakit.DaftarPenyakit;
import modules.rekmed.DaftarRekmed;
/**
 *
 * @author  PRAM WEE
 */
public class MenuUtama extends javax.swing.JPanel {

    /** Creates new form Pegawai */
    private static MenuUtama instance = null;

    public static MenuUtama getInstance() {
        if (instance == null) {
            instance = new MenuUtama();
        }
        return instance;
    }

    private MenuUtama() {
        initComponents();
        btnHome.doClick();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        btnHome = new javax.swing.JToggleButton();
        btnPelanggan = new javax.swing.JToggleButton();
        btnMobil = new javax.swing.JToggleButton();
        btnSukuCadang = new javax.swing.JToggleButton();
        btnRekamMedis = new javax.swing.JToggleButton();
        scrollUtama = new javax.swing.JScrollPane();

        jToolBar1.setRollover(true);

        buttonGroup1.add(btnHome);
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.gif"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setFocusable(false);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHome);

        buttonGroup1.add(btnPelanggan);
        btnPelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pelanggan.gif"))); // NOI18N
        btnPelanggan.setText("Pasien");
        btnPelanggan.setFocusable(false);
        btnPelanggan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPelanggan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelangganActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPelanggan);

        buttonGroup1.add(btnMobil);
        btnMobil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/obat.gif"))); // NOI18N
        btnMobil.setText("Gejala");
        btnMobil.setFocusable(false);
        btnMobil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMobil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMobilActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMobil);

        buttonGroup1.add(btnSukuCadang);
        btnSukuCadang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log.gif"))); // NOI18N
        btnSukuCadang.setText("Penyakit");
        btnSukuCadang.setFocusable(false);
        btnSukuCadang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSukuCadang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSukuCadang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSukuCadangActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSukuCadang);

        buttonGroup1.add(btnRekamMedis);
        btnRekamMedis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pemesanan.gif"))); // NOI18N
        btnRekamMedis.setText("Rekam Medis");
        btnRekamMedis.setFocusable(false);
        btnRekamMedis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRekamMedis.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRekamMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRekamMedisActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRekamMedis);

        scrollUtama.setBorder(null);
        scrollUtama.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollUtama, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollUtama, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void btnPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelangganActionPerformed
        scrollUtama.setViewportView(DaftarPasien.getInstance());
}//GEN-LAST:event_btnPelangganActionPerformed

    public void setModul(int i) {
        switch (i) {
            case 0:
                btnHome.setSelected(true);
                btnHomeActionPerformed(null);
                break;
            case 1:
                btnPelanggan.setSelected(true);
                btnPelangganActionPerformed(null);
                break;
            case 2:
                btnMobil.setSelected(true);
                btnMobilActionPerformed(null);
                break;
            case 3:
                btnSukuCadang.setSelected(true);
                btnSukuCadangActionPerformed(null);
                break;
            case 4:
                btnRekamMedis.setSelected(true);
                btnRekamMedisActionPerformed(null);
                break;
            /*case 6:
                btnOutbox.setSelected(true);
                btnOutboxActionPerformed(null);
                break;
            case 7:
                btnLog.setSelected(true);
                btnLogActionPerformed(null);
                break;
            case 9:
                btnItemServis.setSelected(true);
                btnItemServisActionPerformed(null);
                break;
            case 10:
                btnServisMobil.setSelected(true);
                btnServisMobilActionPerformed(null);
                break;*/
        }
    }

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        scrollUtama.setViewportView(PanelHome.getInstance());
}//GEN-LAST:event_btnHomeActionPerformed

    private void btnMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMobilActionPerformed
        scrollUtama.setViewportView(DaftarGejala.getInstance());
}//GEN-LAST:event_btnMobilActionPerformed

    private void btnSukuCadangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSukuCadangActionPerformed
        scrollUtama.setViewportView(DaftarPenyakit.getInstance());
}//GEN-LAST:event_btnSukuCadangActionPerformed

    private void btnRekamMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRekamMedisActionPerformed
        scrollUtama.setViewportView(DaftarRekmed.getInstance());
}//GEN-LAST:event_btnRekamMedisActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnHome;
    private javax.swing.JToggleButton btnMobil;
    private javax.swing.JToggleButton btnPelanggan;
    private javax.swing.JToggleButton btnRekamMedis;
    private javax.swing.JToggleButton btnSukuCadang;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JScrollPane scrollUtama;
    // End of variables declaration//GEN-END:variables
}
