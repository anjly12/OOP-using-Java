package OOPJava;
import java.util.Scanner;

public class Frequency {
	public static void main (String[]args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the string to be checked:");
		String str= sc.nextLine();
		System.out.println("Enter the character:");
		char ch= sc.nextLine().charAt(0);
		int len= str.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)==ch)
			{ 
			  count++;
			}
		}
 System.out.println("Frequency of the character "+ch+" in the string is:"+count);
	}
}