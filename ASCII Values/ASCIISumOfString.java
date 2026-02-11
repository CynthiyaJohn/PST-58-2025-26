package PST;

import java.util.Scanner;
public class ASCIISumOfString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Any String: ");
		
		String Input = sc.nextLine();
		
		CharString(Input);
		sc.close();
	}
	static int CharString(String input) {
		
		int sum =0;
		for (int i=0; i < input.length();i++){
			sum +=(int) input.charAt(i);	
		}
		System.out.println("The Sum Of The Given String ' "+ input + " ' Is : " + sum );
		return sum;
	}

}