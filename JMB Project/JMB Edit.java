import java.util.Scanner;
class Main {
    public static Scanner inp=new Scanner(System.in);
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String MAROON = "\u001B[48;5;52m";
    public static final String BG = "\u001B[47m";
    public static void main(String[] args) {
        int ch;
        System.out.println(BOLD+MAROON+"          ========== JMB MENU CARD ==========          "+RESET+BG);
        JMB j = new JMB();
        do{
        System.out.println(RESET+MAROON+"\n ===== Enter Your Choice ====="+RESET+"\n1.VEGETARIAN THALI MENU\n2.BREAKFAST MENU\n3.SOUP MENU\n4.MOCKTAIL MENU\n5.PANEER STARTERS\n6.PANEER DISHES\n7.CURD DISHES\n8.SWEETS & ICE-CREAM");
        ch=inp.nextInt();
        switch(ch){
            case 1: j.vegetarianThali();break;
            case 2: j.breakfastMenu();break;
            case 3: j.soupMenu();break;
            case 4: j.mocktail();break;
            case 5: j.paneerStarters();break;
            case 6: j.paneerDishes();break;
            case 7: j.curdDishes();break;
            case 8: j.sweetsOrIceCream();break;
            case 10:System.out.println("Exiting");break;
            default:
            System.out.println("Invalid choice");
        }
        }while(ch!=10);
        System.out.println(RESET);
    }

}

class JMB {
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String MAROON = "\u001B[48;5;52m";
    public static final String BG = "\u001B[47m";

    JMB() {
        vegetarianThali();
        breakfastMenu();
        soupMenu();
        mocktail();
        paneerStarters();
        paneerDishes();
        curdDishes();
        sweetsOrIceCream();
    }

    // ---------------- VEGETARIAN THALI ----------------
    void vegetarianThali() {
        double price[] = {310, 360, 410, 470, 600, 700};
        System.out.println(RESET+BOLD + MAROON + "\n=== VEGETARIAN THALI MENU ===" + RESET+BG);
        System.out.printf("%-20s %10s\n", "Thali Name", "Price (Rs)");
        for (int i = 0; i < price.length; i++) {
            System.out.printf("Special Thali %-5d %10.2f\n", (i + 1), price[i]);
        }
    }

    // ---------------- BREAKFAST MENU ----------------
    void breakfastMenu() {
        double price[] = {200, 230, 250};
        char c = 'A';
        System.out.println(RESET+BOLD + MAROON + "\n=== BREAKFAST MENU ===" + RESET+BG);
        System.out.printf("%-10s %10s\n", "Type", "Price (Rs)");
        for (int i = 0; i < price.length; i++) {
            System.out.printf("Type %-5c %10.2f\n", c, price[i]);
            c++;
        }
    }

    // ---------------- SOUP MENU ----------------
    void soupMenu() {
        String soup[] = {"Tomato Soup", "Veg Soup", "Hot & Sour Veg Soup", "Lemon Coriander"};
        double price[] = {50, 60, 75, 65};
        System.out.println(RESET+BOLD + MAROON + "\n=== SOUP MENU ===" + RESET+BG);
        System.out.printf("%-25s %10s\n", "Soup", "Price (Rs)");
        for (int i = 0; i < soup.length; i++) {
            System.out.printf("%-25s %10.2f\n", soup[i], price[i]);
        }
    }

    // ---------------- MOCKTAIL ----------------
    void mocktail() {
        String mocktails[] = {"Blue Lagoon", "Blowgun Kesher Pista", "Fresh Lime Water", "Butter Milk",
                "Orange Pink City", "Strawberry Delight", "Jal Jeera", "Rasna Water"};
        double price[] = {100, 120, 80, 60, 140, 160, 70, 50};
        System.out.println(RESET+BOLD + MAROON + "\n=== MOCKTAIL MENU ===" + RESET+BG);
        System.out.printf("%-25s %10s\n", "Mocktail", "Price (Rs)");
        for (int i = 0; i < mocktails.length; i++) {
            System.out.printf("%-25s %10.2f\n", mocktails[i], price[i]);
        }
    }

    // ---------------- PANEER STARTERS ----------------
    void paneerStarters() {
        String paneer[] = {"Paneer Chilli", "Paneer Tikka", "Dragon Paneer", "Paneer 65",
                "Paneer Pudina Tikka", "Paneer Achari Tikka"};
        double price[] = {200, 220, 250, 210, 230, 240};
        System.out.println(RESET+BOLD + MAROON + "\n=== PANEER STARTERS ===" + RESET+BG);
        System.out.printf("%-25s %10s\n", "Starter", "Price (Rs)");
        for (int i = 0; i < paneer.length; i++) {
            System.out.printf("%-25s %10.2f\n", paneer[i], price[i]);
        }
    }

    // ---------------- PANEER DISHES ----------------
    void paneerDishes() {
        String paneer[] = {"Paneer Butter Masala", "Paneer Punjabi", "Paneer Palak", "Paneer Mutter",
                "Paneer Do Pyaza", "Paneer Tikka Masala", "Paneer Kadai", "Methi Paneer",
                "Corn Paneer", "Paneer Kolhapuri", "Paneer Chatpatta"};
        double price[] = {250, 240, 230, 220, 240, 260, 250, 230, 220, 270, 210};
        System.out.println(RESET+BOLD + MAROON + "\n=== PANEER DISHES ===" + RESET+BG);
        System.out.printf("%-25s %10s\n", "Dish", "Price (Rs)");
        for (int i = 0; i < paneer.length; i++) {
            System.out.printf("%-25s %10.2f\n", paneer[i], price[i]);
        }
    }

    // ---------------- CURD DISHES ----------------
    void curdDishes() {
        String curd[] = {"Veg Raita", "Loki Raita", "Aloo Raita", "Dahi Papdi",
                "Boondi Raita", "Fruit Raita", "Dahi Vada"};
        double price[] = {80, 90, 70, 100, 75, 120, 110};
        System.out.println(RESET+BOLD + MAROON + "\n=== CURD DISHES ===" + RESET+BG);
        System.out.printf("%-20s %10s\n", "Curd Dish", "Price (Rs)");
        for (int i = 0; i < curd.length; i++) {
            System.out.printf("%-20s %10.2f\n", curd[i], price[i]);
        }
    }

    // ---------------- SWEETS / ICE-CREAM ----------------
    void sweetsOrIceCream() {
        String sweet[] = {"Gulab Jamun", "Gajar Ka Halwa", "Aam Khand", "Vanilla",
                "Moong Ka Halwa", "Butter Scotch", "Shreekhand", "Sitaphal Basundi"};
        double price[] = {80, 100, 120, 90, 110, 130, 140, 150};
        System.out.println(RESET+BOLD + MAROON + "\n=== SWEETS & ICE-CREAM ===" + RESET+BG);
        System.out.printf("%-25s %10s\n", "Sweet / Ice Cream", "Price (Rs)");
        for (int i = 0; i < sweet.length; i++) {
            System.out.printf("%-25s %10.2f\n", sweet[i], price[i]);
        }
    }
    
    
}
