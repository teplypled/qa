/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

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
public class MyNewTheBestClassTest {
    
     @Test
     public void testMyNewTheBestClass(){
         int[] array = { 2, 3, 4, 5};
         assertEquals(14, MyNewTheBestClass.array(array));
     }
}
