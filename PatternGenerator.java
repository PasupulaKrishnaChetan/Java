import java.util.Scanner;

public class PatternGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept a positive integer N from the user
        System.out.print("Enter the number of rows (N): ");
        int N = scanner.nextInt();
        
        // --- PRINT PATTERN A ---
        System.out.println("\nPattern A:");
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next row
        }
        
        // --- PRINT PATTERN B ---
        System.out.println("\nPattern B:");
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next row
        }
        
        scanner.close();
    }
}
