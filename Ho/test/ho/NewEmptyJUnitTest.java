/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ho;

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
    public void test1() {
        int a = 10;
        int b = 3;
        int c = a + b;
	assertEquals(13, c);
    }
}
