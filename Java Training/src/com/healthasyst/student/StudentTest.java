package com.healthasyst.student;

public class StudentTest {
public static void main(String[] args) {
		
		Student.setSchoolName("Global School");
		
		Student stu1=new Student("John");
		Student stu2=new Student("Peter","peter@gmail.com");
		Student stu3=new Student();
		
		
		stu1.setStudentPercentage(98.3);
		stu1.setStudentMailId("john@gmail.com");
		
		stu2.setStudentMailId("peter@gmail.com");
		stu2.setStudentPercentage(55);
	
//		System.out.println(stu1.getStudentPercentage());
//		System.out.println(stu1.getStudentMailId());
		
		stu1.printStudentDetail();
		stu2.printStudentDetail();
	
		System.out.println();
		
		//will start at 10:55 AM
	}

}

