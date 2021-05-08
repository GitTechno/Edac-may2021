import java.util.Scanner;

class Test7
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
	  Integer i1=sc.nextInt();
	  //Integer i2=sc.nextInt();
	  
	  System.out.println("Enter Number to get Multiplication table::");
	  
	  //Multiplication Table for given value.
	  
	  for(int i=1;i<=10;i++){
	       
		   Integer rs=i1*i;
		   System.out.println("Multiplication Table :: "+rs);
	  
	  }
	  
	  System.out.println("End of Table");
   }
}