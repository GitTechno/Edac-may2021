class Pattern4
{
  public static void main(String[] args)
  {
   /*  for(int i=1;i<=5;i++)
	 {
	    for(int j=1;j<=i;j++)
		{
		    System.out.print(i);
		}
		System.out.println();
	 }  */
	 
	 
	 
	 
  /*	 for(int i=1;i<=5;i++)
	 {
	    for(int j=1;j<=i;j++)
		{
		    System.out.print(j);
		}
		System.out.println();
	 }  */
	 
	 
	 int c=0;
	 for(int i=1;i<=5;i++)
     {
		 for(int j=1;j<=i;j++)
		 {
			 c=c+1;                                //1.=c+1=1       
			 System.out.print(c+" ");              //2.=1+1=2   2+1=3
			                                       //3.=3+1=4   4+1=5  5+1=6
		 }	 
		 System.out.println();
     }		 
	 
  }
}



/*    1st               2nd            3rd

      1                  1              1
	  2 2                1 2            2 3
  	  3 3 3              1 2 3          4 5 6
	  4 4 4 4            1 2 3 4        7 8 9 10
	  5 5 5 5 5          1 2 3 4 5      11 12 13 14 15



*/


/*






*/