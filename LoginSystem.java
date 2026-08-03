import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        while (true) {

            System.out.print("Username: ");
            String u = input.nextLine();

            System.out.print("Password: ");
            String p = input.nextLine();

            if (u.equals(username) && p.equals(password)) {
                System.out.println("Login Successful!");
                System.out.println("Welcome!");
                break;
            } else {
                System.out.println("Login Failed!");
                System.out.println("Try Again...\n");
            }
        }

    }
}
