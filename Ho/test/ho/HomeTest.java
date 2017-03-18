/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ho;

import java.util.ArrayList;
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
public class HomeTest {
    
   /* @Test
    public void privateHouseSizeTest(){
        PrivateHouse myPrivateHouse = new PrivateHouse();
        Room room = new Room();
        
        room.setType(PrivateHouse.TYPE_BEDROOM);
        myPrivateHouse.addRoom(room);
        
        myPrivateHouse.addRoom(new Room(PrivateHouse.TYPE_KITCHEN));
        myPrivateHouse.addRoom(new Room(PrivateHouse.TYPE_KITCHEN));
        myPrivateHouse.addRoom(new Room(PrivateHouse.TYPE_KITCHEN));
        
        assertEquals(4, myPrivateHouse.getRooms().size());
    }
    
    @Test
    public void privateHouseTypeOfRoomTest(){
        PrivateHouse myPrivateHouse = new PrivateHouse();
        Room room = new Room();
        
        room.setType(PrivateHouse.TYPE_BEDROOM);
        myPrivateHouse.addRoom(room);
        
        myPrivateHouse.addRoom(new Room(PrivateHouse.TYPE_KITCHEN));
        myPrivateHouse.addRoom(new Room(PrivateHouse.TYPE_KITCHEN));
        myPrivateHouse.addRoom(new Room(PrivateHouse.TYPE_KITCHEN));
        myPrivateHouse.addRoom(new Room(PrivateHouse.TYPE_BEDROOM));

        
        
        assertEquals(3, myPrivateHouse.count_TYPE_KITCHEN); 
    // реализовать подсчет комнат каждого типа после добавления в каждом из типов home (Гарденхауз, Скул, ПрайватХаус и тд.
    }
    
    
    @Test
    public void gardenTestSize(){ //кількість всіх кімнат в ГарденХауз
        GardenHouse myGardenHouse = new GardenHouse();
        
        myGardenHouse.addRoom(new Room(GardenHouse.TYPE_SWIMING_POOL));
        myGardenHouse.addRoom(new Room(GardenHouse.TYPE_GARAGE));
        
        assertEquals(1, myGardenHouse.getRooms().size()); //тільки одна кімната!!!!! rooms.clear

    }
    @Test
    public void gardenTestTypeOfRoom(){ //кількість  кімнат конкретного типу в ГарденХау
        GardenHouse myGardenHouse = new GardenHouse();
        
        myGardenHouse.addRoom(new Room(GardenHouse.TYPE_SWIMING_POOL));
        myGardenHouse.addRoom(new Room(GardenHouse.TYPE_SWIMING_POOL));
        myGardenHouse.addRoom(new Room(GardenHouse.TYPE_SWIMING_POOL));

        myGardenHouse.addRoom(new Room(GardenHouse.TYPE_GARAGE));
        myGardenHouse.addRoom(new Room(GardenHouse.TYPE_GARAGE));
        
        assertEquals(0, myGardenHouse.count_TYPE_SWIMING_POOL); //бо останній додався гараж, а кімната може бути лише одна
                                                                // бо написано rooms.clear

    }
    
    /*public HomeTest() {
    }
    
    @BeforeClass
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

    /**
     * Test of addRoom method, of class Home.
     */
  
    
}
