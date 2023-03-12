package org.javaturk.oofp.ch02HOMEWORK;

import java.time.LocalDate;

public abstract class Vocational_Student extends Student_Abstract {
	public Vocational_Student(int no, String name, int year, LocalDate dob, String major) {
		super(no, name, year, dob, major);
	}
	
	@Override
	public void study() {
		System.out.println("The vocational student" +getName()+ "is studying");
	}
	
	@Override
	public void register() {
		System.out.println("The vocational student" +getName()+ "is registered");
	}
	
	@Override
	public String toString() {
		String s = new String();
		s += "Vocational Student \n";
		s += " Name: " + getName() + "\n";
		s += "No: " +getNo()+ "\n";
		s += "Name: " +getName()+ "\n";
		s += "Year: " +getYear()+ "\n";
		s += "Date of Birth: " +getDob()+ "\n";
		s += "Major: " +getMajor()+ "\n";
		return s;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
