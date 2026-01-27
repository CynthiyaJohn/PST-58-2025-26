package PST;

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        int n, sum = 0;
        float average;
        
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter the number of elements you want in the array: ");
        n = sc.nextInt();

     
        int[] a = new int[n];

       
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); 
            sum = sum + a[i];    
        }

        average = (float) sum / n;

       
        System.out.println("Sum of the array elements is: " + sum);
        System.out.println("Average of the array elements is: " + average);
        
        
        sc.close();
    }
}

