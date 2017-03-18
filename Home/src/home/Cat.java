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
public class Cat {
    
    private int catPlace;
    private int roomsWhereCatNow;

    public Cat(int catPlace, int roomsWhereCatNow) {
        this.catPlace = catPlace;
        this.roomsWhereCatNow = roomsWhereCatNow;
    }

    public int getCatPlace() {
        return catPlace;
    }
    
    
    public void moveTo(int newcatPlace){
        if(newcatPlace < roomsWhereCatNow)
            catPlace = newcatPlace;
        else System.out.println("Maaaaaauuuuuu!");
    }
    
    public void moveRandome(){
        catPlace = (int) (Math.random()*roomsWhereCatNow);
    }
}
