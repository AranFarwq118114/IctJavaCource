import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double sum = 0; // Variable names should follow camelCase convention
        int count = 0;

        while (count < 10) {
            System.out.println("Enter number " + (count + 1) + ":"); // Fixed typo and improved message
            double n = scanner.nextDouble(); // Corrected variable name

            if (n >= 0) {
                sum += n; // Simplified addition
            } else {
                System.out.println("Negative numbers are not added.");
            }

            count++; // Increment count only once
        }

        System.out.println("The total sum is: " + sum); // Display the result
        scanner.close(); // Close the scanner to prevent resource leaks

    }
}