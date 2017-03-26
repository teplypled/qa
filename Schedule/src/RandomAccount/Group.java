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

public class Group {
	private String name;
	public ArrayList<Student> group = new ArrayList<>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addToGroup(Student student){
		group.add(student);
	}
	
	public ArrayList<Student> getGroup(){
		return group;
	}
	
	public void deleteStudent(Student student){
		group.remove(student);
	}
}