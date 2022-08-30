package org.javaturk.oofp.ch03HW_Q1;

public class Test_ch3 {

	public static void main(String[] args) {
		
		RegistrationOffice_ch3 regOfis = new RegistrationOffice_ch3();
		
		AbstractStudent absStudent = regOfis.getAStudent();
		
		regOfis.registerStudent(absStudent);
	}

}
