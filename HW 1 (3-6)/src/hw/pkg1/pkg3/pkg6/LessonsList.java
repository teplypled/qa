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
public class LessonsList {
    public ArrayList<Lessons> lessons = new ArrayList<>();
    
    public  void addLesson (Lessons Lessons){
        lessons.add(Lessons);
    }
    
    public  void removeLesson (Lessons Lessons){
        lessons.remove(Lessons);
    }
    
    public  ArrayList<Lessons> getLessons(){
        return lessons;
    }
}
