package rudenko;

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
public class PolindromTest {
    
   
    @Test
    public void isItPolindromicTest() {
        int someNumber = 567768;
        assertEquals(false, Polindrom.isItPolindromic(someNumber));
       
    }    
    @Test
    public void isItPolindromicTest2() {
        int someNumber = 56722765;
        assertEquals(true, Polindrom.isItPolindromic(someNumber));
    }
}
