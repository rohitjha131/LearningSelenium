package cal;

import java.util.Scanner;

public class testing 
{

		public static void main(String[] args) 
		{
			System.out.println("enter value of base");
			Scanner scan=new Scanner(System.in);
			int q=scan.nextInt();
			System.out.println("enter value of right");
			Scanner scan1=new Scanner(System.in);
			int q1=scan1.nextInt();
			System.out.println("enter value of left");
			Scanner scan2=new Scanner(System.in);
			int q2=scan2.nextInt();
			
			int n=1;
		 for(int i=0;i<q1+1;i++)
		 {
			 System.out.print(" ");
		 }
			 for(int j=0;j<q;j++)
			 {
				 System.out.print("-");
			 }
			 System.out.println();
          for(int i=q1;i>0;i--)
             {
  	    	  for(int j=i-1;j>0;j--)
        	  {
        		  
        			  System.out.print(" ");
        		  }
        		  System.out.print("_!");
//        		  for(int t=q2;t>0;t--) 
//        		  {
        			 
        		  for(int w=q+n;w>0;w-- )
        		  {
        			  System.out.print(" ");
        		  }
        		  System.out.print("!_");
        		  System.out.println();
        		  n=n+2;
        		  //}
          }
		 
		
				
		}
}


