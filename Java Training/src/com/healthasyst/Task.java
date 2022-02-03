package com.healthasyst;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter percentage:");
//int percentage=70;
Scanner sc= new Scanner(System.in);
int percentage=sc.nextInt();
if(percentage>=90) {System.out.println("Grade is A");
}
 else if(percentage>=89 && percentage>=80 ) {System.out.println("Grade is B");
}

 else if(percentage>=79 && percentage>=60 ) {System.out.println("Grade is C");}

 else System.out.println("Grade is D");

}}