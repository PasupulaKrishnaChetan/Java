import java.util.Scanner;
public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- The Number Classifier & Digit Analyzer ---");

        while (true) {
            System.out.print("\nEnter a positive integer (or type 'exit' to quit): ");
            String input = scanner.next().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            try {
                int number = Integer.parseInt(input);

                if (number <= 0) {
                    System.out.println("Please enter a positive integer greater than 0.");
                    continue;
                }

                // Variables to keep track of analysis variables
                int sumOfDigits = 0;
                int evenCount = 0;
                int oddCount = 0;
                int temp = number;

                // Process each digit one by one
                while (temp > 0) {
                    int digit = temp % 10; // Get the last digit
                    
                    sumOfDigits += digit;  // Add to total sum

                    if (digit % 2 == 0) {
                        evenCount++;       // Count even digits
                    } else {
                        oddCount++;        // Count odd digits
                    }

                    temp /= 10;            // Remove the last digit
                }

                // Check if the sum of digits is a prime number
                boolean isPrime = true;
                if (sumOfDigits <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i * i <= sumOfDigits; i++) {
                        if (sumOfDigits % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                // Display the results
                System.out.println("1. Sum of all digits: " + sumOfDigits);
                System.out.println("2. Even digits count: " + evenCount + " | Odd digits count: " + oddCount);
                System.out.println("3. Is the sum (" + sumOfDigits + ") a prime number? " + (isPrime ? "Yes" : "No"));

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid whole number or 'exit'.");
            }
        }
        scanner.close();
    }
}
