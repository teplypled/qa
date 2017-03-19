package schedule;
import java.util.*;


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
