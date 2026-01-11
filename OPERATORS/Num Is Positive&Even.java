public class Main {
    public static void main(String[] args) {
        int number = 89;

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println(number + " is a positive and even number.");
            } else {
                System.out.println(number + " is positive but odd.");
            }
        } else {
            System.out.println(number + " is not positive (it's zero or negative).");
        }
    }
}
