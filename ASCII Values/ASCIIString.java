package PST;

import java.util.Scanner;
public class ASCIIString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Any String: ");
		
		String Input = sc.nextLine();
		
		CharString(Input);
		sc.close();
	}
	static void CharString(String input) {
		for (int i=0; i < input.length();i++){//Strig -- Array of CHaracters
			
			char ch=input.charAt(i);
			
			int val = (int) ch;
			
			System.out.print(ch+" : "+ val+" , ");
			
		}
	}

}
