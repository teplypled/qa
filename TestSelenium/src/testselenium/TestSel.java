/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testselenium;

import java.util.logging.Level;
import java.util.logging.Logger;
import static org.openqa.grid.common.SeleniumProtocol.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Maryna
 */
public class TestSel {
    
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
        
        WebDriver webdr = new FirefoxDriver();
        try {
            Thread.sleep(20*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestSel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        webdr.quit();
        
    }
    
}
