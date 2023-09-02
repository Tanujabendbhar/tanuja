package tanujaprojects;

public class AddMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[] []= {{1,2},{4,6}};
      int b[] []= {{4,5},{3,4}};
      int c[] []=new int[2] [2];
      
          for(int i=0;i<2;i++)
      {
    	  for(int j =0;j<2;j++)
    	  {
    	c[i] [j]=a[i][j]+b[i][j];
    	
    	System.out.println(c[i][j] +" ");
    	  }
   System.out.println(); 
      }
	}
}

    	
    	

