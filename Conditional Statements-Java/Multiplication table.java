import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    System.out.println(" THE MULTIPLICATION TABLE ");
		Scanner sc= new Scanner(System.in);
	    
	    System.out.println(" Enter any Number:");
	    int num=sc.nextInt();
	    
	    for(int i=0;i<=10;i++){
	        System.out.println(num+"x"+i+"="+(num*i));
	    }
	}
}
