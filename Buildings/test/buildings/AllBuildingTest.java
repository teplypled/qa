/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildings;

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
public class AllBuildingTest {
    
  // реализовать подсчет комнат каждого типа после добавления в каждом из типов home (Гарденхауз, Скул, ПрайватХаус и тд.
    @Test
    public void AllBuildingTest(){
        PrivateHouse myGardenHouse = new PrivateHouse();
        
        myPrivateHouse.addRoom(new Room(PrivateHouse.TYPE_SWIMING_POOL));
        myGardenHouse.addRoom(new Room(GardenHouse.TYPE_GARAGE));
        
        Home home = new Home();
        
        System.out.println("myHome - " + home);
        assertEquals(1, myGardenHouse.getRooms().size());
    }
}
