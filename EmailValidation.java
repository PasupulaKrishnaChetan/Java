import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Take email id and store in a string
        System.out.print("Enter your email ID: ");
        String email = sc.nextLine();

        // 2. Check the length of email and print it
        int length = email.length();
        System.out.println("Length of email: " + length);

        // 3. Check if short or long
        if (length < 4) {
            System.out.println("Output: short");
        } else if (length > 16) {
            System.out.println("Output: long");
        } else {
            System.out.println("Output: acceptable length");
        }

        // 4. Check if email is valid format
        // Regex: starts with letters/numbers, contains '@', domain part with dot
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (email.matches(emailRegex)) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is invalid.");
        }

        sc.close();
    }
}
