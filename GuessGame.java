import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner input = new Scanner(System.in);

        while (true) {

            int number = r.nextInt(10) + 1;

            System.out.print("Guess a number (1-10): ");
            int guess = input.nextInt();

            if (guess == number)
                System.out.println("Correct!");
            else
                System.out.println(" Wrong! Number was " + number);

            System.out.print("Play again? (Y/N): ");
            char choice = input.next().charAt(0);

            if (choice == 'N' || choice == 'n') {
                System.out.println("Game Over!");
                break;
            }
        }

        input.close();
    }
}
