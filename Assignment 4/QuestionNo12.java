import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int ch;
        Menu menu = new Menu();
        
        System.out.println("\n========== JMB MENU CARD ==========");
        menu.getMenu();
        System.out.println("=====================================");
        
        do {
            System.out.println("\nEnter s.no to order item (6 to exit and generate bill): ");
            ch = inp.nextInt();
            switch (ch) {
                case 1: case 2: case 3: case 4: case 5:
                    System.out.println("You ordered: " + menu.order(ch));
                    break;
                case 6:
                    menu.printBill();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (ch != 6);
    }
}

class Menu {
    String item[] = {"Samosa","Jalebi","Kachori","Aloo Bada","Kesher Doodh"};
    int price[]   = {20,25,30,20,50};
    String orderedItems[] = new String[50];
    int orderedPrices[]   = new int[50];
    int orderCount = 0;  
    int total = 0;

    void getMenu() {
        System.out.printf("%-5s %-15s %10s%n", "S.no", "Name", "Price");
        for (int i = 0; i < item.length; i++) {
            System.out.printf("%-5d %-15s %10d%n", i+1, item[i], price[i]);
        }
    }

    String order(int num) {
        if (num >= 1 && num <= item.length) {
            orderedItems[orderCount] = item[num-1];
            orderedPrices[orderCount] = price[num-1];
            total += price[num-1];
            orderCount++;
            return item[num-1];
        }
        return "Invalid choice!";
    }

    void printBill() {
        System.out.println("\n========== JMB BILL ==========");
        System.out.printf("%-5s %-15s %10s%n", "No.", "Item", "Price");
        for (int i = 0; i < orderCount; i++) {
            System.out.printf("%-5d %-15s %10d%n", i+1, orderedItems[i], orderedPrices[i]);
        }
        System.out.println("-------------------------------------");
        System.out.printf("%-20s %10d%n", "Total Amount:", total);
        System.out.println("=====================================");
        System.out.println("Thank you! Visit Again.");
    }
}
