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
public class Room { //В классе Room Описывается тип Room
    
       public static final int TYPE_EMPTY = 0;
        
        private int type;

    public Room() {
    }
        

    public Room(int type) {
        this.type = type;
    }
        

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
        
   
}
