package OOPJava;
import java.util.Scanner;
class AgeException extends Throwable{
	public AgeException (String message) {
		super(message);
	}
}
public class CustomException {
	public static void validateAge(int age) throws AgeException{
		if(age<18) {
		throw new AgeException ("Age must be atleast 18 years");
		}
		System.out.println("Age is valid.");
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Eligibility Test for Election Voting ");
				System.out.println("Enter your age:");
				int age=sc.nextInt();
				try {
					validateAge(age);
				}
				catch (AgeException e) {
					System.out.println("Error! "+e.getMessage());
				}
				finally {
					System.out.println("I am finally block & I am always here");
					sc.close();
				}
	}
}