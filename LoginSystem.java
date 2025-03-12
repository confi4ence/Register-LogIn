/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginsystem;

import static java.lang.ProcessHandle.current;
import javax.swing.JOptionPane;

/**
 *
 * @author Confidence
 */
public class LoginSystem {

    public static void main(String[] args) {
        UserName_And_Password userNamePassword = new  UserName_And_Password();
        
        
      String name = JOptionPane.showInputDialog("Please enter your name : ");
      String surname = JOptionPane.showInputDialog("Please enter your surname : ");
      String UserName = JOptionPane.showInputDialog("Please enter your userName : ");
      String Password = JOptionPane.showInputDialog("Please enter your password : ");
        
      
      if(UserName.length()>=5){
          JOptionPane.showMessageDialog(null, "UserName successfully captured");
      }
      else
      {
      JOptionPane.showMessageDialog(null," UserName is not correctly formatted,please ensure that your username contains an underscore and is no more than 5 charcters in length ");
      }
      
      {
          if(Password.length() >=8){
          for (int i =0; i < Password.length(); i++){
              char current = Password.charAt(i);

                if(Character.isDigit(current)){
                  boolean hasNumber = true;
                }
                else if(Character.isUpperCase(current)){
                  boolean hasCapitalLetter = true;
                }
                else if (!(Character.isLetterOrDigit(current))){
                  boolean hasCharracter = true;
      }
      
        LoginPage loginPage = new LoginPage( userNamePassword.getLoginInfo());
    }
          }
      }
        boolean hasCapitalLetter = false;
        boolean hasCharracter = false;
        boolean hasNumber = false;
      if(hasNumber && hasCapitalLetter && hasCharracter){
            boolean isPasswordOkay = true;
        }
        
    }}
         
         
