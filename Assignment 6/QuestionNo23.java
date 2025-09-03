import java.io.Console;
import java.util.*;

class BankingSystem {
    static Scanner sc = new Scanner(System.in);
    static String email, password, fullName;
    static int age;

    static Map<String, Double> accounts = new HashMap<>();
    static List<String> transactions = new ArrayList<>();
    static boolean active = true;

    // Color codes
    static final String RESET = "\u001B[0m";
    static final String CYAN = "\u001B[36m";
    static final String GREEN = "\u001B[32m";
    static final String RED = "\u001B[31m";
    static final String YELLOW = "\u001B[33m";

    // Clear screen simulation
    static void clearScreen() {
        for (int i = 0; i < 50; i++) System.out.println();
    }

    // Register user
    static void registerUser() {
        clearScreen();
        System.out.println(CYAN + "===== User Registration =====" + RESET);
        System.out.print("Enter Full Name: ");
        fullName = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Email: ");
        email = sc.nextLine();

        Console console = System.console();
        if (console != null) {
            char[] pwdArray = console.readPassword("Enter Password: ");
            password = new String(pwdArray);
        } else {
            System.out.print("Enter Password: ");
            password = sc.nextLine();
        }
        System.out.println(GREEN + "Registration successful!" + RESET);
    }

    // Open account
    static void openAccount() {
        clearScreen();
        System.out.println(YELLOW + "===== Open Account =====" + RESET);
        System.out.println("1. Joint Account");
        System.out.println("2. Saving Account");
        System.out.println("3. Child Account");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt(); sc.nextLine();

        switch (ch) {
            case 1:
                System.out.print("Enter Spouse Name: ");
                String spouse = sc.nextLine();
                System.out.print("Enter Spouse Age: ");
                int spouseAge = sc.nextInt(); sc.nextLine();
                accounts.put("joint", 5000.0);
                transactions.add("Opened Joint Account with 5000");
                System.out.println(GREEN + "Joint Account created!" + RESET);
                break;
            case 2:
                System.out.print("Enter Nominee Name: ");
                String nominee = sc.nextLine();
                System.out.print("Enter Nominee Age: ");
                int nomineeAge = sc.nextInt(); sc.nextLine();
                accounts.put("saving", 2000.0);
                transactions.add("Opened Saving Account with 2000");
                System.out.println(GREEN + "Saving Account created!" + RESET);
                break;
            case 3:
                System.out.print("Enter Child Name: ");
                String child = sc.nextLine();
                System.out.print("Enter Guardian Age: ");
                int gAge = sc.nextInt(); sc.nextLine();
                accounts.put("child", 1000.0);
                transactions.add("Opened Child Account with 1000");
                System.out.println(GREEN + "Child Account created!" + RESET);
                break;
            default:
                System.out.println(RED + "Invalid Choice!" + RESET);
        }
    }

    // Password verification
    static boolean verifyPassword() {
        Console console = System.console();
        String inputPass;
        if (console != null) {
            char[] pwdArray = console.readPassword("Enter Password: ");
            inputPass = new String(pwdArray);
        } else {
            System.out.print("Enter Password: ");
            inputPass = sc.nextLine();
        }
        return inputPass.equals(password);
    }

    // Deposit
    static void deposit() {
        if (!verifyPassword()) {
            System.out.println(RED + "Wrong Password!" + RESET);
            return;
        }
        clearScreen();
        System.out.println("1. Joint Account\n2. Saving Account\n3. Child Account");
        int ch = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble(); sc.nextLine();

        switch (ch) {
            case 1: accounts.put("joint", accounts.getOrDefault("joint", 0.0) + amt);
                    transactions.add("Deposited " + amt + " in Joint Account"); break;
            case 2: accounts.put("saving", accounts.getOrDefault("saving", 0.0) + amt);
                    transactions.add("Deposited " + amt + " in Saving Account"); break;
            case 3: accounts.put("child", accounts.getOrDefault("child", 0.0) + amt);
                    transactions.add("Deposited " + amt + " in Child Account"); break;
            default: System.out.println("Invalid choice");
        }
        System.out.println(GREEN + "Deposit Successful!" + RESET);
    }

    // Withdraw
    static void withdraw() {
        if (!verifyPassword()) {
            System.out.println(RED + "Wrong Password!" + RESET);
            return;
        }
        clearScreen();
        System.out.println("1. Joint Account\n2. Saving Account\n3. Child Account");
        int ch = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble(); sc.nextLine();

        String acc = (ch == 1) ? "joint" : (ch == 2) ? "saving" : (ch == 3) ? "child" : null;

        if (acc != null && accounts.containsKey(acc)) {
            if (accounts.get(acc) >= amt) {
                accounts.put(acc, accounts.get(acc) - amt);
                transactions.add("Withdrew " + amt + " from " + acc + " Account");
                System.out.println(GREEN + "Withdrawal Successful!" + RESET);
            } else {
                System.out.println(RED + "Insufficient Balance!" + RESET);
            }
        } else {
            System.out.println(RED + "Account Not Found!" + RESET);
        }
    }

    // Display details
    static void displayDetails() {
        clearScreen();
        System.out.println(CYAN + "===== Account Details =====" + RESET);
        System.out.println("Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Accounts: " + accounts);
        System.out.println("Transactions: ");
        for (String t : transactions) {
            System.out.println("- " + t);
        }
    }

    // Deactivate
    static void deactivateAccount() {
        clearScreen();
        System.out.println(RED + "Account Deactivated!" + RESET);
        active = false;
    }

    public static void main(String[] args) {
        registerUser();

        while (active) {
            clearScreen();
            System.out.println(YELLOW + "===== Banking Menu =====" + RESET);
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Details");
            System.out.println("5. Deactivate Account");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1: openAccount(); break;
                case 2: deposit(); break;
                case 3: withdraw(); break;
                case 4: displayDetails(); break;
                case 5: deactivateAccount(); break;
                case 6: active = false; break;
                default: System.out.println("Invalid Choice!");
            }

            if (active) {
                System.out.println("\nPress Enter to continue...");
                sc.nextLine();
            }
        }
        System.out.println(GREEN + "Thank you for using Banking System!" + RESET);
    }
}