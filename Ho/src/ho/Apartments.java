/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ho;

/**
 *
 * @author Maryna
 */
import java.util.ArrayList;
public class Apartments extends Home {
    
    public static final int TYPE_BEDROOM = 1;
    public static final int TYPE_KITCHEN = 2;
    public static final int TYPE_WC = 3;
    
    //private ArrayList<Room> rooms = new ArrayList<>(); //в одной ячейке массива Rooms ьуде 1 кымната
    private int number;
    private int floor;
    

    public Apartments(int number, int floor) {
        this.number = number;
        this.floor = floor;
    }

    /*public void addRoom(Room room){
        rooms.add(room);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }*/

  
}
