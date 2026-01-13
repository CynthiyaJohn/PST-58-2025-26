import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    System.out.println("Program to Print Grades based on Marks.");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Marks:");
		int marks = sc.nextInt();
		
		if(marks>=90){
		     System.out.println( "The Mark is "+ marks +" The grade is A");
		    }else if(marks>=75){
		      System.out.println( "The Mark is "+ marks +" The grade is B");
		    }else if(marks>=50){
		      System.out.println( "The Mark is "+ marks +" The grade is C");
		    }else{
		     System.out.println("The Mark is "+ marks +" The grade is Fail");
		    }
	}
}