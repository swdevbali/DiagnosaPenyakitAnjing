package modules.servismobil;

import modules.ApplicationLogic;
import core.gui.TableController;

/**
 *
 * @author  PRAM WEE
 */
public class DaftarServisMobil extends javax.swing.JPanel {

    private static DaftarServisMobil instance = null;
    private TableController tblDataController = null;
    private TableController tblDataSekunderController = null;
    private TableController tblDataTertierController = null;

    public static DaftarServisMobil getInstance() {
        if (instance == null) {
            instance = new DaftarServisMobil();
        }
        return instance;
    }

    private DaftarServisMobil() {
        initComponents();
        String s = ApplicationLogic.getInstance().getQueryDaftarServisMobil();


        tblDataController = new TableController(this, "pelanggan_servis", s, tblData, beanData, "idpelanggan_servis",true);
        beanData.setTableController(tblDataController);
        tblDataController.loadTable();

        //item servis 
        tblDataSekunderController = new TableController(this, "pelanggan_servis_item", "", tblDataSekunder, null, "idpelanggan_servis_item",true);
        tblDataSekunderController.setDialogEntry(InputServisItem.getInstance());
        tblDataTertierController = new TableController(this, "pelanggan_servis_sukucadang", "", tblDataTertier, null, "idpelanggan_servis_sukucadang",true);
        tblDataTertierController.setDialogEntry(InputSukuCadang.getInstance());
        fillSecondaryData();
    }

    private void fillSecondaryData() {
        int rowId = getServisPelangganId();
        String sql;
        tblDataController.fillInputPanel();
        sql = ApplicationLogic.getInstance().getQueryServisItem(rowId + "");
        tblDataSekunderController.loadTable(sql);
        
        
        sql = ApplicationLogic.getInstance().getQueryServisSukuCadang(rowId + "");
        tblDataTertierController.loadTable(sql);
    }

    public int getServisPelangganId() {
        int rowId = tblDataController.getRowId();
        return rowId;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTambah3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        beanData = new modules.servismobil.BeanServisMobil();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDataSekunder = new javax.swing.JTable();
        btnTambah1 = new javax.swing.JButton();
        btnUbah1 = new javax.swing.JButton();
        btnHapus1 = new javax.swing.JButton();
        btnTambah4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnTambah2 = new javax.swing.JButton();
        btnUbah2 = new javax.swing.JButton();
        btnHapus2 = new javax.swing.JButton();
        btnTambah5 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDataTertier = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnTambah3.setText("Refresh");
        btnTambah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah3ActionPerformed(evt);
            }
        });

        tblData.setModel(new javax.swing.table.DefaultTableModel(
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
        tblData.setFillsViewportHeight(true);
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        tblData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDataKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        tblDataSekunder.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDataSekunder.setFillsViewportHeight(true);
        tblDataSekunder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataSekunderMouseClicked(evt);
            }
        });
        tblDataSekunder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDataSekunderKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tblDataSekunder);

        btnTambah1.setText("Tambah");
        btnTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah1ActionPerformed(evt);
            }
        });

        btnUbah1.setText("Ubah");
        btnUbah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbah1ActionPerformed(evt);
            }
        });

        btnHapus1.setText("Hapus");
        btnHapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapus1ActionPerformed(evt);
            }
        });

        btnTambah4.setText("Refresh");
        btnTambah4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTambah1)
                        .addGap(5, 5, 5)
                        .addComponent(btnUbah1)
                        .addGap(5, 5, 5)
                        .addComponent(btnHapus1)
                        .addGap(5, 5, 5)
                        .addComponent(btnTambah4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTambah1)
                    .addComponent(btnUbah1)
                    .addComponent(btnHapus1)
                    .addComponent(btnTambah4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Jenis Servis", jPanel1);

        btnTambah2.setText("Tambah");
        btnTambah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah2ActionPerformed(evt);
            }
        });

        btnUbah2.setText("Ubah");
        btnUbah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbah2ActionPerformed(evt);
            }
        });

        btnHapus2.setText("Hapus");
        btnHapus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapus2ActionPerformed(evt);
            }
        });

        btnTambah5.setText("Refresh");
        btnTambah5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah5ActionPerformed(evt);
            }
        });

        tblDataTertier.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDataTertier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataTertierMouseClicked(evt);
            }
        });
        tblDataTertier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDataTertierKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(tblDataTertier);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTambah2)
                        .addGap(5, 5, 5)
                        .addComponent(btnUbah2)
                        .addGap(5, 5, 5)
                        .addComponent(btnHapus2)
                        .addGap(5, 5, 5)
                        .addComponent(btnTambah5)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTambah2)
                    .addComponent(btnUbah2)
                    .addComponent(btnHapus2)
                    .addComponent(btnTambah5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Servis Suku Cadang", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(beanData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addGap(5, 5, 5)
                                .addComponent(btnUbah)
                                .addGap(5, 5, 5)
                                .addComponent(btnHapus)
                                .addGap(5, 5, 5)
                                .addComponent(btnTambah3))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTambah)
                            .addComponent(btnUbah)
                            .addComponent(btnHapus)
                            .addComponent(btnTambah3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, 0, 0, Short.MAX_VALUE))
                    .addComponent(beanData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        tblDataController.setState(TableController.STATE_TAMBAH);

}//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        tblDataController.setState(TableController.STATE_UBAH);
}//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        tblDataController.performHapus();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambah3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah3ActionPerformed
    
    }//GEN-LAST:event_btnTambah3ActionPerformed

    private void tblDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDataKeyPressed
        fillSecondaryData();
}//GEN-LAST:event_tblDataKeyPressed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        fillSecondaryData();
}//GEN-LAST:event_tblDataMouseClicked

    private void tblDataSekunderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataSekunderMouseClicked
    // TODO add your handling code here:
}//GEN-LAST:event_tblDataSekunderMouseClicked

    private void tblDataSekunderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDataSekunderKeyPressed
    // TODO add your handling code here:
}//GEN-LAST:event_tblDataSekunderKeyPressed

    private void btnTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah1ActionPerformed
        tblDataSekunderController.performTambah();
    }//GEN-LAST:event_btnTambah1ActionPerformed

    private void btnUbah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbah1ActionPerformed
        tblDataSekunderController.performUbah();
    }//GEN-LAST:event_btnUbah1ActionPerformed

    private void btnHapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapus1ActionPerformed
        tblDataSekunderController.performHapus();
    }//GEN-LAST:event_btnHapus1ActionPerformed

    private void btnTambah4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah4ActionPerformed
        tblDataSekunderController.loadTable();
    }//GEN-LAST:event_btnTambah4ActionPerformed

    private void btnTambah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah2ActionPerformed
        tblDataTertierController.performTambah();
        
    }//GEN-LAST:event_btnTambah2ActionPerformed

    private void btnUbah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbah2ActionPerformed
        tblDataTertierController.performUbah();
    }//GEN-LAST:event_btnUbah2ActionPerformed

    private void btnHapus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapus2ActionPerformed
        tblDataTertierController.performHapus();
    }//GEN-LAST:event_btnHapus2ActionPerformed

    private void btnTambah5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah5ActionPerformed
        tblDataTertierController.loadTable();
    }//GEN-LAST:event_btnTambah5ActionPerformed

    private void tblDataTertierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataTertierMouseClicked
    // TODO add your handling code here:
}//GEN-LAST:event_tblDataTertierMouseClicked

    private void tblDataTertierKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDataTertierKeyPressed
    // TODO add your handling code here:
}//GEN-LAST:event_tblDataTertierKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private modules.servismobil.BeanServisMobil beanData;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHapus1;
    private javax.swing.JButton btnHapus2;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTambah1;
    private javax.swing.JButton btnTambah2;
    private javax.swing.JButton btnTambah3;
    private javax.swing.JButton btnTambah4;
    private javax.swing.JButton btnTambah5;
    private javax.swing.JButton btnUbah;
    private javax.swing.JButton btnUbah1;
    private javax.swing.JButton btnUbah2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTable tblDataSekunder;
    private javax.swing.JTable tblDataTertier;
    // End of variables declaration//GEN-END:variables
    public static TableController getTableController() {
        return getInstance().tblDataController;
    }
}
