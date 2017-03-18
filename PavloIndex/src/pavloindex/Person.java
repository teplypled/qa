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
public class Person {
    private String name;
    private double weight;
    private int height;
    private int age;
    
    public Person(String name, double weight, int height, int age) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public double getIndexPerson(){
        double heightmeters = (double) height / 100;
        return weight / (heightmeters*heightmeters);
    }
    
    
}
