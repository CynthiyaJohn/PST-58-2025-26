import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    System.out.println("Program to Check If number is Greater Than 100.");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		if(n>100){
		    System.out.println( "The Number is "+ n +" Greater Than 100");
		}else{
		     System.out.println( "The Number is "+ n +" Lesser Than 100");
		}
	}
}
