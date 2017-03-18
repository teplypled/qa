/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleproject;

/**
 *
 * @author Maryna
 */
public class SimpleProject {

    /**
     * @param args the command line arguments
     */
    static void print (String message){
    /*for (int i = 0; i<3; i++){*/
           System.out.println (message);
       // }
    }
    public static void main(String[] args) {
        // TODO code application logic here
       /* for (int i = 0; i<3; i++){
           System.out.println("Hi!");
        }
        
         System.out.println("Hello!");
         
        }
    */
        print("Вітаю!");
        print("Abend!");
        
        Human myHuman = new Human("Pavlo", 192, 81); // 35-37 це конструктор - метод створенны об'єкта //тут викликається ім'я Павло
        print("myHuman height - " + myHuman.getHeight());
        print("myHuman name - " + myHuman.getName());
        
     //   double index = myHuman.getIndexValue();
        print("Index for - " +myHuman.getName()+ " is "+ myHuman.getIndexValue());
        
        Human myHumanSecond = new Human("Olga");
        print("myHuman name - " + myHumanSecond.getName());


    }

}
