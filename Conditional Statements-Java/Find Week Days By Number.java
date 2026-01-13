import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Program to Find Days by numbers.");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Number:");
        int day = sc.nextInt();
        
		switch(day) {
		case 1:
			System.out.println("The Day is Sunday!");
			break;
		case 2:
			System.out.println("The Day is Monday!");
			break;
		case 3:
			System.out.println("The Day is Tuesday!");
			break;
		case 4:
			System.out.println("The Day is Wednesday!");
			break;
		case 5:
			System.out.println("The Day is Thursday!");
			break;
		case 6:
			System.out.println("The Day is Friday!");
			break;
		case 7:
             System.out.println("The Day is Saturday!");
	         break;
	    case 8:
	        System.out.println("The Number is Invalid!");
	        break;
		}

	}
}
