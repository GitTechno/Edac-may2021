class Star13
{
   public static void main(String[] args)
   {
      for(int i=1;i<=5;i++)
	  {
	    for(int j=1;j<=i;j++)
		{
		  System.out.print(" ");
		}
		for(int k=5;k>=i;k--)
		{
		   System.out.print("*");
		}
		
		System.out.println();
	  }
	  for(int i=1;i<=4;i++)
	  {
	    for(int j=3;j<=3;j--)
		{
			 System.out.print(" ");
		}
		for(k=0;k<=i;k++)
		{
			System.out.print("*");
		}			
		System.out.println();
	  }
	  
   }
}

/*

*****
****
***
**
*
**
***
****
*****
******
*/