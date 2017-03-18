/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg1.pkg3.pkg6;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import java.util.logging.Level;
/**
 *
 * @author Maryna
 */
public class ShowOurWorkBySide {
    
    private static Logger logger = Logger.getLogger(ShowOurWorkBySide.class.getName());
    
    public static Student getRandomStudents(){
        Student student= new Student();
            student.setName(HW136.getRandomString());
            student.setLogin(HW136.getRandomAccEmail(student.getName()));
            student.setDateLastLogging(System.currentTimeMillis());
            student.setPassword("123456");
            return student;
    }
    
    public static Groups getGroup(){
        Groups group = new Groups();
        group.setName(HW136.getRandomString());
        for(int i = 0; i < 12; i++){
            Student student = getRandomStudents();
            group.addToGroup(student);
        }
        return group;
    }
    
    public static Teacher getTeacher(){
         Teacher teacher = new Teacher();
            teacher.setName(HW136.getRandomString());
            teacher.setLogin(HW136.getRandomAccEmail(teacher.getName()));
            teacher.setDateLastLogging(System.currentTimeMillis());
            teacher.setPassword("654321");
            return teacher;
    
    }
    
    public static Lessons getLesson(){
        Lessons lessons = new Lessons();
        lessons.setLessonSubject("lessons");
        lessons.setTeacher(getTeacher());
        lessons.setGroups(getGroup());
        lessons.setLengthOfLesson(45*60*1000);
        
        return lessons;
    }

    
    public static void main(String[] args){
      
        ArrayList<Lessons> lessonsForDay = new ArrayList<>(); //Список елементів типу <Lessons> (описані в класі Lessons)
        
        Date startDate = new Date(117, 3, 15, 8, 30, 00); // створення дати 15 березня 2017 року 8:30
        for(long i = 0; i < 5; i++){
           Lessons lessons = getLesson();
           lessons.setLessonSubject(lessons.getLessonSubject() + (i + 1));
           lessons.setStartOfLesson(startDate.getTime() + (i*((lessons.getLengthOfLesson()+(15*60*1000)))));
           lessonsForDay.add(lessons);
        }

        for(Lessons lsn: lessonsForDay){
            System.out.println(lsn.getLessonSubject());
            Date date = new Date();
            date.setTime(lsn.getStartOfLesson());
            SimpleDateFormat formatting = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
            String dateAsString = formatting.format(date);
            System.out.println(dateAsString);
            
            Groups group = lsn.getGroups();
            System.out.println(group.getName());
            System.out.println(group.getGroups().size());
           
            for (Student student:group.getGroups()){
            System.out.println(student.getLogin());
            }
        }
    }
}