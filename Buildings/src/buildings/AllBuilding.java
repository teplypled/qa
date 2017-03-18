/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildings;

import java.util.ArrayList;

/**
 *
 * @author Maryna
 */
public class AllBuilding {
    
    int count_kitchen = 0;
    int count_bathroom = 0;
    int count_bedroom = 0;
    int count_livingroom = 0;
    int count_classroom = 0;
    int count_teacherroom = 0;
    int count_gym = 0;
    int count_diningroom = 0;
    int count_pool = 0;
    int count_lockers = 0;
    int count_hall = 0;
    int count_WC = 0;
          /* public ArrayList<Room> rooms = new ArrayList<>(); //в одной ячейке массива Rooms ьуде 1 кымната
        
        public void addRoom(Room room){
        rooms.add(room);*/
        
     
    public ArrayList<Rooms> rooms = new ArrayList<>(); //створили масив кімнат для всіх типів білдінгіа.
                                                        //в одной ячейке массива Rooms буде 1 кімната
                                                        // rooms - зелене слово - назва масива кімнат
    
    public void AddRoom (Rooms a){ // Rooms - це тип змінної (як int), a - сама змінна
        
        rooms.add(a); // до масива з назвою rooms (зелене слово) застосовується метод add(a) - додається одна кімната
    
        switch (a.ID) {
            case 0:
                count_kitchen++;
                break;
            case 1:
                count_bathroom++;
                break;
            case 2:
                count_bedroom++;
                break;
            case 3:
                count_livingroom++;
                break;
            case 4:
                count_classroom++;
                break;
            case 5:
                count_teacherroom++;
                break;
            case 6:
                count_gym++;
                break;
            case 7:
                count_diningroom++;
                break;
            case 8:
                count_pool++;
                break;
            case 9:
                count_lockers++;
                break;
            case 10:
                count_hall++;
                break;
            case 11:
                count_WC++;
                break;        
        }
    }
}
