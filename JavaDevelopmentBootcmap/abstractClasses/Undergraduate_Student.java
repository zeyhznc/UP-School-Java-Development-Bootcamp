package org.javaturk.oofp.ch02HOMEWORK;

import java.time.LocalDate;

public class Undergraduate_Student extends Student_Abstract {
String minor;
	
	public Undergraduate_Student(int no, String name, int year, LocalDate dob, String major,String minor) {
		super(no, name, year, dob, major);
		this.minor = minor;
	}
	
	
	public void setMinor(String minor) {
		this.minor = minor;
	}


	@Override
	public void study() {
		System.out.println(getName()+ "who is an undergraduate student is studying");
	}
	
	@Override
	public void register() {
		System.out.println(getName()+ "who is an undergraduate student is registered");
	}
	
	@Override
	public String toString() {
		String s = new String();
		s += "Undergraduate Student \n";
		s += "Minor: " + minor + "\n";
		s += "No: " +getNo()+ "\n";
		s += "Name: " +getName()+ "\n";
		s += "Year: " +getYear()+ "\n";
		s += "Date of Birth: " +getDob()+ "\n";
		s += "Major: " +getMajor()+ "\n";
		return s;
	}	
}
