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
public class PersonTest {
    
    public PersonTest() {
    }
     
    @Test
    public void testGetIndexPerson() {
    Person myPerson = new Person("Pavlo", 55.43, 199, 30);
    assertEquals (55.43/(1.99*1.99), myPerson.getIndexPerson(), 0.005);
    }
    
}
