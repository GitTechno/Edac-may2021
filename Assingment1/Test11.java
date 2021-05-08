import java.util.Scanner;


//Find Area and parameter of circle

class Test11{
     
	 public static void main(String[] args)
   {  
      
      Scanner sc=new Scanner(System.in);
	  
	  
	  Double pi=3.14;
	  Double r=sc.nextDouble();
	  
	  System.out.println("Enter the Value ::");
	  
	  //Area of Circle
	  Double area=pi*r*r;
	  
	  //parameter of circle
       Double parameter=2*pi*r;	

       System.out.println("Area of cirlce ::"+area);
	   System.out.println("Parameter of circle ::"+parameter);
	   
	}
    
}

