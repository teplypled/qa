/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomAccount;

/**
 *
 * @author Maryna
 */
import java.util.ArrayList;

/**
 *
 * @author Maryna
 */
public class Lesson {
    
	private String lessonSubject;
	private Group group;
	private Teacher teacher;
	private long startOfLesson;
	private long lengthOfLesson;
	
	public String getLessonSubject() {
		return lessonSubject;
	}
	public void setLessonSubject(String lessonSubject) {
		this.lessonSubject = lessonSubject;
	}
	public Group getLsnGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
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