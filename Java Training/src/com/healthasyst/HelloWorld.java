package com.healthasyst;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("abhishek");
int r=10;
int A= (int) (r*r*3.14);
System.out.println(A + "\tMETER");

int a[]=new int [5];
a[1]=3;
a[2]=4;

System.out.println(a);
System.out.print(a[1] +a[2]);
for(int i=1;i<a.length;i++) {System.out.println(a[i]);}




int[] numbers= {10,65,87,65,25,33,49,58,79,66};
for(int i=0;i<numbers.length;i++) 
{ 
System.out.print(numbers[i]+" ");
break;
	}
for(int ab:numbers)
{if(ab<=100)
	System.out.println(ab);}









}
}
