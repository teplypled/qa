/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg1.pkg3.pkg6;

import java.util.ArrayList;

/**
 *
 * @author Maryna
 */

//test branch comment

public class Groups {
    private String name;
    private ArrayList<Student> groups = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public void addToGroup(Student student){
    groups.add(student);
    }
    
    public ArrayList<Student> getGroups(){
        return groups;
    }
    
    public void deleteStudent (Student student){
        groups.remove(student);
    }
}
