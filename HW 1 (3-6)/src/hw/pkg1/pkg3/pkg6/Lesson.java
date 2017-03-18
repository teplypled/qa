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
public class Lesson {
    private String name;
    private Account teacher;
    private AccountsCollection students = new AccountsCollection();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getTeacher() {
        return teacher;
    }

    public void setTeacher(Account teacher) {
        if (teacher.getType() == "teacher"){
            this.teacher = teacher;
        }
    }

    public AccountsCollection getStudents() {
        return students;
    }

    public void addStudent(Account student){
        if (student.getType() == "student"){
            students.addToAccCollection(student);
        }
    }
}
