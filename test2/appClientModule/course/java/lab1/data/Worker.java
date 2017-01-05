package course.java.lab1.data;

import java.io.Serializable;

public class Worker implements Serializable {

	private String name;
	private int age;
	private int id;
	
	public Worker(String name, int age, int id) {
		this.name= name;
		this.age= age;
		this.id= id;
	}
	
	public Worker() {
		this.name= "NO_MANE";
		this.age=0;
		this.id = 0;
	}
	
	public String toString() {
		return "Worker " + name + " " + age + " " + id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
