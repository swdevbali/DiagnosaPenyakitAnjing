
package modules.pasien;

import core.gui.InputPanel;
import javax.swing.JOptionPane;
import modules.ApplicationStartup;

/**
 *
 * @author  PRAM WEE
 */
public class BeanPasien extends InputPanel {

    /** Creates new form BeanForm */
    public BeanPasien() {
        initComponents();
        super.setPnlUtama(pnlUtama);
        ApplicationStartup.getInstance().initialize();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUtama = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNama = new core.dataview.JTextFieldEx();
        txtAlamat = new core.dataview.JTextFieldEx();
        txtHP = new core.dataview.JTextFieldEx();

        jLabel3.setText("Nama");

        jLabel5.setText("Handphone");

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabel7.setText("Alamat");

        txtNama.setText("jTextFieldEx1");
        txtNama.setFieldName("nama");

        txtAlamat.setText("jTextFieldEx1");
        txtAlamat.setFieldName("alamat");

        txtHP.setText("jTextFieldEx1");
        txtHP.setFieldName("hp");

        javax.swing.GroupLayout pnlUtamaLayout = new javax.swing.GroupLayout(pnlUtama);
        pnlUtama.setLayout(pnlUtamaLayout);
        pnlUtamaLayout.setHorizontalGroup(
            pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUtamaLayout.createSequentialGroup()
                        .addComponent(btnOK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal)
                        .addGap(110, 110, 110))
                    .addGroup(pnlUtamaLayout.createSequentialGroup()
                        .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(68, 68, 68)
                        .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHP, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pnlUtamaLayout.setVerticalGroup(
            pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUtamaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7))
                    .addGroup(pnlUtamaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal)
                    .addComponent(btnOK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        super.performOK();
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        super.performCancel();
    }//GEN-LAST:event_btnBatalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel pnlUtama;
    private core.dataview.JTextFieldEx txtAlamat;
    private core.dataview.JTextFieldEx txtHP;
    private core.dataview.JTextFieldEx txtNama;
    // End of variables declaration//GEN-END:variables

    @Override
    public void fillControl(String[][] data) {
    }

    @Override
    public boolean validateAllControls() {
        boolean lolos;
        lolos = true;
        double d;

        try {
            d = Integer.parseInt(txtNama.getSQLValue());
            lolos = false;
        } catch (java.lang.NumberFormatException ex) {
            ex.printStackTrace();
            //bener
        }
        
        try {
            d = Integer.parseInt(txtAlamat.getSQLValue());
            lolos = false;
        } catch (java.lang.NumberFormatException ex) {
            ex.printStackTrace();
        }

        if (lolos) {
            if (txtAlamat.getSQLValue().equals("") && txtAlamat.getSQLValue().length() <= 2) {
                return false;
            }

            if (txtHP.getSQLValue().equals("") && txtHP.getSQLValue().length() <= 2) {
                return false;
            }
            if (txtNama.getSQLValue().equals("") && txtNama.getSQLValue().length() <= 2) {
                return false;
            }
           
        }else return false;

        return true;


    }

    @Override
    public void clearField() {
        txtNama.requestFocus();
    }

    @Override
    public void setVisible(boolean aFlag) {
        if (aFlag) {
        }
        super.setVisible(aFlag);
    }

    @Override
    protected String delegateGetInsertSql() {
        return "insert into pasien(nama," +
                "alamat,HP)" +
                "values('" +
                txtNama.getText() + "','" +
                txtAlamat.getText() + "','" +
                txtHP.getText() + "')";
    }

    @Override
    protected String delegateGetUpdateSql(String rowId) {
        return "update pasien set nama='" + txtNama.getText() + "'," +
                "alamat='" + txtAlamat.getText() + "'," +
                "hp='" + txtHP.getText() + "'" +
              
                " where idpasien=" + rowId;
    }

    @Override
    protected void afterInsert() {
        super.afterInsert();
        
    }

    @Override
    protected void afterUpdate(String rowToBeEdited) {
        super.afterUpdate(rowToBeEdited);
    }
    
}
