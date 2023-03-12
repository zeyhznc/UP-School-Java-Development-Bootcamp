package org.javaturk.oopj.ch07;

public class Employee {
	String name;
	int age;
	char sex;
	String department;
	String duty;
	
	int trialHours;
	int score;
	int hoursPerDay;
	int weekDays;
	String days;

	public int work(int workFor, int score) {
		workFor = trialHours;
		if (trialHours >= 160 && score >= 90)
			System.out.println("Congrats! You're hired. ");
		else
			System.out.println("Unfourtunately, you're not hired.");
		return workFor;
	}

	public int getPromotion(int completedHours, int hoursPerYear) {
		completedHours = hoursPerDay * weekDays;
		hoursPerYear = completedHours * 12;
		if (hoursPerYear > 2400)
			System.out.println("Congrats! You're promoted to the next position");
		else
			System.out.println("Please focus more on meeting your responsibilities");
		return hoursPerYear;
	}

	public int retire(int hoursPerYear) {
		if (hoursPerYear >= 48000)
			System.out.println("Thank you for your services into this company. You're retired.");
		else
			System.out.println("You're not retired yet.");
		return hoursPerYear;
	}

	public String getInfo() {
		String info = "Employee Information: "+ '\n' + "Name: " + name + '\n' + "Gender:" + sex + '\n' + "Department:" + department 
				+'\n' + "Job Definition: " + duty;
		return info;
	}

}
