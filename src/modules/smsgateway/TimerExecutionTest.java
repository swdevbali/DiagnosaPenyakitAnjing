/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modules.smsgateway;

import core.system.DB;
import modules.ReminderServisMobil;

/**
 *
 * @author Eko SW
 */
public class TimerExecutionTest {
    public static void main(String arg[]){
        DB.DB="pram";
        DB.PASSWORD="";
        ReminderServisMobil r = new ReminderServisMobil();
        r.executeTimer();
    }
}
