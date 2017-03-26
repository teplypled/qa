/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomAccount;
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

	// method returns student
	public static Student getRndStudent(int index){
		Student student = new Student();
		student.setName(RandomAccount.getRandomName(index));
		student.setLogin(RandomAccount.getRandomAccEmail(student.getName()));
		return student;
	}
	
	// method returns group of students
	public static Group getGroup(String name){
		Group group = new Group();
		group.setName(name);
		for(int i=0; i<12; i++){
			Student student = getRndStudent(12-i);
			group.addToGroup(student);
		}
                
		return group;
	}

        // method returns teacher
	public static Teacher getTeacher(){
		Teacher teacher = new Teacher();
		teacher.setName("Teacher"+RandomAccount.getRandomName(0));
		teacher.setLogin(RandomAccount.getRandomAccEmail(teacher.getName()));
		return teacher;
	}
	
	// method returns time of first lesson in millis
	public static long getCorrectTime(long dayInMills){
		long correctTime=0;
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTimeInMillis(dayInMills);
		int day = gc.get(gc.DAY_OF_WEEK);
		//if(day==7 || day==1){
		//	System.out.println("It's a week end!");
		//	return correctTime;
		//} else{
			int dayOfMonth = gc.get(gc.DAY_OF_MONTH);
			int month = gc.get(gc.MONTH);
			int year = gc.get(gc.YEAR);
			GregorianCalendar correctDate = new GregorianCalendar();
			correctDate.set(year, month, dayOfMonth, 9, 0, 0);
			correctTime = correctDate.getTimeInMillis();
		//}
		return correctTime;
	}
	
	// method returns list of lessons for a day
	public static ArrayList<Lesson> getLessonsForDay(long dayInMills){
		// create list of lessons
		// it's empty
		// lets fill it
		
		ArrayList<Lesson> lessons = new ArrayList<>();
		
		// set time for first lesson
		long timeOfFirstLesson = getCorrectTime(dayInMills);
		if(timeOfFirstLesson==0){
			System.out.println("I said - it's a week end!!!");
		}else{
			
			// new array of subjects
			ArrayList<String> subjeсts = new ArrayList<>();
                        
			subjeсts.add("Algebra");
			subjeсts.add("Physics");
			subjeсts.add("Geometry");
			subjeсts.add("Discrete mathematics");
			subjeсts.add("Statistics");
			subjeсts.add("Graphics");
			subjeсts.add("Computer science");
			subjeсts.add("History");
			subjeсts.add("History og Arts");
			subjeсts.add("English");
			
			// set teacher
			ArrayList<Teacher> teaсhers = new ArrayList<>();
			
			// create 10 different teachers
			for(int j=0; j<10; j++){
				Teacher teaсher = new Teacher();
				// set name_Teacher
				teaсher.setName(RandomAccount.getRandomName(j)+"_Teacher");
				teaсher.setLogin(RandomAccount.getRandomAccEmail(teaсher.getName()));
				// set subject
				teaсher.setSubject(subjeсts.get(j));
				teaсhers.add(teaсher);
			}
			
			// create 2 groups
			Group group1 = getGroup("Group1");
			Group group2 = getGroup("Group2");
			
			// choose group one after other
			// and set it for lesson
                        int quantityOfLessons = getRandomNumber(4,7);
			for(int i=0; i < quantityOfLessons; i++){    // ПОМІНЯЛА!!!! getRendomNumber має визначити кількість уроків 1 раз для 1-го дня для всього цикла, 
                                                     //а не різну кількість на кожній ітерації
				Lesson lesson = new Lesson(); 
				
				// set teacher from list above
				lesson.setTeacher(teaсhers.get(i));
				
				// set lesson subject as teacher has
				lesson.setLessonSubject(teaсhers.get(i).getSubject());
				
				// set group
				if(i%2==0){
					lesson.setGroup(group2);
				} else{
					lesson.setGroup(group1);
				}
				
				// set 15 minutes as break
				long lessonBreak = 1000*60*15; 

				// set 1 hour as length of lesson
				lesson.setLengthOfLesson(1000*60*60); 
				
				// set start of every lesson
				lesson.setStartOfLesson(timeOfFirstLesson + (i*(lessonBreak+lesson.getLengthOfLesson())));
				
				// add lesson to list
				lessons.add(lesson);
			}
		}
		return lessons;
	}
	

	private static int getRandomNumber(int min, int max) {
		int number;
		number = (int) (min + (Math.random()*(max-min)+1));
		return number;
	}

	
	
        public static void  main(String[] args){
		
		// get lessons for current day
		ArrayList<Lesson> lessonsForDay = getLessonsForDay(System.currentTimeMillis());
		// lets check it
                System.out.println(lessonsForDay.size());
		for (Lesson lesson : lessonsForDay) {
			System.out.println(lesson.getLessonSubject());
			System.out.println(lesson.getTeacher().getLogin());
			System.out.println(lesson.getLsnGroup().getName());
			Date date = new Date();
			date.setTime(lesson.getStartOfLesson());
			SimpleDateFormat formating = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
			String dateAsString = formating.format(date);   
			System.out.println(dateAsString);
			System.out.println("----------------------------------------------");
		}
		
    }
}
