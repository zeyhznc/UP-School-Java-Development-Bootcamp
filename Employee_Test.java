package org.javaturk.oopj.ch07;

public class Employee_Test {

	public static void main(String[] args) {
		Employee emp1 = new Employee();

		System.out.println("THE EMPLOYEE INFORMATION ");
		emp1.name = "Zeynep";
		emp1.age = 24;
		emp1.sex = 'F';
		emp1.department = "Back-end Development";
		emp1.duty = "Develop and maintain back-end services";
		System.out.println(emp1.getInfo());
		
		System.out.println();
		
		System.out.println("WORK HISTORY OF THE EMPLOYEE ");
		emp1.work(160, 90);
		emp1.getPromotion(160, 2400);
		emp1.retire(48000);
		System.out.println(emp1.getInfo());
		System.out.println("*********************************");
		System.out.println();
		System.out.println();

		
	
		Employee emp2 = new Employee();

		System.out.println("EMPLOYEE INFORMATION");
		emp2.name = "Ada";
		emp2.age = 30;
		emp2.sex = 'M';
		emp2.department = "Information Technologies";
		emp2.duty = "Provide technical services to the company";
		System.out.println(emp2.getInfo());
		
		System.out.println();
		
		System.out.println("WORK HISTORY OF THE EMPLOYEE ");
		emp2.work(200, 70);
		emp2.getPromotion(40, 2350);
		System.out.println(emp2.getInfo());
		System.out.println("*********************************");
		System.out.println();
		System.out.println();


		
		
	}

}
