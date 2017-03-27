/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import RandomAccount.ShowOurWorkBySide;
import RandomAccount.Student;
import RandomAccount.Teacher;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maryna
 */
public class ShowOurWorkBySideTest {
    

    @Test
    public void getRndStudentTest(){
        Student student = RandomAccount.ShowOurWorkBySide.getRndStudent(3);
        //System.out.println(student);
        assertEquals("Milena", student.getName());
    }
    
    @Test
    public void testGetRndStudentEmail(){
        Student student = RandomAccount.ShowOurWorkBySide.getRndStudent(3);
        assertTrue(student.getLogin().contains("Milena"));
    }
    
    @Test
    public void testGerGroupSize(){
        int size = ShowOurWorkBySide.getGroup("soneGroup").getGroup().size();
        assertEquals(12, size);
            
            
    }      

    @Test
    public void testGetTeacherName(){
        Teacher teacher = ShowOurWorkBySide.getTeacher();
        assertEquals("TeacherAlexandr", teacher.getName());
        
    }
    
    
    @Test
    public void testGetCorrectTimeForWeekend(){
        long weekend = ShowOurWorkBySide.getCorrectTime(System.currentTimeMillis() - (24*60*60*1000));
        assertEquals(0, weekend);
        
    }
    
     @Test
    public void testGetCorrectTimeForWorkday(){
        long workday = ShowOurWorkBySide.getCorrectTime(System.currentTimeMillis());
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTimeInMillis(workday);
        int correctHour = gc.get(gc.HOUR);
        int correctMinute = gc.get(gc.MINUTE);
        boolean correctTime = (correctHour==9)&&(correctMinute==0);
        assertTrue(correctTime);
        
    }
}
