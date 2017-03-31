/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selamazon;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.openqa.grid.common.SeleniumProtocol.WebDriver;
import org.openqa.selenium.By;
import static org.openqa.selenium.By.className;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

/**
 *
 * @author Maryna
 */
public class SelAmazon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        findingAmazon();
    }
    
    public static  String findingAmazon() throws InterruptedException{ // метод що створює новий аккаунт на амазоні
            System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");

        WebDriver webdr = new FirefoxDriver();
        webdr.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
        webdr.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS); 
        
        webdr.get("https://www.amazon.com/");
        
        System.out.println(webdr);
        return webdr;
         
    }

}
