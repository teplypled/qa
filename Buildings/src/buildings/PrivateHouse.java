/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildings;

/**
 *
 * @author Maryna
 */
public class PrivateHouse extends AllBuilding {
    public void addRoom(Rooms a) {
       // super.addRoom(room); //To change body of generated methods, choose Tools | Templates.
       rooms.clear();
       rooms.add(a);
      // super.addRoom(a); //аызов методa addRooms из Home можно написать вместо строки 24

    }


}
