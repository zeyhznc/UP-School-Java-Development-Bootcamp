package org.javaturk.oofp.ch02HOMEWORK;

import java.time.LocalDate;

public class Master_Student extends Graduate_Student {
	public Master_Student(int no, String name, int year, LocalDate dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major, advisor, thesis);
	}
	
	@Override
	public void study() {
		System.out.println("The Master Student" +getName()+ "is studying");
	}
	
	@Override
	public void register() {
		System.out.println("The master Student" +getName()+ "is registered");
	}
	
	@Override
	public void writeThesis() {
		System.out.println("The Master Student" +getName()+ "is writing the thesis" +getThesis());
	}
	
	@Override
	public void meetWithAdvisor() {
		System.out.println("The Master Student" +getName()+ "is meeting with the advisor" +getAdvisor());
	}	

}
