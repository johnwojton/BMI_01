/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_ui;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author wojton
 */
public class ThreadManager extends Thread
{
    JPanel ThreadPanel; 
    ThreadManager(JPanel Panel)
    {
        ThreadPanel = Panel;
    }
    public void run()
    {
        JFrame JF = new JFrame();
        //MainPanel JP = new MainPanel();
       JF.setDefaultCloseOperation(EXIT_ON_CLOSE );
        JF.add(ThreadPanel);
        JF.setVisible(true);
        JF.setBounds(0, 0, 1000, 1000);
       
      
    }
}
