package PST;

import java.util.Scanner;
public class LeapYear {
        public static void main(String[] args) {
        	Scanner sc= new Scanner(System.in);
        	System.out.println("Enter a Year: ");
        	
        	int Year=sc.nextInt();
        
        	if((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)){
        		System.out.println("The Year "+ Year +" is a Leap Year!");       
        	}else {
        		System.out.println("The Year "+ Year + " is not a Leap Year");
        	}
        	sc.close();
        }
}
