package OOPJava;
import java.util.Scanner;
public class Exception {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		char c=0;
		do {
		System.out.println("Choose an operation:");
		System.out.println("1.Arithmetic Operation");
		System.out.println("2.Array Access");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
		  try {
			  System.out.println("Enter Numerator:");
			  int numerator=sc.nextInt();
			  System.out.println("Enter Denominator:");
			  int denominator=sc.nextInt();
			  int result=numerator/denominator;
			  System.out.println("Result="+result);
		  }
		  catch (ArithmeticException e) {
			  System.out.println("Caught an exception"+e.getMessage());
		  }
		  break;
		case 2:
			int [] numbers= {1,2,3};
			try {
				System.out.println("Enter array index to access:");
				int index=sc.nextInt();
				System.out.println("Element at index "+index +":" +numbers[index]);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Caught an exception:"+e.getMessage());
			}
			break;
			default:
				System.out.println("Invalid Choice! Please enter 1 or 2");
		}
		System.out.println("Do you want to continue? Select y or n");
		c=sc.next().charAt(0);
		}
		while (c=='y'|c=='Y');
			System.out.println("Code successfully executed");
		sc.close();
}
}
