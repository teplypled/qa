/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pavloindex;

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
public class PointTest {
    
    public PointTest() {
    }
    @Test
    public void testgetDistance(){
        Point fst = new Point (2, -3.2);
        Point snd = new Point (-4, 2);
        assertEquals( 7.94, fst.getDistance(snd), 0.005);
    }

    // @Test
    // public void hello() {}
}
