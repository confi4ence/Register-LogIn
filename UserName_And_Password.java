/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginsystem;

import java.util.HashMap;

/**
 *
 * @author Confidence
 */
class UserName_And_Password {
     
    HashMap<String,String> logininfo = new HashMap<String,String>();
    
    UserName_And_Password(){//Test username and password 
        logininfo.put("Kyl_1","Password@@1");
         logininfo.put("Use_r","People@12");
          logininfo.put("Kyl_2","@Person&01");
          logininfo.put("", "");
    }
    protected HashMap getLoginInfo(){
        return logininfo;
        
    }}
