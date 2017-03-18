/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg1.pkg3.pkg6;

/**
 *
 * @author Maryna
 */
public class Lessons {
    
    private String lessonSubject;
    private Groups groups;
    private Teacher teacher;
    private long startOfLesson;
    private long lengthOfLesson;

    public String getLessonSubject() {
        return lessonSubject;
    }

    public void setLessonSubject(String lessonSubject) {
        this.lessonSubject = lessonSubject;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public long getStartOfLesson() {
        return startOfLesson;
    }

    public void setStartOfLesson(long startOfLesson) {
        this.startOfLesson = startOfLesson;
    }

    public long getLengthOfLesson() {
        return lengthOfLesson;
    }

    public void setLengthOfLesson(long lengthOfLesson) {
        this.lengthOfLesson = lengthOfLesson;
    }
    
    
    
}
