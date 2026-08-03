import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 10000;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");

        System.out.print("Choose: ");
        int choice = input.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Balance = " + balance);
                break;

            case 2:
                System.out.print("Enter Amount: ");
                double dep = input.nextDouble();
                balance += dep;
                System.out.println("New Balance = " + balance);
                break;

            case 3:
                System.out.print("Enter Amount: ");
                double with = input.nextDouble();

                if (with <= balance) {
                    balance -= with;
                    System.out.println("Remaining Balance = " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
