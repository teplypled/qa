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

/**
 *
 * @author Maryna
 */
public class NewEmptyJUnitTest {
    
   
    @Test
    public void testGetProveOfLogin() throws InterruptedException {
    String page = testselenium.TestSel.getProveOfLogin("abkj67rfra@gmail.com", "1234567890");
    
    assertTrue(page.contains("Hi, Ignatenko"));
    }
}
