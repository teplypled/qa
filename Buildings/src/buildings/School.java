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
public class School extends AllBuilding {

    @Override
    public void AddRoom(Rooms b) {
        rooms.add(b);
        CountingRoom(b.ID); // ID береться з класа Rooms.java
    }

    public void CountingRoom(int c){ // c - змiнна що зберігає значення ID 
        switch (c) {
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
