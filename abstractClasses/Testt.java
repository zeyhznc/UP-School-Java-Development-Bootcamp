package org.javaturk.oofp.ch02HOMEWORK;

public class Testt {

	public static void main(String[] args) {
		Registration_Office regOfis = new Registration_Office();
		Student_Abstract student_abstract = regOfis.getAStudent();
		regOfis.registerStudent(student_abstract);

	}

}
