/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pavloindex;

/**
 *
 * @author Maryna
 */
public class PavloIndex {
    
    static void print (String message){
    System.out.println (message);
            }
   
    public static void main(String[] args) {
       
//*******ВИЗНАЧЕННЯ ІНДЕКСА ТІЛА
        Person myPerson = new Person("Pavlo", 81.4, 199, 30);
            print ("Зріст " + myPerson.getName()+ " = " + myPerson.getHeight()+ " cm");
            print ("Вага " + myPerson.getName()+ " = " + myPerson.getWeight() + " kg");
            print ("Індекс маси тіла " + myPerson.getName()+ " = " + myPerson.getIndexPerson());
            
//*******ВІДСТАНЬ МІЖ ТОЧКАМИ          
        Point fst = new Point (4, 3);
        Point snd = new Point (5, 10);

        double dist = fst.getDistance(snd);
    
        System.out.println("Відстань між точками = " + dist );
    }
    
}
