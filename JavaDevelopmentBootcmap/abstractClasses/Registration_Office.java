package org.javaturk.oofp.ch02HOMEWORK;

import java.util.Random;
import java.time.LocalDate;

public class Registration_Office {
	
	public Registration_Office() {
		super();
	}
	
	
	public Student_Abstract getAStudent() {
		
		Random rand = new Random();
		int no = rand.nextInt(4);
		
		Student_Abstract student_abstract = null;

// UPCASTING	
		switch(no) {
		case 0: 
			student_abstract = new Undergraduate_Student(15, "Ece Hazneci", 2022, LocalDate.of(1998, 9, 29), "MECE", "IE");
		//	student_abstract = new Student_Abstract(10, "Yaren Ataseven", 2022,  LocalDate.of(1999, 6, 22), "Chemical Engineering");
			break;
		case 1:
			student_abstract = new Graduate_Student(25, "Mustafa Hazneci", 2022, LocalDate.of(1998, 9, 29), "Computer Engineering", "Gül Sönmez", "Data Analysis");
			break;
			
		case 2:
			student_abstract = new Master_Student(48, "Zeynep Hazneci", 2022, LocalDate.of(1998, 9, 29), "Computer Science", "Akin Kaldiroglu", "Future of Java");
			break;
			
		case 3:
			student_abstract = new Phd_Student(32, "Oguz Hazneci", 2022, LocalDate.of(2000, 2, 10), "Computer Engineering", "Ahmet Yılmaz", "Game Theory", true);
			break;
		}		
		return student_abstract;
	}

	
// DOWNCASTING with using the operator "instanceof"	
	public void registerStudent(Student_Abstract student_abstract) {
		if (student_abstract instanceof Graduate_Student) {
			Graduate_Student graduateStudent = (Graduate_Student) student_abstract;
			graduateStudent.register();
			System.out.println(graduateStudent.toString());
		}
		else if (student_abstract instanceof Undergraduate_Student) {
			Undergraduate_Student undergraduateStudent = (Undergraduate_Student)student_abstract;
			undergraduateStudent.register();
			System.out.println(undergraduateStudent.toString());
		}
		else if (student_abstract instanceof Master_Student) {
			Master_Student masterStudent = (Master_Student) student_abstract;
			masterStudent.register();
			System.out.println(masterStudent.toString());
		}
		else if (student_abstract instanceof Phd_Student){
			Phd_Student phdStudent = (Phd_Student) student_abstract;
			phdStudent.register();
			System.out.println(phdStudent.toString());
		}
		else {
			System.out.println("Student" +student_abstract.getName()+ "has been registered.");
		}
	}	

}
