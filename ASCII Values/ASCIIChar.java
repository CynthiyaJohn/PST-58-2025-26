

package PST;

import java.util.Scanner;

public class ASCIIChar {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A Charcter:");
		char character =sc.next().charAt(0);
		
		AsciiChar(character);
		
		sc.close();
	}
	static void AsciiChar(char c){
		
		int character = c;
        System.out.println("The ASCII value of '" + c + "' is: " + character);
        
     
	}
   
}