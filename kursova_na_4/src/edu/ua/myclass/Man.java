package edu.ua.myclass;

import java.util.Objects;

/* 
 * два поля типу string,
 * public man(string name, string surname);
 * public getname()
 * public setname(string name);
 */
public class Man {
	private String name;
	private String surname;
	public Man(String name, String surname) {
		this.name=name;
		this.surname=surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurame(String surname) {
		this.surname = surname;
	}
	public String toString(){
		return name+" "+surname;
	}
	public boolean equals(Object arg){
		if (this == arg) {
			return true;
		}
		if (this == null ) {
			return false;
		}
		if (getClass() != this.getClass()){
			return false;
		}
		Man other = (Man)arg;
		return name.equals(other.getName()) && surname.equals(other.getSurname());
	}
	public int hashcode(){
		return Objects.hash(getName(), getSurname());
	}
}

