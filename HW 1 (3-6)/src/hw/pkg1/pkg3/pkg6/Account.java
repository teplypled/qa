/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw.pkg1.pkg3.pkg6;
import java.util.*;
import java.text.*;

/**
 *
 * @author Maryna В коментах моє завдання Account
 
public class Account {
    private String login;
    private final String PASSWORD;
    public String date;
    
      
    public static String settingLogin(){
        String login = HW136.constructorMail2();
        
        return login;    
    }
    
    public static String settingPassword(){
        String PASSWORD = "PASSWORD";
        
        return PASSWORD;
    }
    public static String settingDate(){
        Date date = new Date();
        return date.toString();

    }  
    
    public Account()
    {
        this.login = settingLogin();
        PASSWORD = settingPassword();
        date = settingDate();
    }
    
    public String getInfoLogin()
    {
        return login;
    }
    public String getInfoPass()
    {
        return PASSWORD;
    }
    public String getInfoDate()
    {
        return date;
    }
}
* */

// нижче - завдання написане в класі
    public class Account {
        private String name; //поле потому что написано не в методе а в классе
        private String login;
        private String password;
        private long dateLastLogging;
        private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getDateLastLogging() {
        return dateLastLogging;
    }

    public void setDateLastLogging(long dateLastLogging) {
        this.dateLastLogging = dateLastLogging;
    }
    
    public String getType () {
        return this.type;
    }
        
    public void setType(String type){
        if (type == "student" || type == "teacher"){
            this.type = type;
        }
    }
}
        
    
