package PST;

import java.util.Scanner;

public class ArmstrongNumCheck {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=in.nextInt();
		in.close();
		
		int sum = 0, digits = 0;
		
		int countTemp = n;
		while(countTemp > 0) {
			digits++;
			countTemp /= 10;
		}
		
		for (int temp = n;temp > 0;temp /=10) {
			int lastDigit= temp%10;
			
			sum +=Math.pow(lastDigit,digits);
		}
		if (sum == n) {
			System.out.println(n +" is an Armstrong Number.");
		}else {
			System.out.println(n +" is Not an Armstrong Number.");
		}

	}

}
