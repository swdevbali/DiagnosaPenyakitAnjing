
package modules;

import core.auth.Authentication;
import core.auth.AuthenticationListener;

import core.system.ApplicationInfo;
import core.system.LoginDialog;
import core.system.PrivilegeDialog;
import core.user.UserManajemen;
import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author PRAM WEE
 */
public class MainFrame extends javax.swing.JFrame implements AuthenticationListener {

    private static MainFrame instance;

    private MainFrame() {
        setExtendedState(Frame.MAXIMIZED_BOTH);
        initComponents();
        setTitle(ApplicationInfo.TITLE + " Versi " + ApplicationInfo.VERSION + " oleh " + ApplicationInfo.AUTHOR);
        scrollUtama.setViewportView(ServisMobil.getInstance());

    }

    public static MainFrame getInstance() {
        if (instance == null) {
            instance = new MainFrame();
            core.auth.Authentication.getInstance().registerListener(MainFrame.getInstance());
        }
        return instance;
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar6 = new javax.swing.JToolBar();
        jButton8 = new javax.swing.JButton();
        scrollUtama = new javax.swing.JScrollPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        mnuSistem = new javax.swing.JMenu();
        mnuManajemenPemakai = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuHome = new javax.swing.JMenuItem();
        mnuPelanggan = new javax.swing.JMenuItem();
        mnuMobil = new javax.swing.JMenuItem();
        mnuSukuCadang = new javax.swing.JMenuItem();
        mnuItemServis = new javax.swing.JMenuItem();
        mnuServisMobil = new javax.swing.JMenuItem();
        mnuInbox = new javax.swing.JMenuItem();
        mnuOutbox = new javax.swing.JMenuItem();
        mnuLog = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Informasi Kepegawaian Purworejo Versi 1.0");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setName("frameMain"); // NOI18N
        setState(Frame.MAXIMIZED_BOTH);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        jToolBar6.setRollover(true);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/images/KoneksiKlaster.jpg"))); // NOI18N
        jButton8.setText("Pairwise Klaster");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar6.add(jButton8);

        scrollUtama.setBorder(null);

        mnuSistem.setMnemonic('f');
        mnuSistem.setText("File");

        mnuManajemenPemakai.setText("Manajemen Pemakai");
        mnuManajemenPemakai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManajemenPemakaiActionPerformed(evt);
            }
        });
        mnuSistem.add(mnuManajemenPemakai);

        jMenuItem6.setText("Logout");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mnuSistem.add(jMenuItem6);

        jMenuItemExit.setMnemonic('x');
        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        mnuSistem.add(jMenuItemExit);

        jMenuBar2.add(mnuSistem);

        jMenu4.setText("Modul");

        mnuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.gif"))); // NOI18N
        mnuHome.setText("Home");
        mnuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHomeActionPerformed(evt);
            }
        });
        jMenu4.add(mnuHome);

        mnuPelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pelanggan.gif"))); // NOI18N
        mnuPelanggan.setText("Pelanggan");
        mnuPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPelangganActionPerformed(evt);
            }
        });
        jMenu4.add(mnuPelanggan);

        mnuMobil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/obat.gif"))); // NOI18N
        mnuMobil.setText("Mobil");
        mnuMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMobilActionPerformed(evt);
            }
        });
        jMenu4.add(mnuMobil);

        mnuSukuCadang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log.gif"))); // NOI18N
        mnuSukuCadang.setText("Suku Cadang");
        mnuSukuCadang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSukuCadangActionPerformed(evt);
            }
        });
        jMenu4.add(mnuSukuCadang);

        mnuItemServis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pemesanan.gif"))); // NOI18N
        mnuItemServis.setText("Item Servis");
        mnuItemServis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemServisActionPerformed(evt);
            }
        });
        jMenu4.add(mnuItemServis);

        mnuServisMobil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/glycerol_a.gif"))); // NOI18N
        mnuServisMobil.setText("Servis Mobil");
        mnuServisMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuServisMobilActionPerformed(evt);
            }
        });
        jMenu4.add(mnuServisMobil);

        mnuInbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inbox.gif"))); // NOI18N
        mnuInbox.setText("Riwayat Servis");
        mnuInbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInboxActionPerformed(evt);
            }
        });
        jMenu4.add(mnuInbox);

        mnuOutbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/outbox.gif"))); // NOI18N
        mnuOutbox.setText("Outbox");
        mnuOutbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOutboxActionPerformed(evt);
            }
        });
        jMenu4.add(mnuOutbox);

        mnuLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log.gif"))); // NOI18N
        mnuLog.setText("Log");
        mnuLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLogActionPerformed(evt);
            }
        });
        jMenu4.add(mnuLog);

        jMenuBar2.add(jMenu4);

        jMenu3.setText("SMS Gateway");

        jMenuItem3.setText("Connect..");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Broadcast..");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar2.add(jMenu3);

        jMenu2.setMnemonic('h');
        jMenu2.setText("Help");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/images/KoneksiNode.jpg"))); // NOI18N
        jMenuItem2.setMnemonic('a');
        jMenuItem2.setText("About");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollUtama, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollUtama, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-723)/2, (screenSize.height-567)/2, 723, 567);
    }// </editor-fold>//GEN-END:initComponents
    private void formWindowStateChanged (java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
// TODO add your handling code here:

    }//GEN-LAST:event_formWindowStateChanged

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void mnuSukuCadangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSukuCadangActionPerformed
        ServisMobil.getInstance().setModul(3);
}//GEN-LAST:event_mnuSukuCadangActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        AboutBox.getInstance().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mnuManajemenPemakaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManajemenPemakaiActionPerformed
        if (PrivilegeDialog.getInstance().isCorrect()) {
            UserManajemen.getInstance().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Root password tidak sesuai");
        }
}//GEN-LAST:event_mnuManajemenPemakaiActionPerformed

    private void mnuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHomeActionPerformed
        ServisMobil.getInstance().setModul(0);
}//GEN-LAST:event_mnuHomeActionPerformed

    private void mnuPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPelangganActionPerformed
        ServisMobil.getInstance().setModul(1);
}//GEN-LAST:event_mnuPelangganActionPerformed

    private void mnuMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMobilActionPerformed
        ServisMobil.getInstance().setModul(2);
}//GEN-LAST:event_mnuMobilActionPerformed

    private void mnuInboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInboxActionPerformed
        ServisMobil.getInstance().setModul(5);
}//GEN-LAST:event_mnuInboxActionPerformed

    private void mnuOutboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOutboxActionPerformed
        ServisMobil.getInstance().setModul(6);
}//GEN-LAST:event_mnuOutboxActionPerformed

    private void mnuLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLogActionPerformed
        ServisMobil.getInstance().setModul(7);
}//GEN-LAST:event_mnuLogActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.setVisible(false);
        LoginDialog.getInstance().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void mnuItemServisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemServisActionPerformed
        ServisMobil.getInstance().setModul(9);
    }//GEN-LAST:event_mnuItemServisActionPerformed

    private void mnuServisMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuServisMobilActionPerformed
        ServisMobil.getInstance().setModul(10);
}//GEN-LAST:event_mnuServisMobilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JToolBar jToolBar6;
    private javax.swing.JMenuItem mnuHome;
    private javax.swing.JMenuItem mnuInbox;
    private javax.swing.JMenuItem mnuItemServis;
    private javax.swing.JMenuItem mnuLog;
    private javax.swing.JMenuItem mnuManajemenPemakai;
    private javax.swing.JMenuItem mnuMobil;
    private javax.swing.JMenuItem mnuOutbox;
    private javax.swing.JMenuItem mnuPelanggan;
    private javax.swing.JMenuItem mnuServisMobil;
    private javax.swing.JMenu mnuSistem;
    private javax.swing.JMenuItem mnuSukuCadang;
    private javax.swing.JScrollPane scrollUtama;
    // End of variables declaration//GEN-END:variables
    public void userLogin() {
        if(Authentication.getInstance().getUserInfo().getRole().equalsIgnoreCase("administrator")){
            mnuManajemenPemakai.setVisible(true);
        }else{
            mnuManajemenPemakai.setVisible(false);
        }
        this.setVisible(true);
    }

    public void userNotLogin() {

    }
}
