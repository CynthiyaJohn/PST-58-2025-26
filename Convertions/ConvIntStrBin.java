package PST;

import java.util.Scanner;

public class ConvIntStrBin {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int n=sc.nextInt();
		
		String str=String.valueOf(n);
		
		System.out.println("Integer to string conversion Done with "+n+" Number is "+str);
		sc.close();
	}

}
