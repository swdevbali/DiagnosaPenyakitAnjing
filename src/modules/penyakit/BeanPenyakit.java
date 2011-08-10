
package modules.penyakit;

import core.gui.InputPanel;
import javax.swing.JOptionPane;
import modules.ApplicationStartup;

/**
 *
 * @author  PRAM WEE
 */
public class BeanPenyakit extends InputPanel {

    /** Creates new form BeanForm */
    public BeanPenyakit() {
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
        btnBatal = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNamaPenyakit = new core.dataview.JTextFieldEx();
        txtDeskripsi = new core.dataview.JTextFieldEx();

        jLabel3.setText("Nama Penyakit");

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

        jLabel7.setText("Deskripsi");

        txtNamaPenyakit.setText("jTextFieldEx1");
        txtNamaPenyakit.setFieldName("nama_penyakit");

        txtDeskripsi.setText("jTextFieldEx1");
        txtDeskripsi.setFieldName("deskripsi");

        javax.swing.GroupLayout pnlUtamaLayout = new javax.swing.GroupLayout(pnlUtama);
        pnlUtama.setLayout(pnlUtamaLayout);
        pnlUtamaLayout.setHorizontalGroup(
            pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(68, 68, 68)
                .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUtamaLayout.createSequentialGroup()
                        .addComponent(btnOK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal))
                    .addComponent(txtDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlUtamaLayout.setVerticalGroup(
            pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNamaPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUtamaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7))
                    .addGroup(pnlUtamaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel pnlUtama;
    private core.dataview.JTextFieldEx txtDeskripsi;
    private core.dataview.JTextFieldEx txtNamaPenyakit;
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
            d = Integer.parseInt(txtNamaPenyakit.getSQLValue());
            lolos = false;
        } catch (java.lang.NumberFormatException ex) {
            ex.printStackTrace();
            //bener
        }
        
        try {
            d = Integer.parseInt(txtDeskripsi.getSQLValue());
            lolos = false;
        } catch (java.lang.NumberFormatException ex) {
            ex.printStackTrace();
        }

        if (lolos) {
            if (txtDeskripsi.getSQLValue().equals("") && txtDeskripsi.getSQLValue().length() <= 2) {
                return false;
            }

          
            if (txtNamaPenyakit.getSQLValue().equals("") && txtNamaPenyakit.getSQLValue().length() <= 2) {
                return false;
            }
           
        }else return false;

        return true;


    }

    @Override
    public void clearField() {
        txtNamaPenyakit.requestFocus();
    }

    @Override
    public void setVisible(boolean aFlag) {
        if (aFlag) {
        }
        super.setVisible(aFlag);
    }

    @Override
    protected String delegateGetInsertSql() {
        return "insert into penyakit(nama_penyakit," +
                "deskripsi)" +
                "values('" +
                txtNamaPenyakit.getText() + "','" +
                txtDeskripsi.getText() + "'" +
                ")";
    }

    @Override
    protected String delegateGetUpdateSql(String rowId) {
        return "update penyakit set nama_penyakit='" + txtNamaPenyakit.getText() + "'," +
                "deskripsi='" + txtDeskripsi.getText() + "' " +
                
                " where idpenyakit=" + rowId;
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