package OOPJava;
import java.util.Scanner;
class Mover{
	void area(double r) {
		System.out.println("Area of circle="+3.14*r*r);
	}
	void area(int a,int b) {
		System.out.println("Area of rectangle="+a*b);
	}
	void area(double b,double h)  {
		System.out.println("Area of triangle="+(0.5)*b*h); 
	}
}
public class MethodOverload {
	public static void main(String args[]) {
		  Mover mo=new Mover();
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter the radius of the circle:");
		  double radius=sc.nextDouble();
		  mo.area(radius);
		  System.out.println("Enter the length and breadth:");
		  int length=sc.nextInt();
		  int breadth=sc.nextInt();
		  mo.area(length,breadth);
		  System.out.println("Enter the base and height:");
		  double base=sc.nextDouble();
		  double height=sc.nextDouble();
		  mo.area(base,height);
	  }

}