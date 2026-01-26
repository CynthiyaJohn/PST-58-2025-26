import java.util.Scanner;

public class Main 
{
	public static void main (String[] args) {
	    System.out.println("Program to Calculate Total And Average Of Three Numbers :");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter three numbers :");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		double z=sc.nextDouble();
		
	    System.out.println("Total Of Three Numbers :"+ (x+y+z));
	    
	    double average = (x + y + z) / 3.0;
	    
	    System.out.println("Average Of Three Numbers :"+ average);
	    sc.close();
	}
}
