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
public class PrivateHouse extends Home {
    public static final int TYPE_BEDROOM = 8;
    public static final int TYPE_KITCHEN = 9;
   
    int count_TYPE_BEDROOM = 0;
    int count_TYPE_KITCHEN = 0;
    
     @Override
    public void addRoom(Room room) {
       // super.addRoom(room); //To change body of generated methods, choose Tools | Templates.
       rooms.add(room);
       //super.addRoom(room); аызов методa addRooms из Home можно написать вместо строки 24
       
            switch (room.getType()) {
            case 8:
                count_TYPE_BEDROOM++;
                break;
            case 9:
                count_TYPE_KITCHEN++;
                break;
         } 
}
}
