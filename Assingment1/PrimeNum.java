class PrimeNum
{
   public static void main(String[] args)
   {
     int n=15;
	 int flag=0;
	 if(n==0 || n==1)
	    System.out.println(n+ " It is not a prime number");
	 else
	 {
	    for(int i=2;i<=n/2;i++)
		{
		  if(n%i==0)
		  {
		    System.out.println("It is not a prime number");
			flag=1;
			break;
		  }
		}
		  if(flag==0)
			  System.out.println("It is an prime number");
	    
			
	 }   
   }
}