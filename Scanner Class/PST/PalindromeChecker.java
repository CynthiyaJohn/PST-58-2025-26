package PST;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
    
        String originalString, reverseString = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a palindrome:");
        originalString = scanner.nextLine(); // Read the user input string

        int length = originalString.length();

        for (int i = length - 1; i >= 0; i--) {
            reverseString = reverseString + originalString.charAt(i);
        }

 
        if (originalString.equals(reverseString)) {
            System.out.println("Input string is a palindrome.");
        } else {
            System.out.println("Input string is not a palindrome.");
        }

        scanner.close();
    }
}
    