import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Please enter a number between 1 and 5: ");
            try {
                choice = scanner.nextInt(); // Attempt to read an integer

                // Check if the input is within the desired range
                if (choice >= 1 && choice <= 5) {
                    validInput = true; // Input is valid, exit the loop
                } else {
                    System.out.println("Invalid range! Please enter a number between 1 and 5.");
                }
            } catch (InputMismatchException e) {
                // Handle non-integer input
                System.out.println("Invalid input! Please enter a whole number.");
                scanner.nextLine();
            }
        }

        System.out.println("You entered: " + choice);
        scanner.close();
    }
}
