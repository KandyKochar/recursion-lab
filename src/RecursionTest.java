import java.util.Scanner;

public class RecursionTest {

    // This method calculates the sum of first n natural numbers using recursion
    public static int sumNaturalNumbers(int n) {

        // Base case: when n becomes 0, return 0
        if (n == 0) {
            System.out.println("sum(" + n + ") = 0");
            return 0;
        }

        // Showing how recursion breaks the problem
        System.out.println("sum(" + n + ") = " + n + " + sum(" + (n - 1) + ")");

        // Recursive call
        int result = n + sumNaturalNumbers(n - 1);

        // Showing the value being returned step-by-step
        System.out.println("Returning: sum(" + n + ") = " + result);

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        // Loop to keep asking until user enters valid input
        while (true) {
            System.out.print("Enter a non-negative integer: ");

            // Check if input is an integer
            if (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter a non-negative number.");
                input.next(); // clear wrong input
                continue;
            }

            n = input.nextInt();

            // Check if number is non-negative
            if (n < 0) {
                System.out.println("Invalid input! Please enter a non-negative number.");
            } else {
                break; // exit loop if valid
            }
        }

        System.out.println("\nRecursive steps:");

        int sum = sumNaturalNumbers(n);

        System.out.println("\nThe sum of the first " + n + " natural numbers is: " + sum);

       
    }
}