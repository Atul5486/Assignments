import java.io.Console;
import java.util.*;

class Main {
    static Scanner sc = new Scanner(System.in);
    static String email, password, fullName;
    static int age;

    static double balance = 0.0;   // Only one balance
    static String accountType = ""; // "joint", "saving", "child"

    static String[] transactions = new String[100];
    static int transactionCount = 0;

    static boolean active = true;

    static final String RESET = "\u001B[0m";
    static final String CYAN = "\u001B[36m";
    static final String GREEN = "\u001B[32m";
    static final String RED = "\u001B[31m";
    static final String YELLOW = "\u001B[33m";

    static void clearScreen() {
        for (int i = 0; i < 50; i++) System.out.println();
    }

    static void addTransaction(String msg) {
        if (transactionCount < transactions.length) {
            transactions[transactionCount++] = msg;
        }
    }

    static void registerUser() {
        clearScreen();
        System.out.println(CYAN + "===== User Registration =====" + RESET);
        do{
            System.out.print("Enter Full Name: ");
            fullName = sc.nextLine();
        }while(!fullName.matches("[a-zA-Z]+"));


        do {
            System.out.print("Enter Age: ");
            age = sc.nextInt();
        } while (age <= 1 || age >100);
        sc.nextLine();

        do {
            System.out.print("Enter Email: ");
            email = sc.nextLine();
        } while (!email.contains("@gmail.com"));

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

    static void openAccount() {
    clearScreen();
    System.out.println(YELLOW + "===== WELCOME YOU IN BHAICHARA BANK =====" + RESET);
    System.out.println(YELLOW + "        ===== Open Account =====" + RESET);
    System.out.println("1. Joint Account");
    System.out.println("2. Saving Account");
    System.out.println("3. Child Account");
    System.out.println("Enter choice: ");
    int ch = sc.nextInt();
    // System.out.println();
    balance = 0.0;
    accountType = "";
    registerUser();
    switch (ch) {
        case 1:
             String spouseName;
             int spouseAge;
            do{
           System.out.println("Enter Spouse Name: ");
             spouseName = sc.next();
        }while(!spouseName.matches("[a-zA-Z]+"));
              
            do {
            System.out.println("Enter Spouse Age: ");
             spouseAge = sc.nextInt();
        } while (spouseAge <= 1 || spouseAge >100);
            
            do {
                System.out.println("Enter minimum balance (5000)");
                balance = sc.nextDouble();
            } while (balance < 5000);

            accountType = "Joint";
            addTransaction("Opened Joint Account with " + balance);
            System.out.println(GREEN + "Joint Account created!" + RESET);
            break;

        case 2:
            int nomineeAge;
            String nominee;
            do{
            System.out.println("Enter Nominee Name: ");
            nominee= sc.next();
        }while(!nominee.matches("[a-zA-Z]+"));
            
            do {
           System.out.println("Enter Nominee Age: ");
            nomineeAge = sc.nextInt();
        } while (nomineeAge <= 1 || nomineeAge >100);
            
            do {
                System.out.println("Enter minimum balance (2000)");
                balance = sc.nextDouble();
            } while (balance < 2000);

            accountType = "Saving";
            addTransaction("Opened Saving Account with " + balance);
            System.out.println(GREEN + "Saving Account created!" + RESET);
            break;

        case 3:
            int gAge;String gname;
            do{
            System.out.println("Enter Guardian Name: ");
            gname = sc.next();
        }while(!gname.matches("[a-zA-Z]+"));
            
            do {
           System.out.println("Enter Guardian Age: ");
            gAge = sc.nextInt();
        } while (gAge <= 1 || gAge >100);
            do {
                System.out.println("Enter minimum balance (1000)");
                balance = sc.nextDouble();
            } while (balance < 1000);

            accountType = "Child";
            addTransaction("Opened Child Account with " + balance);
            System.out.println(GREEN + "Child Account created!" + RESET);
            break;

        default:
            System.out.println(RED + "Invalid Choice!" + RESET);
    }
    }
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

    static void deposit() {
        if (accountType.equals("")) {
            System.out.println(RED + "No account found! Open an account first." + RESET);
            return;
        }
        if (!verifyPassword()) {
            System.out.println(RED + "Wrong Password!" + RESET);
            return;
        }
        System.out.println("Enter Amount: ");
        double amt = sc.nextDouble();
        balance += amt;
        addTransaction("Deposited " + amt + " in " + accountType + " Account");
        System.out.println(GREEN + "Deposit Successful!" + RESET);
    }

    static void withdraw() {
        if (accountType.equals("")) {
            System.out.println(RED + "No account found! Open an account first." + RESET);
            return;
        }
        if (!verifyPassword()) {
            System.out.println(RED + "Wrong Password!" + RESET);
            return;
        }
        System.out.println("Enter Amount: ");
        double amt = sc.nextDouble();

        if (balance >= amt) {
            balance -= amt;
            addTransaction("Withdrew " + amt + " from " + accountType + " Account");
            System.out.println(GREEN + "Withdrawal Successful!" + RESET);
        } else {
            System.out.println(RED + "Insufficient Balance!" + RESET);
        }
    }

    static void displayDetails() {
        clearScreen();
        System.out.println(CYAN + "===== Account Details =====" + RESET);
        System.out.println("Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        if (accountType.equals("")) {
            System.out.println("No account opened yet.");
        } else {
            System.out.println(accountType + " Account Balance: " + balance);
        }
        System.out.println("Transactions: ");
        for (int i = 0; i < transactionCount; i++) {
            System.out.println("- " + transactions[i]);
        }
    }

    static void deactivateAccount() {
        clearScreen();
        System.out.println(RED + "Account Deactivated!" + RESET);
        active = false;
    }

    public static void main(String[] args) {
        openAccount();
        while (active) {
            clearScreen();
            System.out.println(YELLOW + "===== Banking Menu =====" + RESET);
            // System.out.println("1.");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Details");
            System.out.println("4. Deactivate Account");
            System.out.println("5. Exit");
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: deposit(); break;
                case 2: withdraw(); break;
                case 3: displayDetails(); break;
                case 4: deactivateAccount(); break;
                case 5: active = false; break;
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
