/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_ui;

import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 *
 * @author wojton
 */

public  class Test_UI {
static ThreadManager TM[] = new ThreadManager[100];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame JF = new JFrame("BMI");
        MainPanel MainPanel;
        LoginPanel Login;
        for(int i = 0;i < 1; i++)
        {
            Login = new LoginPanel();
            MainPanel = new MainPanel(JF, Login, "Log in");
            Login.setParent(MainPanel);
            TM[i] = new ThreadManager(JF,MainPanel);
            TM[i].start();
        }
        
        // TODO code application logic here
    }
    
}
