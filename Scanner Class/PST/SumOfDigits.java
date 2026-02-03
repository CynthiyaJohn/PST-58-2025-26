package PST;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        
        int number, digit, sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        number = scanner.nextInt();
        
       
        int originalNumber = number;

        
        while (number > 0) {
            
            digit = number % 10; 
           
            sum = sum + digit; 
           
            number = number / 10; 
        }

       
        System.out.println("The sum of the digits of " + originalNumber + " is: " + sum);


        scanner.close();
    }
}
