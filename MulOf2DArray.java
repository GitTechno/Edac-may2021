import java.util.Scanner;

class MulOf2DArray
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
	  
	  int a[][]=new int[2][2];
	  int b[][]=new int[2][2];
	  int c[][]=new int[2][2];
	  
	  for(int i=0;i<a.length;i++)
	  {
	    for(int j=0;j<a[i].length;j++)
		{
		  System.out.println("Enter A matrix");
		  a[i][j]=sc.nextInt();
		}
	  }
	  
	   for(int i=0;i<b.length;i++)
	 {
	    for(int j=0;j<b[i].length;j++)
		{
		   System.out.println("Enter 2nd Matrix::");
		   b[i][j]=sc.nextInt();
		}
	 }
	 
	 for(int i=0;i<c.length;i++)
	 {
	    for(int j=0;j<c[i].length;j++)
		{
		  c[i][j]=a[i][j]*b[i][j];
		  System.out.print("A matrix=::" +a[i][j]+ " B matrix=:: " +b[i][j]);
		  System.out.println(": : :=  Sum of two Matrix=:: " +c[i][j]);  
		}
		
	 }

   }
}