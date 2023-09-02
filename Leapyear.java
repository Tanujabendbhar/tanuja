package tanujaprojects;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
	 int year;
	 System.out.println("enter an year ::");
	 Scanner Sc = new Scanner(System.in);
	 year = Sc.nextInt();
	  
	 if(((year%4==0) && (year % 100!=0))||(year%400 ==0))
	 System.out.println("specific year is leap year");
	 else
	 System.out.println("specific year is not leap year");
	}
}
