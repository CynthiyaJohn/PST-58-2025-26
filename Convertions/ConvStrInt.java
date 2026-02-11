package PST;

import java.util.Scanner;

public class ConvStrInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number string (e.g., '456'):");
        String s = sc.next(); 
        
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);      

            int digit = ch - '0';       


            result = result * 10 + digit; 
        }

        System.out.println("The converted integer is: " + result);
        sc.close();
    }
}