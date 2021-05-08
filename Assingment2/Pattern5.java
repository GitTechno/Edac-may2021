class Pattern5
{
   public static void main(String[] args)
   {
       int sum=0;
	   
	   for(int i=1;i<=5;i++)
	   {
	      for(int j=1;j<=i;j++)
		  {
		     System.out.print(j+" ");
			 sum=sum+j;
		  }
		  System.out.print("       "+sum);
		  sum=0;
		  System.out.println();
	   }
	   
   }
}


/*
           1           1              sum=sum+j(0+1)   1    1
           1 2         3                          
           1 2 3       6
           1 2 3 4     10
           1 2 3 4 5   15
 */