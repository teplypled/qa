/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamptest;

/**
 *
 * @author Maryna
 */
public class Lamp {
    
    //параметр класа
    private boolean isTurnedOn = false; // private не дає оперувати цією змінною в main!!! public - дозволяє використовувати змінну іншим класам
    
    // методи класа
    void turnOnLamp(){
        isTurnedOn = true;
    }
    
    void turnOfLamp (){
        isTurnedOn = false;
    }
    
    boolean getIsTurnedOn(){
    return isTurnedOn;
}
    
    
}
