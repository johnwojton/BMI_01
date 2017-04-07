/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_ui;

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
        
        
        for(int i = 0;i < 2; i++)
        {
            JPanel JP = new MainPanel();
            TM[i] = new ThreadManager(JP);
        TM[i].start();
        }
        
        // TODO code application logic here
    }
    
}
