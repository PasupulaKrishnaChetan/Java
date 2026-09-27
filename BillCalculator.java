import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- The Dynamic Bill Calculator ---");

        while (true) {
            System.out.print("\nEnter electricity units consumed (or type 'exit' to quit): ");
            String input = scanner.next();

            // Check if the user wants to stop
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            try {
                double units = Double.parseDouble(input);

                if (units < 0) {
                    System.out.println("Units consumed cannot be negative.");
                    continue;
                }

                double totalBill = 0.0;

                // Calculate base bill based on tiers
                if (units <= 100) {
                    totalBill = units * 1.20;
                } else if (units <= 300) {
                    totalBill = (100 * 1.20) + ((units - 100) * 2.00);
                } else {
                    totalBill = (100 * 1.20) + (200 * 2.00) + ((units - 300) * 3.00);
                }

                // Add 5% surcharge if the amount exceeds $500
                if (totalBill > 500) {
                    totalBill += totalBill * 0.05;
                }

                System.out.printf("Total Bill Amount: $%.2f\n", totalBill);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'exit'.");
            }
        }
        scanner.close();
    }
}
