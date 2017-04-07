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
    MainPanel(JFrame JF, JPanel Panel)
    {
        Title = new JLabel("Hello");
        
        CurrentPanel = Panel;
        this.setVisible(true);
       this.setSize(JF.getSize());
        this.setLayout(new BorderLayout());
        this.add(CurrentPanel, BorderLayout.CENTER);
    }
    JPanel SetCurrentPanel(JPanel Panel, String Title)
    {
        this.Title.setText(Title);
        JPanel JP = new JPanel();
      
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
