package tanujaprojects;

import java.util.Arrays;

//import java.util.Scanner; 


public class Array {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[] = new int []{1,2,3};
    int b[] [] = new int [] [] {{9,0,8},{4,5,6}};
 
    
    System.out.println("array element of 1D are:" + Arrays.toString(a));
    System.out.println("array element of 2D are:"+Arrays.deepToString(b));
    //System.out.println("array element of 3D are:"+Arrays.deepToString(c));
	}

}
