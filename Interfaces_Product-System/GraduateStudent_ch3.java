package org.javaturk.oofp.ch03HW_Q1;

import java.time.LocalDate;

public class GraduateStudent_ch3 extends AbstractStudent implements Student{
	String advisor;
	String thesis;
	
	public GraduateStudent_ch3(int no, String name, int year, LocalDate dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major);
		this.advisor = advisor;
		this.thesis = thesis;
	}
	
	@Override
	public void register() {
		System.out.println(getName() + " who is an graduate student is registered");
	}
	
	@Override
	public void study() {
		System.out.println(getName() + " who is an graduate student is studying");
	}
	
	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
	}
	
	public void writeThesis() {
		System.out.println("The Grad Student" +getName()+ "is writing the thesis" +getThesis());
	}
	
	public void meetWithAdvisor() {
		System.out.println("The Grad Student" +getName()+ "is meeting the advisor" +getAdvisor());
	}

}
