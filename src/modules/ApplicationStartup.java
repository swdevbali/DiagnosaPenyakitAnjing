
package modules;

import core.system.ApplicationInfo;
import core.system.DB;
import core.system.LoggingWindow;
import core.system.LoginDialog;
import core.system.SplashFrame;
import core.system.Startup;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author PRAM WEE
 */
public class ApplicationStartup {

    private static ApplicationStartup instance;

    public static ApplicationStartup getInstance() {
        if (instance == null) {
            instance = new ApplicationStartup();
        }
        return instance;
    }

    public static void main(String arg[]) {
        try {
            Startup.getInstance().setLookAndFeel(Startup.ALLOY_LAF);
            Startup.getInstance().setUIFont(new javax.swing.plaf.FontUIResource("Tahoma",Font.PLAIN,11));
            LoggingWindow.getInstance().addToLog("System Startup");
            UIManager.setLookAndFeel(Startup.getInstance().getLookAndFeel());
            getInstance().initialize();
            LoggingWindow.getInstance().addToLog("Main Window Initialization");
            Startup.getInstance().setMainFrame(MainFrame.getInstance());
            SplashFrame.splashIcon = new ImageIcon(MainFrame.getInstance().getClass().getResource("/images/Splash.jpg"));
            Startup.getInstance().setDisplaySplash(false);
            Startup.BYPASS_PASSWORD=true;
            Startup.getInstance().start();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ApplicationStartup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ApplicationStartup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ApplicationStartup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ApplicationStartup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void initialize() {
        ApplicationInfo.TITLE = "Aplikasi Diagnosa Penyakit Anjing";
        ApplicationInfo.AUTHOR = "Yuli";
        ApplicationInfo.VERSION = "2011";
        ApplicationInfo.ROOT_PASSWORD = "yuli";
        ApplicationInfo.OFFICIAL_NAME = "Aplikasi Diagnosa Penyakit Anjing";
        DB.USE_MYSQL = true;
        DB.DB = "yuli";
        DB.PASSWORD = "adminadmin";
        
        LoginDialog.idpemakai="idpemakai";
    }
}
