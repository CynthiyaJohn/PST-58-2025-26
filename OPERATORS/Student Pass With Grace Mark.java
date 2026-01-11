import java.util.Scanner; 

public class StudentCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Marks: ");
        int marks = sc.nextInt(); 
        
        System.out.print("Enter Grace Value: ");
        int grace = sc.nextInt();

       
        if (marks > 40 || grace == 2) {
            System.out.println("Result: Condition Met (Pass/Eligible)");
        } else {
            System.out.println("Result: Condition Not Met (Fail/Ineligible)");
        }

        
        sc.close();
    }
}
