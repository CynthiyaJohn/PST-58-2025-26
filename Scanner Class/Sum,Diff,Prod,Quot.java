import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    System.out.println("Program to Read Integers and Print Their Sum,Difference,Product,Quotient:");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter two Integers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("The Sum Of Two Integers is "+ (a+b) );
		System.out.println("The Difference Of Two Integers is "+(a-b));
		System.out.println("The Product Of Two Integers is "+ (a*b));
		System.out.println("The Quotient Of Two Integers is "+ (a%b));
	}
}