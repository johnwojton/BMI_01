/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

/**
 *
 * @author wojton
 */
public class RightMenuPanel extends JPanel
{
    GridBagConstraints gbc = new GridBagConstraints();
    JButton BMI;
    JButton WtHRatio;
    JButton BFP;
    JButton BMR;
    MainPanel Parent;
    RightMenuPanel()
    {
        this.setBackground(Color.yellow);
        this.setVisible(true);
         InitVar();
         setLayout(new GridBagLayout());
         this.add(BMR, gbc);
         this.add(BMR, gbc);
         this.add(BMR, gbc);
         this.add(BMR, gbc);
    }
    private void InitVar()
    {
         BMI = new JButton("BMI");
        WtHRatio = new JButton("Waist to Height Ratio");
        BFP = new JButton("Body Fat Percentage");
        BMR = new JButton("Basal Metabolic Rate");
    }
     public void setParent(MainPanel Parent)
    {
        this.Parent = Parent;
    }

   
}