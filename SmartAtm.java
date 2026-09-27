import java.util.Scanner;

public class SmartAtm{

    public static void main(String[] args) {
        int PIN = 1111;
        int balance = 30000;
        int deposit, withdraw_amount;
        int choice;
        int pin,i;

        Scanner scanner = new Scanner(System.in);

        int attempt = 3;

        while (attempt > 0) {

            System.out.print("Please Enter the PIN : ");
            pin = scanner.nextInt();

            if (pin == PIN) {

                // ATM MENU
            	while(true){
                System.out.println("\n------ ATM MENU ------");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter your Choice : ");

                choice = scanner.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Balance = " + balance);
                        break;

                    case 2:
                        System.out.print("Enter Deposit Amount : ");
                        deposit = scanner.nextInt();
                        balance = balance + deposit;
                        System.out.println("Updated Balance = " + balance);
                        break;

                    case 3:
                        System.out.print("Enter Withdraw Amount : ");
                        withdraw_amount = scanner.nextInt();

                        if (withdraw_amount <= balance) {
                            balance = balance - withdraw_amount;
                            System.out.println("Updated Balance = " + balance);
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        break;

                    case 4:
                        System.out.println("Thank You for using Smart ATM. Have a Nice Day!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                }
            	}
              

            } else {

                attempt--;

                if (attempt > 0) {
                    System.out.println("Wrong PIN! You have " + attempt + " attempt(s) left.\n");
                } else {
                    System.out.println("Maximum attempts reached. Account Blocked.");
                }
            }
        }

        scanner.close();
    }
}