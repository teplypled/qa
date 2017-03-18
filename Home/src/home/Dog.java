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
public class Dog {
    private int dogPlace;
    private int roomsWhereDogLiving;

    public Dog (int dogPlace, int roomsWhereDogLiving) {
        this.dogPlace = dogPlace;
        this.roomsWhereDogLiving = roomsWhereDogLiving;
    }

    public int getDogPlace() {
        return dogPlace;
    }
    
    
    public void moveTo(int newdogPlace, int newcatPlace){
        if(newdogPlace < roomsWhereDogLiving)
            dogPlace = newdogPlace;
        else System.out.println("Ghrrrrr!");
    }
    
    public void moveRandome(){
        dogPlace = (int) (Math.random()*roomsWhereDogLiving);
    }
}
    
