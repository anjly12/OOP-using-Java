package OOPJava;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringToken {
	public static void main(String args[]) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer with one space:");
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			String a=st.nextToken();
			n=Integer.parseInt(a);
			System.out.println(n);
			sum+=n;
		}
		System.out.println("Sum of Integer="+sum);
		sc.close();
	}
}