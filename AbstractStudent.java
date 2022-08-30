package org.javaturk.oofp.ch03HW_Q1;

import java.time.LocalDate;

public abstract class AbstractStudent implements Student {
	protected int no;
	protected String name;
	protected int year;
	protected LocalDate dob;
	protected String major;
	
	public AbstractStudent(int no, String name, int year, LocalDate dob, String major) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
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
	
	@Override 
	public String toString() {
		String s = new String();
		s += "Student\n"; 
		s += "No: " + no + "\n";
		System.out.println("Information of the student: "+s);
		return s;
	}	

	
	
	
	
}
