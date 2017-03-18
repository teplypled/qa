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
public class Home extends Object {
          

    public ArrayList<Room> rooms; //в одной ячейке массива Rooms ьуде 1 кымната
        
    public Home(){
        this.rooms = new ArrayList<Room>();
    }
    public void addRoom(Room room){
         rooms.add(room);
                
    }

    public ArrayList<Room> getRooms() { // метод повертає масив зі списком кімнат, ми його використовуємо в тестах
        return rooms;
    }
    
}
