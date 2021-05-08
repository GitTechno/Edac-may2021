
import java.util.Scanner;

class Test13
{
   public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
	 double ht=sc.nextDouble();
	 double wd=sc.nextDouble();
	 
	 
	 double area=ht*wd;
	 double perimeter=2*(ht+wd);
	 
	 System.out.println("Area of rectangle:: "+area);
	 System.out.println("Perimeter of rectangle :: "+perimeter);
  }
}