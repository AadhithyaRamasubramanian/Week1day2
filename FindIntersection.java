package week1day2;

import java.util.ArrayList;
import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {3,2,11,4,6,7};
      int b[]= {1,2,8,4,9,7};
      int c[]= {0,0,0};int k=0;
      
      for (int i=0;i<a.length;i++)
      {
    	  for (int j=0;j<b.length;j++)
    	  {
         if(a[i]==b[j])
         {
        	 c[k]=a[i];
        	 k=k+1;
         }
	 
    	  }
      
	}
      
      System.out.println(Arrays.toString(c));
}
	
}