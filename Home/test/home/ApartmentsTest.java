/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

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
public class ApartmentsTest {
    
    public ApartmentsTest() {
    }
    
    @Test
    public void simple4RoomTest() {
        Room room1 = new Room("kitchen");
        Room room2 = new Room("badroom");
        Room room3 = new Room("badroom");
        Room room4 = new Room("wc");
        
        Apartments apartments = new Apartments();
        apartments.addRoom(room1);
        apartments.addRoom(room2);
        apartments.addRoom(room3);
        apartments.addRoom(room4);
        
        ArrayList<Room> roomsNow = apartments.getRooms();
        int result = apartments.getRooms().size();
        
        assertEquals(4, result);
    }
        
    @Test
    public void simple4RoomTestWithCat() {
        Room room1 = new Room("kitchen");
        Room room2 = new Room("badroom");
        Room room3 = new Room("badroom");
        Room room4 = new Room("wc");
        
        Apartments apartments = new Apartments();
        apartments.addRoom(room1);                                                                                                                                                                                                                                          
        apartments.addRoom(room2);
        apartments.addRoom(room3);
        apartments.addRoom(room4);
        
        Cat myCat = new Cat(0,apartments.getRooms().size());
        //myCat.moveTo(1);

        myCat.moveRandome();
        
        assertEquals(1, myCat.getCatPlace());
// зробити класс Собака, зробити  щоб собака ніколи не був з котом в одній кімнаті. Якщо кіт в кімнаті 0 то коли туди заходить собака, кіт переходить в кімнату 1

    }
         
    }