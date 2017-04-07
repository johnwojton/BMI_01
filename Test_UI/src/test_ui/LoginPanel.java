/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author wojton
 */
public class LoginPanel extends JPanel implements ActionListener
{
    MainPanel Parent;
    GridBagConstraints gbc = new GridBagConstraints();
    JLabel     UserNameLabel;
    JLabel     PasswordLabel;
    JTextField EnterUserName;
    JTextField EnterPassword;
    JButton    SignIn;
    JButton    Register;
    XMLFileController XML;
     LoginPanel()
     {

        setLayout(new GridBagLayout());
        
        this.setVisible(true);
        InitVar();
               
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.anchor = GridBagConstraints.LINE_END;
                this.add(UserNameLabel, gbc);
                
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.ipadx = 50;
                gbc.anchor = GridBagConstraints.LINE_START;
                this.add(EnterUserName, gbc);
                     
                gbc.gridx = 0;
                gbc.gridy = 1;
                gbc.ipadx = 0;
                gbc.anchor = GridBagConstraints.LINE_END;
                this.add(PasswordLabel, gbc);
                
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.ipadx = 50;
                gbc.anchor = GridBagConstraints.LINE_START;
                this.add(EnterPassword, gbc);
                
                gbc.gridx = 0;
                gbc.gridy = 2;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.anchor = GridBagConstraints.LINE_END;
                gbc.gridwidth = 2;
                this.add(SignIn, gbc);
                
                gbc.gridx = 0;
                gbc.gridy = 3;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.anchor = GridBagConstraints.LINE_END;
                gbc.gridwidth = 2;
                this.add(Register, gbc);

     }
     
     void InitVar()
     {
           UserNameLabel = new JLabel("User Name");
           PasswordLabel = new JLabel("Password");
           EnterUserName = new JTextField();
           EnterPassword = new JTextField();
           SignIn        = new JButton("Sign in");
           Register      = new JButton("Register");
           XML           = new XMLFileController();
           
           SignIn.addActionListener(this);
           Register.addActionListener(this);
        
     }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        Object O = ae.getSource();
        if(O == this.SignIn)
        {
           //XMLFileController.XMLReader(TOOL_TIP_TEXT_KEY)
            
        }
        else if (O == this.Register)
        {
          RegisterPanel RP = new RegisterPanel();
         Parent.SetCurrentPanel(RP, "Registration");
        }
    }
    
    public void setParent(MainPanel Parent)
    {
        this.Parent = Parent;
    }

   
}
