import java.util.Scanner;

class Main {
    public static Scanner inp = new Scanner(System.in);

    // Color codes
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String MAROON = "\u001B[48;5;52m";
    public static final String BG = "\u001B[47m";
    public static final String BLACK = "\u001B[30m";


    public static void main(String[] args) {
        int ch;
        System.out.println(BOLD + MAROON);
        System.out.println("               ==================================="+MAROON);
        System.out.println("                          JMB MENU CARD           ");
        System.out.println("               ===================================" + RESET+BG);
        JMB j = new JMB();
        do {
            System.out.println(RESET+BOLD + MAROON+"\n ===== Enter Your Choice ====="+RESET+BG+BLACK);
            System.out.println("1.VEGETARIAN THALI MENU");
            System.out.println("2.BREAKFAST MENU");
            System.out.println("3.SOUP MENU");
            System.out.println("4.MOCKTAIL MENU");
            System.out.println("5.PANEER STARTERS");
            System.out.println("6.PANEER DISHES");
            System.out.println("7.CURD DISHES");
            System.out.println("8.SWEETS & ICE-CREAM");
            System.out.println("9.View Bill & Exit");

            ch = inp.nextInt();
            switch (ch) {
                case 1: j.vegetarianThali(); j.orderThali(); break;
                case 2: j.breakfastMenu(); j.orderBreakfast(); break;
                case 3: j.soupMenu(); j.orderSoup(); break;
                case 4: j.mocktail(); j.orderMocktail(); break;
                case 5: j.paneerStarters(); j.orderPaneerStarter(); break;
                case 6: j.paneerDishes(); j.orderPaneerDish(); break;
                case 7: j.curdDishes(); j.orderCurd(); break;
                case 8: j.sweetsOrIceCream(); j.orderSweet(); break;
                case 9: j.displayBill(); break;
                default: System.out.println("Invalid choice");
            }
        } while (ch != 9);
    }
}

class JMB {
    Scanner inp = new Scanner(System.in);
    JMB() { details();vegetarianThali(); breakfastMenu(); soupMenu(); mocktail(); paneerStarters(); paneerDishes(); curdDishes(); sweetsOrIceCream(); }
    // Colors
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String MAROON = "\u001B[48;5;52m";
    public static final String BG = "\u001B[47m";
    public static final String BLACK = "\u001B[30m";

    //Details info
    String name;
    int guest;
    int mob;

    // Order storage
    String orderedItems[] = new String[100];
    double orderedPrices[] = new double[100];
    int orderedQty[] = new int[100];
    int orderCount = 0;
    double total = 0;

    // ---------------- VEGETARIAN THALI ----------------
    String thali[] = {"Special Thali 1", "Special Thali 2", "Special Thali 3", "Special Thali 4", "Special Thali 5", "Special Thali 6"};
    double thaliPrice[] = {310, 360, 410, 470, 600, 700};
    void vegetarianThali() {
        System.out.println(RESET+BOLD + MAROON + "\n=== VEGETARIAN THALI MENU ===" + RESET+BG+BLACK);
        for (int i = 0; i < thali.length; i++) {
            System.out.printf("%d. %-20s %10.2f\n", (i+1), thali[i], thaliPrice[i]);
        }
    }
    void vegetableA(){ String item[]={"1.Soup or welcome drink","2.Vegetable dish","1.Dal","1.Sweet Dish","Rice","Roti,Naan","Butter Paratha","Pickle, Salad, Papad"}; System.out.println("Group A Food items"); for(String food:item) System.out.println(food); } void vegetableB(){ String item[]={"1.Soup or welcome drink","2.Vegetable dish","1.Paneer dish","1.Dal","1.Sweet Dish or ice-cream","Rice","Roti,Butter Naan,Butter paratha","Butter Paratha","Pickle, Salad, Papad"}; System.out.println("Group B Food items"); for(String food:item) System.out.println(food); } void vegetableC(){ String item[]={"1.Soup or welcome drink","1.Starter","2.Vegetable dish","Curd dish","1.Paneer dish","1.Dal","1.Sweet Dish or ice-cream","Rice","Roti,Butter Naan,Butter paratha","Butter Paratha","Pickle, Salad, Papad"}; System.out.println("Group C Food items"); for(String food:item) System.out.println(food); } void vegetableD(){ String item[]={"1.Soup or welcome drink","2.Vegetable dish","1.Paneer dish","1.Dal","1.Sweet Dish or ice-cream","Rice","Roti,Butter Naan,Butter paratha","Butter Paratha","Pickle, Salad, Papad"}; System.out.println("Group D Food items"); for(String food:item) System.out.println(food); }
    
    void vegetableType(int thaliChoice){
        System.out.println("Ordered Item Full list");
        switch(thaliChoice){
            case 1:vegetableA();break;
            case 2:vegetableB();break;
            case 3:vegetableC();break;
            case 4:vegetableD();break;
            default:System.out.println("Invalid choice");
        }
    }
    
    void orderThali() {
        System.out.println("Enter item number to order (0 to skip):");
        int choice = inp.nextInt();
        if(choice >=1 && choice <= thali.length){
            vegetableType(choice);
            addOrder(thali[choice-1], thaliPrice[choice-1]);
        }
    }
    
    // ---------------- BREAKFAST ----------------
    String breakfast[] = {"Type A", "Type B", "Type C"};
    double breakfastPrice[] = {200, 230, 250};
    void breakfastMenu() {
        System.out.println(RESET+BOLD + MAROON + "\n=== BREAKFAST MENU ===" + RESET+BG+BLACK);
        for (int i = 0; i < breakfast.length; i++) {
            System.out.printf("%d. %-15s %10.2f\n", (i+1), breakfast[i], breakfastPrice[i]);
        }
    }
    void breakfastType(char choiceBreak){
        System.out.println("Ordered Item Full list");
        switch(choiceBreak){
            case 'A':breakfastA();break;
            case 'B':breakfastB();break;
            case 'C':breakfastC();break;
            default:System.out.println("Invalid choice");
            // case 'B':breakfastB();break;
        }
    }
    void breakfastA(){ System.out.println("Breakfast of type A"); String items[]={"1.Poha","1.Jalebi","1.Bread item","1.Tea or coffee"}; for(String item:items){ System.out.println(item); } } void breakfastB(){ System.out.println("Breakfast of type B"); String items[]={"1.Poha","1.Jalebi","1.Bread item","1.Heavy snacks","1.Tea or coffee"}; for(String item:items){ System.out.println(item); } } void breakfastC(){ System.out.println("Breakfast of type C"); String items[]={"1.Poha","1.Jalebi","1.Bread item","2.Heavy snacks","1.Tea or coffee"}; for(String item:items){ System.out.println(item); } }
    void orderBreakfast() {
        System.out.println("Enter item number to order (0 to skip):");
        int choice = inp.nextInt();
        if(choice >=1 && choice <= breakfast.length){
           char breakChoice=breakfast[choice-1].charAt((breakfast[choice-1].length())-1);
            breakfastType(breakChoice);
            addOrder(breakfast[choice-1], breakfastPrice[choice-1]);
        }
    }

    // ---------------- SOUP ----------------
    String soup[] = {"Tomato Soup", "Veg Soup", "Hot & Sour Veg Soup", "Lemon Coriander"};
    double soupPrice[] = {50, 60, 75, 65};
    void soupMenu() {
        System.out.println(RESET+BOLD + MAROON + "\n=== SOUP MENU ===" + RESET+BG+BLACK);
        for (int i = 0; i < soup.length; i++) {
            System.out.printf("%d. %-25s %10.2f\n", (i+1), soup[i], soupPrice[i]);
        }
    }
    void orderSoup() {
        System.out.println("Enter item number to order (0 to skip):");
        int choice = inp.nextInt();
        if(choice >=1 && choice <= soup.length){
            addOrder(soup[choice-1], soupPrice[choice-1]);
        }
    }

    // ---------------- MOCKTAIL ----------------
    String mocktails[] = {"Blue Lagoon", "Blowgun Kesher Pista", "Fresh Lime Water", "Butter Milk",
                          "Orange Pink City", "Strawberry Delight", "Jal Jeera", "Rasna Water"};
    double mocktailPrice[] = {100, 120, 80, 60, 140, 160, 70, 50};
    void mocktail() {
        System.out.println(RESET+BOLD + MAROON + "\n=== MOCKTAIL MENU ===" + RESET+BG+BLACK);
        for (int i = 0; i < mocktails.length; i++) {
            System.out.printf("%d. %-25s %10.2f\n", (i+1), mocktails[i], mocktailPrice[i]);
        }
    }
    void orderMocktail() {
        System.out.println("Enter item number to order (0 to skip):");
        int choice = inp.nextInt();
        if(choice >=1 && choice <= mocktails.length){
            addOrder(mocktails[choice-1], mocktailPrice[choice-1]);
        }
    }

    // ---------------- PANEER STARTERS ----------------
    String paneerStarter[] = {"Paneer Chilli", "Paneer Tikka", "Dragon Paneer", "Paneer 65",
                              "Paneer Pudina Tikka", "Paneer Achari Tikka"};
    double paneerStarterPrice[] = {200, 220, 250, 210, 230, 240};
    void paneerStarters() {
        System.out.println(RESET+BOLD + MAROON + "\n=== PANEER STARTERS ===" + RESET+BG+BLACK);
        for (int i = 0; i < paneerStarter.length; i++) {
            System.out.printf("%d. %-25s %10.2f\n", (i+1), paneerStarter[i], paneerStarterPrice[i]);
        }
    }
    void orderPaneerStarter() {
        System.out.println("Enter item number to order (0 to skip):");
        int choice = inp.nextInt();
        if(choice >=1 && choice <= paneerStarter.length){
            addOrder(paneerStarter[choice-1], paneerStarterPrice[choice-1]);
        }
    }

    // ---------------- PANEER DISHES ----------------
    String paneerDish[] = {"Paneer Butter Masala", "Paneer Punjabi", "Paneer Palak", "Paneer Mutter",
                           "Paneer Do Pyaza", "Paneer Tikka Masala", "Paneer Kadai", "Methi Paneer",
                           "Corn Paneer", "Paneer Kolhapuri", "Paneer Chatpatta"};
    double paneerDishPrice[] = {250, 240, 230, 220, 240, 260, 250, 230, 220, 270, 210};
    void paneerDishes() {
        System.out.println(RESET+BOLD + MAROON + "\n=== PANEER DISHES ===" + RESET+BG+BLACK);
        for (int i = 0; i < paneerDish.length; i++) {
            System.out.printf("%d. %-25s %10.2f\n", (i+1), paneerDish[i], paneerDishPrice[i]);
        }
    }
    void orderPaneerDish() {
        System.out.println("Enter item number to order (0 to skip):");
        int choice = inp.nextInt();
        if(choice >=1 && choice <= paneerDish.length){
            addOrder(paneerDish[choice-1], paneerDishPrice[choice-1]);
        }
    }

    // ---------------- CURD DISHES ----------------
    String curd[] = {"Veg Raita", "Loki Raita", "Aloo Raita", "Dahi Papdi",
                     "Boondi Raita", "Fruit Raita", "Dahi Vada"};
    double curdPrice[] = {80, 90, 70, 100, 75, 120, 110};
    void curdDishes() {
        System.out.println(RESET+BOLD + MAROON + "\n=== CURD DISHES ===" + RESET+BG+BLACK);
        for (int i = 0; i < curd.length; i++) {
            System.out.printf("%d. %-20s %10.2f\n", (i+1), curd[i], curdPrice[i]);
        }
    }
    void orderCurd() {
        System.out.println("Enter item number to order (0 to skip):");
        int choice = inp.nextInt();
        if(choice >=1 && choice <= curd.length){
            addOrder(curd[choice-1], curdPrice[choice-1]);
        }
    }

    // ---------------- SWEETS ----------------
    String sweet[] = {"Gulab Jamun", "Gajar Ka Halwa", "Aam Khand", "Vanilla",
                      "Moong Ka Halwa", "Butter Scotch", "Shreekhand", "Sitaphal Basundi"};
    double sweetPrice[] = {80, 100, 120, 90, 110, 130, 140, 150};
    void sweetsOrIceCream() {
        System.out.println(RESET+BOLD + MAROON + "\n=== SWEETS & ICE-CREAM ===" + RESET+BG+BLACK);
        for (int i = 0; i < sweet.length; i++) {
            System.out.printf("%d. %-25s %10.2f\n", (i+1), sweet[i], sweetPrice[i]);
        }
    }
    void orderSweet() {
        System.out.println("Enter item number to order (0 to skip):");
        int choice = inp.nextInt();
        if(choice >=1 && choice <= sweet.length){
            addOrder(sweet[choice-1], sweetPrice[choice-1]);
        }
    }

    // ---------------- ORDER SYSTEM ----------------
    void addOrder(String item, double price) {
        orderedItems[orderCount] = item;
        orderedPrices[orderCount] = price;
        total += price * guest;
        orderCount++;
        System.out.println(item + " added to order.");
    }
    void details(){
        System.out.print(BLACK+"Enter your name : ");
        name=inp.nextLine().toLowerCase();
        System.out.print("Enter total number of guest : ");
        guest=inp.nextInt();
        System.out.print("Enter mobile number : "+RESET);
        mob=inp.nextInt();
    }
    void displayBill() {
        System.out.println("\n");
        System.out.println(RESET+BOLD + MAROON + "\n\t\t=============== FINAL BILL ===============" + RESET+BG+BLACK);
        System.out.printf("%-25s %-10s %-10s\n", "Item", "Qty", "Price(Rs)");
        for (int i = 0; i < orderCount; i++) {
            System.out.printf("%-25s %-10d %-10.2f\n", orderedItems[i], guest, orderedPrices[i]);
        }
        System.out.println("--------------------------------------------");
        System.out.printf("TOTAL: Rs %.2f\n", total);
        System.out.println(RESET+BOLD + MAROON + "\t\t========== THANK YOU VISIT AGAIN ! ==========" + RESET);
        System.out.println(RESET);
    }
}
