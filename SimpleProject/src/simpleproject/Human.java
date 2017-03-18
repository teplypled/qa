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
public class Human {
    
    private String name;
    private int height = 156;
    private int weight = 65;
    private int age = 28;
    
    public Human(String inName){ //було Павло
        name = inName;
    }
    
    public Human(String name, int height, int weight){
        this.name = name; // процес запису імені у вхідний параметр рядок 14
        this.height = height;
        this.weight = weight;
}
    
    public int getHeight() {// метод виклику росту
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    
    public float getIndexValue(){
        float heightInMeters = (float) height/100;
        float res = weight / (heightInMeters * heightInMeters);
        return res;
    }

  
    
    
    
}
