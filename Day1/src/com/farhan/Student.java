package com.farhan;

public class Student {
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails()
	{
		System.out.println("Roll is : "+roll);
		System.out.println("Name is : "+name);
		System.out.println("Marks is : "+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		s1.roll = 11;
		s1.name = "Harry Potter";
		s1.marks = 90;
		s2.roll = 12;
		s2.name = "Ron Weasley";
		s2.marks = 50;
		
		s1.displayStudentDetails();
		System.out.println();
		s2.displayStudentDetails();
		
		s1 = s2 = null;
		System.out.println();
		System.out.println(s1);
		System.out.println(s2);
	}

}
