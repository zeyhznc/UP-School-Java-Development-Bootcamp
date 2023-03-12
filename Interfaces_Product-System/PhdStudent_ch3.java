package org.javaturk.oofp.ch03HW_Q1;

import java.time.LocalDate;

public class PhdStudent_ch3 extends GraduateStudent_ch3 implements Student{
	boolean qualifyingExamTaken;
	
	public PhdStudent_ch3(int no, String name, int year, LocalDate dob, String major, String advisor, String thesis, boolean qualifyingExamTaken) {
		super(no,name,year,dob,major,advisor,thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}
	
	@Override
	public void register() {
		System.out.println("The Phd Student " +getName()+ " is registered.");
	}
	
	public void study() {
		System.out.println("The Phd Student " +getName()+ " is studying.");
	}
	
	@Override
	public void writeThesis() {
		System.out.println("The Phd Student " +getName()+ " is writing the thesis " +getThesis());
	}
	
	@Override
	public void meetWithAdvisor() {
		System.out.println("The Phd Student " +getName()+ " is meeting with the advisor " +getAdvisor());
	}

	public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}

	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
	}
	
	public void writePaper() {
		System.out.println("The Phd Student " +getName()+ " is writing paper.");
	}
	
	

}
