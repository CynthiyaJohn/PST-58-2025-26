import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    System.out.println("Program to Check If number is Odd or Even.");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		if(n%2==0){
		    System.out.println( "The Number is "+ n +" Even");
		}else{
		     System.out.println( "The Number is "+ n +" Odd");
		}
	}
}

