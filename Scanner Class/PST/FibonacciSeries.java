package PST;

import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number: ");
		
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		
		System.out.println("Fibonacci Series upto "+ n +" Terms is");
		
		for(int i = 1; i<=n; ++i) {

			System.out.println(n1 + " ");
			
			int n3 = n1 + n2;
		    n1=n2;
			n2=n3;
			
		}
		sc.close();
	}

}
