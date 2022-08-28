package org.javaturk.oofp.ch02HOMEWORK;

import java.time.LocalDate;

public abstract class Student_Abstract {
	protected int no;
	protected String name;
	protected int year;
	protected LocalDate dob;
	protected String major;
		
	public Student_Abstract(int no, String name, int year, LocalDate dob, String major) {
		super();
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob= dob;
		this.major = major;
	}
	
	
	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}


	public abstract void study();
	
	public abstract void register();
	
	@Override 
	public String toString() {
		String s = new String();
		s += "Student\n"; 
		s += "No: " + no + "\n";
		System.out.println("Information of the student: "+s);
		return s;
	}	

}
