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
public class TestSel {
    
    public static void main(String[] args) throws InterruptedException{
       // regNewAccount();
        getSearchURL();
    }
        
        public static void regNewAccount() throws InterruptedException{ // метод що створює новий аккаунт на амазоні
        System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
        /*
        ProfilesIni profiles = new ProfilesIni();
        
        
        FirefoxProfile profile = profiles.getProfile("WDS");
        profile.setPreference("permissions.default.image", 1); // заборона показувати картинки 2 -не показують, 1 - показують

        /*profile.setPreference("network.proxy.type", 1);
        profile.setPreference("network.proxy.type", "121.122.123.2");
        profile.setPreference("network.proxy.type", 8502);
        */
        
        WebDriver webdr = new FirefoxDriver(); // можна прибоати profile якщо default
        webdr.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); //очікування загрузки сторінки
        webdr.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS); //очікування загрузки скрипта
     
        
        webdr.get("https://www.amazon.com/");
        WebElement newAccountElement = webdr.findElement(By.id("nav-flyout-ya-newCust"));
        WebElement newAccLinkElement = newAccountElement.findElement(By.tagName("a")); //теое з айді тег а
        String newAccLink = newAccLinkElement.getAttribute("href"); //в рядках 44-47 шукає лінка за АйДі реєстрації, дивитись прінт скріни!!!
       // System.out.println(newAccLink); // перевірка який лінк знайшло
        
        webdr.get(newAccLink); // перейшли на сторінку реєсьрації
        WebElement inputNameField = webdr.findElement(By.id("ap_customer_name"));
        inputNameField.sendKeys("Ignatenko Alexandr Borodach");
        
        WebElement inputEmailField = webdr.findElement(By.id("ap_email"));
        inputEmailField.sendKeys("abkj67rfra@gmail.com");
        
        WebElement inputPassField = webdr.findElement(By.id("ap_password"));
        inputPassField.sendKeys("1234567890");
        
        WebElement inputPassCheckField = webdr.findElement(By.id("ap_password_check"));
        inputPassCheckField.sendKeys("1234567890");
        
        
        
        WebElement regBtn = webdr.findElement(By.id("continue"));
        regBtn.click(); // натискання на кнопку "клік"
       
        Thread.sleep(1000*7); // зупинка в роботі сторінки на 20 секунд для перевірки логіна та пароля
        
        // тепер потрібно скачати урл сторінки шо отримана післі натискання на кнопку click
        
        String logginedPageLink = webdr.getCurrentUrl();
        webdr.get(logginedPageLink);
        
        Thread.sleep(1000*60); // зупинка в роботі сторінки на 20 секунд для перевірки логіна та пароля

        
        webdr.quit();
        
    }
        
        public static String getProveOfLogin(String email, String password) throws InterruptedException{ // 86 - 96 метод повертає строку і аідтверджує що ми таки створии новий аккаунт попереднім методом
        String logginedPage = "";
        
        System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe"); // кажемо веьдрайверу запустити брацзео
             
        WebDriver driver = new FirefoxDriver(); // можна прибоати profile якщо default
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); //очікування загрузки сторінки
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS); //очікування загрузки скрипта
     
        
        driver.get("https://www.amazon.com/");
        
        WebElement authLinkBtn = driver.findElement(By.id("nav-flyout-ya-signin"));
        WebElement authLinkElement = authLinkBtn.findElement(By.tagName("a"));
        String loginLink = authLinkElement.getAttribute("href");
        
        driver.get(loginLink); // лінк на сторінку авторизації, там є поле авторизазії
        
        WebElement inputEmailField = driver.findElement(By.id("ap_email"));
        inputEmailField.sendKeys(email);
        
        WebElement inputPassField = driver.findElement(By.id("ap_password"));
        inputPassField.sendKeys(password);
       
        
        WebElement authBtn = driver.findElement(By.id("signInSubmit"));
        authBtn.click(); // натискання на кнопку "клік"
       
        Thread.sleep(1000*5); // зупинка в роботі сторінки на 20 секунд для перевірки логіна та пароля
        
        // тепер потрібно скачати урл сторінки шо отримана післі натискання на кнопку click
        
        String logginedPageLink = driver.getCurrentUrl();
        driver.get(logginedPageLink);
        
        Thread.sleep(1000*10); // зупинка в роботі сторінки на 20 секунд 
        
        logginedPage = driver.getPageSource(); // змінна logginedPage зберінає всю інформаці. за сторінки на яку ми потрапляємо після реєстрації (там де пише Hello? name!

        return logginedPage;
            
        }
        
        // Метод пошуку урла товара на Амазоні в полі пошуку
        public static  String getSearchURL() throws InterruptedException{ // метод що створює новий аккаунт на амазоні
            String searchURL = "";
            System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");

        WebDriver webdrAmazon = new FirefoxDriver();
        webdrAmazon.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
        webdrAmazon.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS); 
        
        webdrAmazon.get("https://www.amazon.com/");
        
        WebElement inputField = webdrAmazon.findElement(By.id("twotabsearchtextbox"));
        inputField.sendKeys("toys");
        webdrAmazon.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
        
        try{
            Thread.sleep(1000*6);
        } catch (InterruptedException e){
            e.printStackTrace();
            webdrAmazon.quit();
            getSearchURL();
        } // зупинка в роботі сторінки на 15 секунд 
        
        WebElement searchBtnBlock = webdrAmazon.findElement(By.id("nav-search-submit-text"));
        
        searchBtnBlock.click();
        
        try{
            Thread.sleep(1000*5);
        } catch (InterruptedException e){
            e.printStackTrace();
            webdrAmazon.quit();
            getSearchURL();
        } // зупинка в роботі сторінки на 5 секунд 
        
        String currentURL = webdrAmazon.getCurrentUrl();
        webdrAmazon.get(currentURL);
        
        WebElement nextPageLink = webdrAmazon.findElement(By.id("pagnNextLink"));
        String nextPageHREF = nextPageLink.getAttribute("href");
        webdrAmazon.get(nextPageHREF);
        
        nextPageLink.click();
        
         try{
            Thread.sleep(1000*6);
        } catch (InterruptedException e){
            e.printStackTrace();
            webdrAmazon.quit();
            getSearchURL();
        } // зупинка в роботі сторінки на 5 секунд 
        
        currentURL = webdrAmazon.getCurrentUrl();
        webdrAmazon.get(currentURL);
        
         try{
            Thread.sleep(1000*6);
        } catch (InterruptedException e){
            e.printStackTrace();
            webdrAmazon.quit();
            getSearchURL();
        } // зупинка в роботі сторінки на 5 секунд 
         
        searchURL = webdrAmazon.getCurrentUrl();
        
          try{
            Thread.sleep(1000*3);
        } catch (InterruptedException e){
            e.printStackTrace();
            webdrAmazon.quit();
            getSearchURL();
        } // зупинка в роботі сторінки на 5 секунд 
        
        webdrAmazon.quit();
        

        return searchURL;
         
    }

    
}
