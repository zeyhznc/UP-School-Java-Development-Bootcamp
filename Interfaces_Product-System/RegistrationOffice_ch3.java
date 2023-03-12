package org.javaturk.oofp.ch03HW_Q1;

import java.util.Random;
import java.time.LocalDate;

public class RegistrationOffice_ch3 {
	
	public RegistrationOffice_ch3() {
		super();
	}
	
	
	public AbstractStudent getAStudent() {
		Random rand = new Random();
		int no = rand.nextInt(5);
		
		AbstractStudent abstractStudent = null;

// UPCASTING		
		switch(no) {
		case 0:
			abstractStudent = new UndergraduateStudent_ch3(15, "Ece Hazneci", 2022, LocalDate.of(1998, 9, 29), "MECE", "IE");
			break;
		case 1:	
			abstractStudent = new GraduateStudent_ch3(10, "Yaren Ataseven", 2022,  LocalDate.of(1999, 6, 22), "Chemical Engineering", "Sinem Işık", "The Effect of Biogoly");
		    break;
		case 2:
			abstractStudent = new MasterStudent_ch3(48, "Zeynep Hazneci", 2022, LocalDate.of(1998, 9, 29), "Computer Science", "Akin Kaldiroglu", "Future of Java");
		    break;
		case 3:
			abstractStudent = new PhdStudent_ch3(32, "Oguz Hazneci", 2022, LocalDate.of(2000, 2, 10), "Computer Engineering", "Ahmet Yılmaz", "Game Theory", true);
		    break;
		case 4:
			abstractStudent = new VocationalStudent_ch3(28, "Baris Sahin",2022, LocalDate.of(1999, 3, 15), "Computer Engineering");
		break;
		}
		return abstractStudent;	
	}
	
//DOWNCASTING	
	public void registerStudent(AbstractStudent abstractStudent) {
		if(abstractStudent instanceof GraduateStudent_ch3) {
			GraduateStudent_ch3 gradStudent = (GraduateStudent_ch3) abstractStudent;
			gradStudent.register();
			System.out.println(gradStudent.toString());
		}
		else if(abstractStudent instanceof UndergraduateStudent_ch3){
			UndergraduateStudent_ch3 undergradStudent = (UndergraduateStudent_ch3) abstractStudent;
			undergradStudent.register();
			System.out.println(undergradStudent.toString());
		}
		else if (abstractStudent instanceof MasterStudent_ch3) {
			MasterStudent_ch3 masterstudent = (MasterStudent_ch3) abstractStudent;
			masterstudent.register();
			System.out.println(masterstudent.toString());
		}
		else if (abstractStudent instanceof PhdStudent_ch3) {
			PhdStudent_ch3 phdstudent = (PhdStudent_ch3) abstractStudent;
			phdstudent.register();
			System.out.println(phdstudent.toString());
		}
		else if (abstractStudent instanceof VocationalStudent_ch3) {
			VocationalStudent_ch3 vocstudent = (VocationalStudent_ch3) abstractStudent;
			vocstudent.register();
			System.out.println(vocstudent.toString());
		}
		else {
			System.out.println("Student " +abstractStudent.getName()+ "has been registered.");
		}
		
	}
}
