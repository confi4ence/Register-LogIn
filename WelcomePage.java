/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginsystem;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Confidence
 */
class WelcomePage {
    
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Welcome!");
    
    WelcomePage(String userName){
        
        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeLabel.setText("Welcome"+userName + "It is great to see you again");//This is a feedback given to a user
        
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(10,20);
        frame.setLayout(null);
        frame.setVisible(true);
} 
}
