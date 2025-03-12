/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Confidence
 */

    
public class LoginPage implements ActionListener{
    JFrame frame = new JFrame();
    JButton LoginButton = new JButton("Login ");
     JButton resetButton = new JButton(" Reset ");
     JTextField userNameField = new JTextField();
     JPasswordField userPasswordField = new JPasswordField();
     JLabel userNameLabel = new JLabel("userName");
     JLabel userPasswordLabel = new JLabel("password");
     JLabel messageLabel = new JLabel();
   
     HashMap<String,String> logininfo = new HashMap<String,String>();
    
    LoginPage(HashMap<String,String> loginInfoOriginal){
        
      logininfo = loginInfoOriginal;
      
      userNameLabel.setBounds(50,100,75,25);
      userPasswordLabel.setBounds(50,150,75,25);
      
      messageLabel.setBounds(125,250,250,35);
      messageLabel.setFont(new Font (null,Font.ITALIC,25));
      
      userNameField.setBounds(125,100,200,25);
      userPasswordField.setBounds(125,150,200,25);
      
      LoginButton.setBounds(125,200,100,25);
      LoginButton.setFocusable(false);
      LoginButton.addActionListener(this);
      
       resetButton.setBounds(225,200,100,25);
       resetButton.setFocusable(false);
      resetButton.addActionListener(this);
      
      
      //This is for adding frame and its measurements
      frame.add(userNameLabel);
      frame.add(userPasswordLabel);
      frame.add(messageLabel);
     frame.add(userNameField);
     frame.add(userPasswordField);
     frame.add(LoginButton);
     frame.add(resetButton);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(420, 420);
       frame.setLayout(null);
       frame.setVisible(true);
   }

    

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==resetButton){
           userNameField.setText("");
           userPasswordField.setText("");
       }
       if(e.getSource()==LoginButton){
           String userName = userNameField.getText();
           String password = String.valueOf(userPasswordField.getPassword());
           if(logininfo.containsKey(userName)){
               if(logininfo.get(userName).contentEquals(password)){
                   JOptionPane.showMessageDialog(resetButton, "LOGIN SUCCESSFUL");
                   
                   frame.dispose();
                   WelcomePage welcomePage = new WelcomePage(userName);
               }
               else{
                 messageLabel.setForeground(Color.pink);
                 JOptionPane.showMessageDialog(resetButton, "Incorrect password or username ,please try again");
                  
                   
               } 
           }
           else{
            messageLabel.setForeground(Color.pink);
            JOptionPane.showMessageDialog(resetButton, "Username is not correctly formatted");
             
       }
       }
       
    }}
