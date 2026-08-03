import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         while (true) {
			 
        System.out.println("\n===== JAVA CALCULATOR =====");


        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter operator (+ - * /): ");
        char op = input.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Answer = " + (num1 + num2));
                break;
            case '-':
                System.out.println("Answer = " + (num1 - num2));
                break;
            case '*':
                System.out.println("Answer = " + (num1 * num2));
                break;
            case '/':
                System.out.println("Answer = " + (num1 / num2));
                break;
             case '%':
                    System.out.println("Result = " + (num1 % num2));
                    break;    
            default:
                System.out.println("Invalid Operator");
        }
        System.out.println("\nDo another calculation? (Y/N):");
        char choice = input.next().charAt(0);
         if (choice == 'N' || choice == 'n') {
                System.out.println("Thank You!");
                break;
            }
		}
        
    }
}
