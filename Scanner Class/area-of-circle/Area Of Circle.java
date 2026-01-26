import java.util.Scanner;

public class Main 
{
	public static void main (String[] args) {
	    System.out.println("Program to Calculate Total And Average Of Three Numbers :");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter three numbers :");
		int x=sc.intNext();
		int y=sc.intNext();
		int z=sc.intNext();
		
	    System.out.println("Total Of Three Numbers :"+ (x+y+z));
	    
	    sc.close();
	}
}
