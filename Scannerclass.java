package tanujaprojects;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner Sc = new Scanner(System.in);
    System.out.println("enter a integer & a string");
   int a= Sc.nextInt();
    String b= Sc.nextLine();
  System.out.println("you have entered:-"+a+ " " +"and name as" + b);
	}

	
}

