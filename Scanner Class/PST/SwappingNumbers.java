package PST;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Before Swap The Numbers Are:");
		System.out.println("Enter Number 1 :");
		System.out.println("Enter Number 2 :");
		
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		 a = a + b; 
	     b = a - b; 
	     a = a - b;
		
	     System.out.println("After Swap The Numbers Are "+ a +" And "+ b);

	}

}
