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
import java.util.GregorianCalendar;
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
        Student student = new Student();
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
    
    // Заняття 22 березня уроки на день
    public static long getCorrectTime (long dayInMillis){
        long correctTime = 0;
         Date date = new Date();
         date.setTime(dayInMillis);
         GregorianCalendar gc = new GregorianCalendar();
         gc.setTime(date);
         int day = gc.get(gc.DAY_OF_WEEK);
         
         if (day==7 || day==1){
             System.out.println(day +"Bingo! Weekend!!");
             return correctTime;
         }
         else {
             int dayOfMonth = gc.get(gc.DAY_OF_MONTH);
             int month = gc.get(gc.MONTH);
             int year = gc.get(gc.YEAR);
             GregorianCalendar correctDate = new GregorianCalendar();
             correctDate.set(year, month, dayOfMonth, 9, 0, 0);
             correctTime = correctDate.getTimeInMillis();
         }
            return correctTime;
    }
    public static ArrayList<Lesson> getLessonsForDay(long dayInMillis){
        ArrayList<Lesson> lessons = new ArrayList(); 
         ArrayList<String> subjects = new ArrayList<>();
           
            subjects.add("Algebra");
            subjects.add("Physics");
            subjects.add("Geometry");
            subjects.add("Discrete mathematics");
            subjects.add("Statistics");
            subjects.add("Graphics");
            subjects.add("Computer science");
            subjects.add("History");
            subjects.add("History og Arts");
            subjects.add("English");
       
        long timeOfFirstLesson = getCorrectTime(dayInMillis);
        if(timeOfFirstLesson == 0){
            System.out.println("Weekend!");
        }
        else{
            ArrayList<Teacher> teachers = new ArrayList<>();
            for (int j = 0; j <getRandomNumber(4,7); j++ ){
                Teacher teacher = new Teacher();
                teacher.setName(HW136.getRandomString());
                teacher.setLogin(HW136.getRandomAccEmail(teacher.getName()));
                teacher.setSubject(subjects.get(j));
                teacher.setDateLastLogging(System.currentTimeMillis());
                teacher.setPassword("123456789");
                teachers.add(teacher);
            }
            
            Groups group1 = getGroup();
            Groups group2 = getGroup();
            
            for (int i = 0; i<getRandomNumber(4, 7); i++){
                Lessons lesson = new Lessons();
                
                if (i%2 ==0){
                    lesson.setGroups(group2);
                }
                else {
                    lesson.setGroups(group1);
                }
            }
          

        }
        return lessons;
    }
       public static LessonsList getOneDayLesson(Date date){
        LessonsList lessons = new LessonsList(); // создаваемый список уроков на 1 день
        
        if (date.getDay() == 0 || date.getDay() == 6){// 6 - cубота, 0 - неділя
            return lessons;
        }
        
        ArrayList<String> lessonsNames = Lessons.getLessonsNames();//список названий уроков
        System.out.println(lessonsNames + "AAAAAAAAAAAAAAAAAA");
        int lessonPointer = 0;
        for (int i = 0; i < LessonsList.quantityLessonsOnDay(); i++){
             Lessons oneDayLessons = new Lessons();
             oneDayLessons.setGroups(getGroup());
             oneDayLessons.setTeacher(getTeacher());
             oneDayLessons.setLessonSubject(lessonsNames.get(lessonPointer));
            lessonPointer++;
            if (lessonPointer >= lessonsNames.size()){
                lessonPointer = 0;
            }
            Date startOfLesson = new Date(date.getYear(), date.getMonth(), date.getDate(), 9 + i, 0, 0);
            oneDayLessons.setStartOfLesson(startOfLesson.getTime());
            oneDayLessons.setLengthOfLesson(45*60*1000);

            lessons.addLesson(oneDayLessons);
        }
       
        return lessons;
       }
    
       public static LessonsList getOneWeekLesson(Date date){
        LessonsList lessons = new LessonsList(); // создаваемый список уроков на 1 день
        ArrayList<String> lessonsNames = Lessons.getLessonsNames();//список названий уроков
        int lessonPointer = 0;
      
        for (int d = 0; d < 7; d++){
            Date lessonDate = new Date(date.getTime() + 1 * 24 * 60 * 60 * 1000);
        if (lessonDate.getDay() == 0 || lessonDate.getDay() == 6){
            continue;
        }
        
        for (int i = 0; i < LessonsList.quantityLessonsOnDay(); i++){
             Lessons oneDayLessons = new Lessons();
             oneDayLessons.setGroups(getGroup());
             oneDayLessons.setTeacher(getTeacher());
             oneDayLessons.setLessonSubject(lessonsNames.get(lessonPointer));
            lessonPointer++;
            if (lessonPointer >= lessonsNames.size()){
                lessonPointer = 0;
            }
            Date startOfLesson = new Date(lessonDate.getYear(), lessonDate.getMonth(), lessonDate.getDate(), 9 + i, 0, 0);
            oneDayLessons.setStartOfLesson(startOfLesson.getTime());
            oneDayLessons.setLengthOfLesson(45*60*1000);

            lessons.addLesson(oneDayLessons);
        }
    }
 
        return lessons;
       }
    
    
    public static void main(String[] args){
      
        //ArrayList<Lessons> lessonsForDay = new ArrayList<>(); //Список елементів типу <Lessons> (описані в класі Lessons)
        
        ArrayList<Lesson> LessonsForDay = getLessonsForDay(System.currentTimeMillis());
        System.out.println(getCorrectTime(System.currentTimeMillis()));
          
        Date date = new Date();
        date.setTime(getCorrectTime(System.currentTimeMillis()));
        SimpleDateFormat formatting = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        String dateAsString = formatting.format(date);
        System.out.println(dateAsString);
        
       /*
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
      
        
        LessonsList daySchedule = getOneDayLesson(new Date(117, 3, 20)); 
            for (int i = 0; i < daySchedule.size(); i++){
                
                System.out.println(daySchedule.getLessons().toArray()[i]);
//                System.out.println(oneDayLessons.);
//                System.out.println(oneDayLessons.);
//                System.out.println(oneDayLessons.);
            }
            */
    }        
        

        //    LessonsList oneWeekLessons = getOneWeekLesson(new Date(117, 3, 19));

    private static int getRandomNumber(int min, int max) {
        int number;
        number = (int) (min + (Math.random()*(max - min)+1));
        return number;
    }
            
       
}