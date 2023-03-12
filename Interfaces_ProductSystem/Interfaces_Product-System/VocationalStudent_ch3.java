package org.javaturk.oofp.ch03HW_Q1;

import java.time.LocalDate;

public class VocationalStudent_ch3 extends AbstractStudent implements Student {
	
	public VocationalStudent_ch3(int no, String name, int year, LocalDate dob, String major) {
		super(no,name,year,dob,major);
	}
	
	@Override
	public void study() {
		
	}
	
	public void register() {
		
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
