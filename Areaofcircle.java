package tanujaprojects;

import java.util.Scanner;

public class Areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner SC= new Scanner(System.in);
	        
	         System.out.println("Enter the radius:");
	         double r= SC.nextDouble();
	         double  area=(22*r*r)/7 ;
	         System.out.println("Area of Circle is: " + area);      
	   }

}
