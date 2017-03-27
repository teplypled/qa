/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testselenium;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.openqa.grid.common.SeleniumProtocol.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

/**
 *
 * @author Maryna
 */
public class TestSel {
    
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
        
        ProfilesIni profiles = new ProfilesIni();
        
        
        FirefoxProfile profile = profiles.getProfile("WDS");
        profile.setPreference("permissions.default.image", 2); // заборона показувати картинки 2 -не показують, 1 - показують

        profile.setPreference("network.proxy.type", 1);
        profile.setPreference("network.proxy.type", "121.122.123.2");
        profile.setPreference("network.proxy.type", 8502);
        
        WebDriver webdr = new FirefoxDriver(profile); // можна прибоати profile якщо невідомий
        webdr.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); //очікування загрузки сторінки
        webdr.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS); //очікування загрузки скрипта
     
        
        webdr.get("http://www.ukr.net");
        WebElement someElement = webdr.findElement(by)// не дописано рядок!!!!!!!!!!!!!!!!!!
        String link = someElement.getAttribute("href");
        webdr.navigate().to(link);
        someElement.click();
        Thread.sleep(1000*20);
        
        
        
        Thread.sleep(20*1000);
               
        
        webdr.quit();
        
    }
    
}
