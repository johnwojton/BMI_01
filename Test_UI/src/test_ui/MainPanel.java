package test_ui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
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
    JFrame JF;
    JPanel CurrentPanel;
    JLabel Title;
    JPanel JP;
    double ScreenHeight;
    double ScreenWidth;
    MainPanel(JFrame JF, JPanel Panel, String Title)
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        ScreenWidth = screenSize.getWidth();
        ScreenHeight = screenSize.getHeight();
        
        JP = new JPanel();
        this.JF = JF;
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
   
    JPanel SetCurrentPanel(JPanel Panel, String Title, int sizex, int sizey)
    {
        
        this.Title.setText(Title);
        
      
        //JP.setBackground(Color.yellow);
       // JP.setSize(50, 50);
       
       if(sizex > 0 && sizey > 0)
       {
           JP.setSize(sizex, sizey);
       }
       else if (sizex == -1 && sizey == -1)
       {
           JP.setSize((int)ScreenWidth, (int)ScreenHeight);
       }
       else
       {
           JP.setSize(sizex, sizey);
       }
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
