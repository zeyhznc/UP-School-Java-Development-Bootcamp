package org.javaturk.oofp.ch03HW_Q1;

import java.time.LocalDate;

public class UndergraduateStudent_ch3 extends AbstractStudent implements Student {
	
	String minor;

	public UndergraduateStudent_ch3(int no, String name, int year, LocalDate dob, String major, String minor) {
		super(no, name, year, dob, major);
		this.minor = minor;
	}

	@Override
	public void register() {
		System.out.println(getName() + " who is an undergraduate student is registered");
	}

	@Override
	public void study() {
		System.out.println(getName() + " who is an undergraduate student is studying");
	}

}
