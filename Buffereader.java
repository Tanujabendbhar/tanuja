package tanujaprojects;

import java.io.BufferedReader;

public class Buffereader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BufferedReader br=new BufferedReader(new InputStreamReader(system.in));
      System.out.println("enter an integer");
      int a=Integer.parseInt(br.readLine());
      String b=br.readLine();
      System.out.println();
      System.out.println("you have entered:- " + a + "and name as" + b);
	}

}
