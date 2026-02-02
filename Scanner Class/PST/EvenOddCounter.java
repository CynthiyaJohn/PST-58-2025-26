package PST;

import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;

        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Total even elements: " + evenCount);
        System.out.println("Total odd elements: " + oddCount);

        input.close();
    }
}
