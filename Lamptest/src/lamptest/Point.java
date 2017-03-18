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
public class Point {
   private int x;
   private int y;
   private String name;
   
   public void setX(int inputX){//inputX -значення змінної x
       x = inputX;
   }
   public void setY(int inputY){
       y = inputY;
   }
   public void setName(String Name){
       name = Name;
   }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }
   
   
   public int getDistance(Point secondPoint){
       int result = (int) Math.sqrt((this.x-secondPoint.getX())*(this.x-secondPoint.getX()) + (this.y-secondPoint.getY())*(this.y-secondPoint.getY())); //int пишемо бо Math.sqrt приймаэ лише double, тому примусово міняємо на int
       
       return result;
   }
   
    
}
