package org.javaturk.oofp.ch02HOMEWORK;

import java.time.LocalDate;

public class Graduate_Student extends Student_Abstract {
	String advisor;
	String thesis;
	
	public Graduate_Student(int no, String name, int year, LocalDate dob, String major, String advisor, String thesis) {
		super(no,name,year,dob,major);
		this.advisor = advisor;
		this.thesis = thesis;
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

	
	@Override
	public void study() {
		System.out.println(getName()+ "who is an graduate student is studying");
	}
	
	@Override
	public void register() {
		System.out.println(getName()+ "who is an graduate student is registered");
	}
	
	public void writeThesis() {
		System.out.println("The Grad Student" +getName()+ "is writing the thesis" +getThesis());
	}
	
	public void meetWithAdvisor() {
		System.out.println("The Grad Student" +getName()+ "is meeting the advisor" +getAdvisor());
	}
	
	
	
	
	
	
	
	
	

}
