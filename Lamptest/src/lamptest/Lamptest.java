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
public class Lamptest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello!");
                        
        System.out.println("Hello!");
        Lamp myLamp = new Lamp(); //myLamp - об'єкт класа Lamp
        myLamp.turnOnLamp();
        
        System.out.println("lamp now - " + myLamp.getIsTurnedOn());
        //myLamp.isTurnedOn = false;
        // System.out.println("lamp now -" + myLamp.getIsTurnedOn()));
        
        Point myPoint = new Point(); //myPoint назва нової точки
        myPoint.setX(7);
        myPoint.setY(4);
        myPoint.setName("a1");// точка а1 маэ координати  x та y (7;4)
        
        Point myPointSecond = new Point(); //myPoint назва нової точки
        myPointSecond.setX(2);
        myPointSecond.setY(2);
        myPointSecond.setName("a2");// setName - назва метода в файлі Point.java
        
        //myPoint please applay metod getDistance from class Point to myPointSecond
        System.out.println("корінь квадратний = " + myPoint.getDistance(myPointSecond));
        
        //int result = myPoint.getDistance(myPointSecond);
        //assertEquals (5,result);
        
	}
    
    
}
