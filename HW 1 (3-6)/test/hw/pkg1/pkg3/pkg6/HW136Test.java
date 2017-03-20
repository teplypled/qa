/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg1.pkg3.pkg6;

import java.util.Random;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maryna
 */
public class HW136Test {
    
    @Test
    public void gettingStringTest() {
     
        String a = HW136.gettingString();  
        int i = 0;
        i = a.length();
        boolean c = false;
        if ( i >= 8 && i <= 16 ){
            c = true;
        }
        
        assertEquals(true, c);
        
    }
    
    /* А класі запис теста
        @Test
    public void testGettingSring() {
        String rndStr = new HW136().getRandomString();
        boolean LenthIsCorrect = (rndStr.length() >= 8 && rndStr.length() <= 16);
        System.out.println(rndStr);
        assertEquals(true, LenthIsCorrect);
    }
     */  
    
    @Test
    public void gettingStringTest2() {
        char[] a = HW136.gettingString().toCharArray();
        boolean c = true;
        for(int i = 0; i < a.length; i++){
            if ((a[i] < 65) || ((a[i] >90) && (a[i] < 95)) || (a[i] > 122)){
                c = false; 
            } 
        }
        
        assertEquals(true, c);
    }
   
    @Test
    public void getRandomMail2Test(){
        String domainForMail = HW136.getRandomMail2();
        String [] domain = {"a", "b", "c", "d", "e"};
        boolean c = false;
        for (int i = 0; i < domain.length; i++){
            if (domainForMail == domain[i]){
                c = true;
            } 
        }
        assertEquals(false, c);
    }
    
    @Test
    public void getRandomMail2Test2(){
        String domainForMail = HW136.getRandomMail2();
        String [] domain = {"ukr.net", "gmail.com", "meta.ua", "address.com", "yahoo.com"};
        //System.out.println(domainForMail);
        boolean c = true;
        for (int i = 0; i < domain.length; i++){
            if (domainForMail != domain[i]){
                c = false;
                //System.out.println(domainForMail);
            } 
        }
        assertEquals(false, c);
    }
    
    @Test
    public void getRandomMail2Test3(){
        String domainForMail = HW136.getRandomMail2();
        String [] domain = {"ukr.net", "gmail.com", "meta.ua", "address.com", "yahoo.com"};
            System.out.println(domainForMail);
        boolean c = false;
        for (int i = 0; i < domain.length; i++){
            if (domainForMail == domain[i]){
                c = true;
            } 
        }
        assertEquals(true, c);
    }
    
    @Test
    public void getRandomStringTest(){
        char[] sym = "abcdefghijklnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        char[]  testString = HW136.getRandomString().toCharArray();
            System.out.println(testString);
        boolean c = true;
        
        for (int j = 0; j < testString.length; j++){
            boolean check = false;
            for (int i = 0; i < sym.length; i++){
                if (testString[j] == sym[i]){
                    check = true;                    
                }
            }
            if (check == false) { 
                //System.out.print(" " + testString[j]);
                c = false;
            } else
            { System.out.println(testString[j]); }             
        }
        assertEquals(true, c);
    }
    
    @Test
    public void getRandomNumberTest(){
        int randomNumber = new HW136().getRandomNumber(0, 2);
        boolean numberIsCorrect = false;
        numberIsCorrect = (randomNumber >= 0 && randomNumber <= 2); //randomNumber == 2;
        assertEquals(true, numberIsCorrect);
        
    }
    
    @ Test
    public void getRandomAccEmailTest(){
        String rndStr = new HW136().getRandomString(); 
        String someEmail = new HW136().getRandomAccEmail(rndStr);
        boolean accInEmail = someEmail.contains(rndStr);
        
        assertEquals(true, accInEmail);
    }
    
    @ Test
    public void getRandomAccEmailForContainsAtTest(){
        int count = 0;
        String rndStr = new HW136().getRandomString(); 
        String someEmail = new HW136().getRandomAccEmail(rndStr);
        char[] symbols = someEmail.toCharArray();
        for(int i = 0; i < symbols.length; i++) {
            if (symbols[i] == '@'){
                count++;
            }
        }
        
        assertEquals(1, count);
    }
    
    @ Test
    public void getRandomAccEmailForContainDotTest(){
        int count = 0;
        String rndStr = new HW136().getRandomString(); 
        String someEmail = new HW136().getRandomAccEmail(rndStr);
        char[] symbols = someEmail.toCharArray();
        for(int i = 0; i < symbols.length; i++) {
            if (symbols[i] == '.'){
                count++;
            }
        }
        
        assertEquals(1, count);
    }
    @ Test
    public void getRandomAccEmailForDotAfterATTest(){
        int count = 0;
        String rndStr = new HW136().getRandomString(); 
        String someEmail = new HW136().getRandomAccEmail(rndStr);
        char[] symbols = someEmail.toCharArray();
        boolean isTrue = false;
        int indexAt = 0;
        int indexDot = 0;
        
        for(int i = 0; i < symbols.length; i++) {
            if (symbols[i] == '@'){
                indexAt = i;
            }
            if (symbols[i] == '.'){
                indexDot = i;
            }
            isTrue = indexAt < indexDot; 
        }
        
        assertEquals(true, isTrue);
    }
    
   /*
    public static int getRandomNumber(int min, int max){
        int  randomNumber = (int) (min + Math.random()* (max - min));
        return randomNumber;
    }   
    */
}     

//assertTrue(java.utils.Arrays.asList(domain).indexOf(domainForMail) > 0);