package PST;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Program to Find the Factorial of a Number");
        
		int num;
		long factorial=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an Integer:");
		num =sc.nextInt();
		
		if(num<0) {
			System.out.println("Given Number is Invalid.");	
		}else {
			for(int i=1;i<=num;i++) {
				factorial *= i;				
			}
			System.out.println("The Factorial Of The Given Number "+ num + " Is "+ factorial);
		}
	    sc.close();
	}

}
