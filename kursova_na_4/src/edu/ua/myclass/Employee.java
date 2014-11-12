package edu.ua.myclass;

public class Employee extends Man {
	private String position;
	public Employee(String name, String surname){
		super(name, surname);
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
}
