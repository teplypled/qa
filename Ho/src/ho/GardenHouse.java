/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ho;

import java.util.ArrayList;

/**
 *
 * @author Maryna
 */
public class GardenHouse  extends Home {
    
        public static final int TYPE_SWIMING_POOL = 10;
        public static final int TYPE_GARAGE = 11;
        public static final int TYPE_TOOLS_STOCK = 12;
        
        int count_TYPE_SWIMING_POOL = 0;
        int count_TYPE_GARAGE = 0;
        int count_TOOLS_STOCK = 0;
        
   @Override
    public void addRoom(Room room) {
       // super.addRoom(room); //To change body of generated methods, choose Tools | Templates.
       rooms.clear();
       rooms.add(room);
       //super.addRoom(room); аызов методa addRooms из Home можно написать вместо строки 24
       
        count_TYPE_SWIMING_POOL = 0; //дописуємо 31 та 33 рядки, через те що кімната може бути лише одна, ми обнуляємо лічильники після додавання кімнати 
                                     // в рядку 28
        count_TYPE_GARAGE = 0;
        
        switch (room.getType()) {
            case 10:
                count_TYPE_SWIMING_POOL++;
                break;
            case 11:
                count_TYPE_GARAGE++;
                break;
         } 
    }
    @Override
    public ArrayList<Room> getRooms() {
        return super.getRooms(); //вызов метода getRooms из Home
    }
        
}
