import java.util.Scanner;

class Test6
{
   public static void main(String[] args)
   {  
      
      Scanner sc=new Scanner(System.in);
	  
	  //Finding reminder 
	  Double d1=sc.nextDouble();
	  Double d2=sc.nextDouble();
	  
	  //using mod operator
	  Double rs=d1%d2;
	  
	  System.out.println("Reminder is :: "+rs);
    
   }

}