/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrommaryna;

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
public class PalindromMarynaTest {
    
    @Test
    public void isItPalindromicTest() {
        long someResultOfMultiplying = 345743;
        assertEquals(false, PalindromMaryna.isItPalindromic(someResultOfMultiplying));
    }
    @Test
    public void isItPalindromicTest2() {
        long someResultOfMultiplying = 345543;
        assertEquals(true, PalindromMaryna.isItPalindromic(someResultOfMultiplying));
    }
    @Test
    public void isItPalindromicTest3() {
        long someResultOfMultiplying = 73455437;
        assertEquals(true, PalindromMaryna.isItPalindromic(someResultOfMultiplying));
    }
    
    @Test
    public void intToCharTest() {
        int someNumber = 8973;
        //char[] a = new char[] {'-', '8', '9'};
        String res = "8973";
        assertEquals(res, PalindromMaryna.intToChar(someNumber));
    }
   
}   
   