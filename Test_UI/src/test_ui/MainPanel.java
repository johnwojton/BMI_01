package test_ui;


import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wojton
 */
public class MainPanel extends JPanel
{
    JPanel CurrentPanel;
    JLabel Title;
    JPanel JP;
    MainPanel(JFrame JF, JPanel Panel, String Title)
    {
        JP = new JPanel();
        this.Title = new JLabel("");
        this.Title.setText(Title);
        JP.add(this.Title);
        CurrentPanel = Panel;
        this.setVisible(true);
       this.setSize(JF.getSize());
        this.setLayout(new BorderLayout());
        this.add(CurrentPanel, BorderLayout.CENTER);
        this.add(JP, BorderLayout.NORTH);
    }
    JPanel SetCurrentPanel(JPanel Panel, String Title)
    {
        this.Title.setText(Title);
        
      
        //JP.setBackground(Color.yellow);
        JP.setSize(50, 50);
        JP.setVisible(true);
        JP.add(this.Title);
        
        this.remove(CurrentPanel);
        this.removeAll();
        this.CurrentPanel = Panel;
        this.add(CurrentPanel, BorderLayout.CENTER);
        this.add(JP, BorderLayout.NORTH);
        repaint();
        this.revalidate();
        return CurrentPanel;
    }
}
