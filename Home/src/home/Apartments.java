/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

/**
 *
 * @author Maryna
 */
import java.util.ArrayList;
public class Apartments {
    
    ArrayList<Room> rooms = new ArrayList<>(); //в одной ячейке массива Rooms ьуде 1 кымната
    
    public void addRoom(Room room){
        rooms.add(room);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void separatePets(Cat catPlace, Dog dogPlace){
       
    }
    
}
