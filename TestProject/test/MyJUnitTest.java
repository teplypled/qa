/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testproject.MyTest;

/**
 *
 * @author Maryna
 */
public class MyJUnitTest {
    
    public MyJUnitTest() {
    }
    
    /*@Test // тест до варіанта 1
    public void simpleTest(){
        int a = 3;
        int b = 0;
        int result = MyTest.calculate(a, b);
        
        assertEquals(0, result);
    }*/
    @Test (expected = ArithmeticException.class) // тест до запису варіанта 2
    public void simpleTest(){
        int a = 3;
        int b = 0;
        int result = MyTest.calculate(a, b);
        
        assertEquals(0, result);
    }
    
    
    @Test
    public void SimpleArrTest(){
        int[] arr = null;
        int res = MyTest.getMax(arr);
        
        assertEquals(0, res); //массив порожній (= null) тому expected result = 0. Якщл завдаємо  int[] arr = {1, -2, 45};
                              //тоді expected result = 45
        
        
    }
    
    /*@BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}*/
}
