/**
 * 
 */
package com.healthasyst.student;

/**
 * @author abhishek
 *
 */
public class Student {
	private int studentId;
	private String studentName;
	private String studentMailId;
	private double studentPercentage;
	private static String schoolName;

	private static int counter = 1001;
	
	public Student() {
		studentId = counter;
		counter = counter + 1;
	}

	public Student(String studentName) {
		studentId = counter;
		counter = counter + 1;
		studentName = studentName;
	}

	public Student(String studentName, String mailId) {
		studentId = counter;
		counter = counter + 1;
		this.studentName = studentName;
		studentMailId = mailId;
	}

	// getter method
	public double getStudentPercentage() {
		return this.studentPercentage;
	}

	// setter method
	public void setStudentPercentage(double studentPercentage) {
		if (studentPercentage >= 0 && studentPercentage <= 100) {
			this.studentPercentage = studentPercentage;
		} else {
			System.out.println("Invalid Percentage!!");
		}
	}

	public String getStudentMailId() {
		return studentMailId;
	}

	public void setStudentMailId(String studentMailId) {
		if (studentMailId.contains("@")) {
			this.studentMailId = studentMailId;
		} else {
			System.out.println("Invalid mail id");
		}
	}

	public static String getSchoolName() {
		return schoolName;
	}

	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}

	public void printStudentDetail() {
		System.out.println("Student Id: " + this.studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("Student MailID: " + getStudentMailId());
		System.out.println("Student Percentage: " + studentPercentage);
		System.out.println("School Name: " + Student.schoolName);
		System.out.println("---------------------------------------");
	}

}


