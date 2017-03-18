
package hw.pkg1.pkg3.pkg6;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Collection.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author Maryna
 */
public class HW136 {

    /**
Написать метод, который в случайном порядке будет создавать строку из латинского алфавита
* (как заглавные, иак и не заглавные буквы) и возвращать её. 
* Длина строки тоже должна в случайном порядке менятся от 8 до 16 символов.

[10:41]  
Написать тест к нему     */
    private static Logger logger = Logger.getLogger(HW136.class.getName());//замість System.out.Println пишемо перед main, 

    
    public static void main(String[] args) {
        // МОЄ ЗАВДАННЯ 3
        String a = gettingString();
        System.out.println(a);
        //logger.log(Level.INFO, "Result of GETTING_STRING is : " + a);
        
        // ПИСАЛИ В КЛАССІ ЗАВДАННЯ 3, 4
        String randomString = getRandomString();
        System.out.println(randomString);
        //logger.log(Level.INFO, "Result of getRandomString is :  " + randomString);
        
        //4 та 5- завдання в классі
        String editedString = addingAtToRandomString(randomString);
        ArrayList<String> rndStrings = new ArrayList();
        //logger.log(Level.INFO, "Result of addingAtToRandomString is :  " + editedString);
        
        StringCollection strCollection = new StringCollection();
        for(int i = 0; i < 10; i++){
            strCollection.addToStrCollection(getRandomAccEmail(addingAtToRandomString(getRandomString()))); //додає в коллекцію строки з собачкою (4 завдання) і обраним доменним ім'ям (5 завдання)
        }
        
        ArrayList<String> someCol = strCollection.getAllRndStrings();
            for (String elementOfCollection: someCol){
            logger.log(Level.INFO, "Element is - " +elementOfCollection);
        }
        
        // кінець 3, 4, 5-го
        
        // МОЄ ЗАВДАННЯ 4
        ArrayList<String> col = creatingCollection();
        logger.log(Level.INFO, "Result of CREATING_COLLECTION is :  " + col);
        
        ArrayList<String> sh = col;        
        System.out.println("===============" + sh);
        
        Collection myShuffle = shaffleCollection(sh);
        System.out.println("===============" + myShuffle);
        
     /*   Моє завдання 6 - Account
        String myMail = constructorMail();
        logger.log(Level.INFO, "Result of CONCTRUCTOR_Mail is " + myMail);
        
        String domainForMail = getRandomMail2();
        // logger.log(Level.INFO, "Result of GET_RANDOM_MAIL2 is " + domainForMail);       
                
        String myMail2 = constructorMail2();
       // logger.log(Level.INFO, "Result of CONCTRUCTOR_Mail is " + myMail2);
        
        String date = Account.settingDate();
       // logger.log(Level.INFO, "Result of GETTING_DATE is " + date);
        
        String login = Account.settingLogin();
       // logger.log(Level.INFO, "Result of GETTING_LOGIN is " + login);
        
        String PASSWORD = Account.settingPassword();
      //  logger.log(Level.INFO, "Result of GETTING_PASSWORD is " + PASSWORD);
        
              
        Account account = returnAccount();
        //logger.log(Level.INFO, "Result of login is " + account.getInfoLogin());
        //logger.log(Level.INFO, "Result of password is " + account.getInfoPass());
        //logger.log(Level.INFO, "Result of date is " + account.getInfoDate());
    */
    }
    
    public static String gettingString(){
        String a = "";
        
        int lengthString = 8 + (int)(Math.random() * (16 - 8));
     
        for(int i = 0; i<lengthString; i++){
            
            int charNum = (new Random()).nextInt( 52 ); //26 великих літер і 26 маленьких
            if (charNum > 25) { charNum = charNum + 71; } else { charNum = charNum + 65; } // 26+71 = 97 код маленької "a"
                                                                        //
            a = a + (char) charNum;
        }
        return a;
    }
    //ПИСАЛИ В КЛАСІ ЗАВДАННЯ 3
    public static String getRandomString(){
        String returnedString = "";
        String stringSymbols = "abcdefghijklnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        char[] symbols = stringSymbols.toCharArray();
        int randomLength = getRandomNumber(8, 20);
        for (int i = 0; i < randomLength; i++){
            int randomIndex = getRandomNumber(0, symbols.length);
            
            returnedString = returnedString + symbols[randomIndex];
        }
        
        return returnedString;
    }
      
    public static int getRandomNumber(int min, int max){
        int  randomNumber = (int) (min + Math.random()* (max - min));
        return randomNumber;
    }   
    // кінець 3-го
    // 4- завдання класна
    
    public static String addingAtToRandomString(String randomString){
        String editedString = "";
          editedString = randomString;
              
          return editedString;
    }
    // кінець 4 завдання класна робота
    public static ArrayList<String> creatingCollection(){
        
        ArrayList<String> col = new ArrayList<>();
        
        for( int i = 0; i < 10; i++){
            String randomArray = gettingString() + "@";
            col.add(randomArray);
            //logger.log(Level.INFO, "collection is " + randomArray);
        }
        return col;
      
    }
    
    public static ArrayList<String> shaffleCollection(ArrayList<String> sh){
                    //System.out.println(sh);
        ArrayList<String> ret = new ArrayList<>();
        for (String elementOfCollection: sh){ // короткий запис для проходження колекції поелементно з допомогою цикла for
            char[] chars = elementOfCollection.toCharArray(); // кожний елемент колекції (моя рендомна строка) переводиться в масив символів
            String newString = ""; // нова строка для зберігання результата переміщення символів
            for(int i = 0; i <  chars.length - 1; i = i + 2){ // цикл переміщення символів
                if (Character.isDigit(chars[i]) || Character.isDigit(chars[i + 1])){ // спосіб перевірки чи є символ цифрою
                   newString = newString + chars[i] + chars[i + 1];
                   continue;
                }

                if (i + 1 == chars.length - 1 && chars[i + 1] == '@'){
                    newString = newString + chars[i] + chars[i + 1];
                } else {
                    newString = newString + chars[i + 1] + chars[i];
                }
            }
            
            if (chars.length > newString.length()){ // якщо довжина отриманої строки менше довжини оригінальної строки - просто додаємо до отриманої строки останній символ оригінальної строки
                newString = newString + chars[chars.length - 1];
            }
            
            ret.add(newString); // додаємо отриману строку до списку результатів
        }
       
        return ret; // повертаємо список строк
    }
    ///// класна робота 5 завдання
    public static String getRandomAccEmail(String accountName) {
        int randomDomainIndex;
        // random case for domain choose
        randomDomainIndex = 1 + (int) (Math.random() * (6 - 1));
        String randomEmail = accountName;
        switch (randomDomainIndex) {
        case 1:
            randomEmail += "@gmail.com";
            break;
        case 2:
            randomEmail += "@mail.com";
            break;
        case 3:
            randomEmail += "@hotmail.com";
            break;
        case 4:
            randomEmail += "@bigmir.net";
            break;
        case 5:
            randomEmail += "@zoho.eu";
            break;
        default:
            randomEmail += "@gmail.com";
            break;
        }
        return randomEmail;
    }
    // 5 завдання моє
    public static String constructorMail(){
        Collection mail = creatingCollection();
        String nameForMail = mail.toArray()[(new Random()).nextInt( mail.size())].toString() ;
        
        String [] domain = {"ukr.net", "gmail.com", "meta.ua", "address.com", "yahoo.com"};
        
        String domainForMail = domain[(new Random()).nextInt(domain.length)] ;
        
        String myMail = nameForMail + domainForMail;
        
        return myMail;
    }
    
    public static String getRandomMail2(){
        String [] domain = {"ukr.net", "gmail.com", "meta.ua", "address.com", "yahoo.com"};
        String domainForMail = domain[(new Random()).nextInt(domain.length)];
        return domainForMail;
    }
    
    public static String constructorMail2(){
        Collection mail = creatingCollection();
        String nameForMail = mail.toArray()[(new Random()).nextInt( mail.size())].toString() ;
        String myMail = nameForMail + getRandomMail2();
        return myMail;
    }
    /* ДОМАШНЄ завдання Account
    Создать класс Account с полями login, password и dateOfLastLoggin. 
    Поле login должно принимать почтовый адрес из 5-го задания,
    password - строчное выражение для всех аккаунтов одинаковое, 
    а dateOfLastLoggin нужно сделать текущим временем системы.

    public static Account returnAccount(){
        return new Account();
    }
*/
    
}
