/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg1.pkg3.pkg6;

import java.util.Random;
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
    
}     

//assertTrue(java.utils.Arrays.asList(domain).indexOf(domainForMail) > 0);