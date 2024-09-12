package OOPJava;
import java.util.Scanner;
class Employee{
	String Name;
	int Age;
	long Phone;
	String Address;
	double Salary;
	Employee(String name,int age,long phone,String address,double salary)
	{
		Name=name;
		Age=age;
		Phone=phone;
		Address=address;
		Salary=salary;	
	}
	void printEmployee()
	{
		System.out.println("Name:"+Name);
		System.out.println("Age:"+Age);
		System.out.println("Phone:"+Phone);
		System.out.println("Address:"+Address);
	}
	void printSalary()
	{
		System.out.println("Salary:"+Salary);
	}
   }
 class Officer extends Employee
   {
	 String specialization;
	 Officer(String name1,int age1,long phone1,String address1,double salary1,String specialization1)
	 {
		 super(name1,age1,phone1,address1,salary1);
         specialization=specialization1;
     }  
   void printspecialization()
   {
	   System.out.println("Specialization:"+specialization);
   }
   }
 class Manager extends Employee
 {
	 String department;
	 Manager(String name2,int age2,long phone2,String address2,double salary2,String department1)
	 {
	  super(name2,age2,phone2,address2,salary2);
	  department=department1;
	 }
	void printdepartment()
	{
		System.out.println("Department:"+department);
	}
 }
public class Inheritance {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		int age;
	    String name,address,specialization,department;
	    double salary;
	    long phone;
	    System.out.println("Enter the details of the officer");
	    System.out.println("Enter the Name:");
	    String name1=sc.next();
	    System.out.println("Enter the Age:");
	    int age1=sc.nextInt();
	    System.out.println("Enter the Phone:");
	    long phone1=sc.nextLong();
	    System.out.println("Enter the Address:");
	    String address1=sc.next();
	    System.out.println("Enter the Salary:");
	    double salary1=sc.nextDouble();
	    System.out.println("Enter the Specialization:");
	    String specialization1=sc.next();
	    Officer of = new Officer (name1,age1,phone1,address1,salary1,specialization1);
	    System.out.println("Enter the details of the manager");
	    System.out.println("Enter the Name:");
	    String name2=sc.next();
	    System.out.println("Enter the Age:");
	    int age2=sc.nextInt();
	    System.out.println("Enter the Phone:");
	    long phone2=sc.nextLong();
	    System.out.println("Enter the Address:");
	    String address2=sc.next();
	    System.out.println("Enter the Salary:");
	    double salary2=sc.nextDouble();
	    System.out.println("Enter the Department:");
	    String department1=sc.next();
	    Manager ma = new Manager (name2,age2,phone2,address2,salary2,department1);
	    System.out.println("Details of Officer");
	    of.printEmployee();
	    of.printSalary();
	    of.printspecialization();
	    System.out.println("Details of Manager");
	    ma.printEmployee();
	    ma.printSalary();
	    ma.printdepartment();
	  }
}
	   
