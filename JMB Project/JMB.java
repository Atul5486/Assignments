import java.util.Scanner;
import java.time.LocalDate;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

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
    Locale indiaLocale = new Locale("en", "IN");
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(indiaLocale);
    Scanner inp = new Scanner(System.in);
    JMB() { details();vegetarianThali(); breakfastMenu(); soupMenu(); mocktail(); paneerStarters(); paneerDishes(); curdDishes(); sweetsOrIceCream(); }
    // Colors
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String MAROON = "\u001B[48;5;52m";
    public static final String BG = "\u001B[47m";
    public static final String BLACK = "\u001B[30m";
    public static final String MAGENTA ="\u001b[45m";
    public static String RED = "\u001B[41m";

    //Details info
    String name;
    int guest;
    int currGuest;
    long mob;
    String date;
    String billno="JMB"+String.valueOf((int)(Math.random()*10000));
    // Order storage
    String orderedItems[] = new String[100];
    double orderedPrices[] = new double[100];
    int orderedQty[] = new int[100];
    int orderCount = 0;
    double total = 0;
    String pattern = "dd-MM-yyyy";

    // //--------------- SELECTED THALI --------------

    String selectedItem1[]={"1.Soup or welcome drink","2.Vegetable dish"," ","1.Dal","1.Sweet Dish","1.Rice"};
    String selectedItem2[]={"1.Soup or welcome drink","2.Vegetable dish"," ","1.Dal","1.Sweet Dish or ice-cream","1.Rice","1.Paneer dish"};
    String selectedItem3[]={"1.Soup or welcome drink","2.Vegetable dish"," ","1.Dal","1.Sweet Dish or ice-cream","1.Rice","1.Paneer dish","1.Starter","Curd dish"};
    String selectedItem4[]={"1.Soup or welcome drink","2.Vegetable dish"," ","1.Dal","1.Sweet Dish or ice-cream","1.Rice","1.Paneer dish","1.Starter","Curd dish"};
    String selectedItem5[]={"1.Soup or welcome drink","2.Vegetable dish"," ","1.Dal","1.Sweet Dish or ice-cream","1.Rice","1.Paneer dish","1.Starter","Curd dish","1. Paneer Starter","1. Pasta (1 Type)","1. Ice-cream or Coffee"};
    String selectedItem6[]={"1.Soup or welcome drink","2.Vegetable dish"," ","1.Dal","1.Sweet Dish or ice-cream","1.Rice","1.Paneer dish","1.Starter","Curd dish","1. Paneer Starter","1. Pasta (1 Type)","1. Ice-cream or Coffee",""};

    // ---------------- VEGETARIAN THALI ----------------
    String thali[] = {"Special Thali 1", "Special Thali 2", "Special Thali 3", "Special Thali 4", "Special Thali 5", "Special Thali 6"};
    double thaliPrice[] = {310, 360, 410, 470, 600, 700};
    void vegetarianThali() {
        System.out.println(RESET+BOLD + MAROON + "\n=== VEGETARIAN THALI MENU ===" + RESET+BG+BLACK);
        for (int i = 0; i < thali.length; i++) {
            System.out.printf("%d. %-20s %10.2f\n", (i+1), thali[i], thaliPrice[i]);
        }
    }
    void vegetableA(){ 
        String item[]={"1.Soup or welcome drink","2.Vegetable dish","1.Dal","1.Sweet Dish","1.Rice","Roti,Naan","Butter Paratha","Pickle, Salad, Papad"};
        System.out.println(RESET+BOLD + MAROON + "\nGroup A Food Items (Rs. 310/-)" + RESET+BG+BLACK);
        for(String food:item)
        System.out.println(food);
    }
     void vegetableB(){
        String item[]={"1.Soup or welcome drink","2.Vegetable dish","1.Paneer dish","1.Dal","1.Sweet Dish or ice-cream","1.Rice","Roti,Butter Naan,Butter paratha","Butter Paratha","Pickle, Salad, Papad"};
        System.out.println(RESET+BOLD + MAROON + "\nGroup B Food Items (Rs. 370/-)" + RESET+BG+BLACK);
        for(String food:item)
        System.out.println(food);
    }
     void vegetableC(){
        String item[]={"1.Soup or welcome drink","1.Starter","2.Vegetable dish","Curd dish","1.Paneer dish","1.Dal","1.Sweet Dish or ice-cream","1.Rice","Roti,Butter Naan,Butter paratha","Butter Paratha","Pickle, Salad, Papad"};
        System.out.println(RESET+BOLD + MAROON + "\nGroup C Food Items (Rs. 410/-)" + RESET+BG+BLACK);
        for(String food:item) 
        System.out.println(food); 
    } 
    void vegetableD(){
            String item[]={"1.Soup or welcome drink","2.Vegetable dish","1.Paneer dish","1.Dal","1.Sweet Dish or ice-cream","Rice","Roti,Butter Naan,Butter paratha","Butter Paratha","Pickle, Salad, Papad"};
            System.out.println(RESET+BOLD + MAROON + "\nGroup D Food Items (Rs. 470/-)" + RESET+BG+BLACK);
            for(String food:item)
            System.out.println(food);
    }
    void vegetableE() {
    String items[] = {"1. Soup or Welcome Drink","1. Starter","1. Paneer Starter","1. Pasta (1 Type)","1. Paneer Dish","2. Vegetable Dish","1. Curd Dish","1. Dal","1. Rice","Roti, Naan, Paratha","Pickle, Salad, Papad","1. Sweet Dish","1. Ice-cream or Coffee"};
    System.out.println(RESET+BOLD + MAROON + "\nGroup E Food Items (Rs. 600/-)" + RESET+BG+BLACK);
    for (String food : items) 
        System.out.println(food);
    
    }
    void vegetableF() {
    String items[] = {"1. Welcome Drink","2. Soup","3. Starter","1. Paneer Starter","1. Chinese Item","1. Paneer Dish","2. Vegetable Dish","1. Curd Dish","1. Dal","1. Rice","Roti, Naan, Paratha","Pickle, Salad, Papad","2. Sweet Dish","1. Ice-cream"};
    System.out.println(RESET+BOLD + MAROON + "\nGroup F Food Items (Rs. 700/-)" + RESET+BG+BLACK);
    for (String food : items) {
        System.out.println(food);
    }
    }   
void vegetableType(int thaliChoice){
        System.out.println("Ordered Item Full list");
        switch(thaliChoice){
            case 1:vegetableA();soupOrDrink(selectedItem1);allVegitable(selectedItem1);dalList(selectedItem1);sweetsList(selectedItem1);riceList(selectedItem1);dis(selectedItem1);break;
            case 2:vegetableB();soupOrDrink(selectedItem2);allVegitable(selectedItem2);paneerOrder(selectedItem2);dalList(selectedItem2);sweetsList(selectedItem2);riceList(selectedItem2);dis(selectedItem2);break;
            case 3:vegetableC();soupOrDrink(selectedItem3);starterList(selectedItem3);allVegitable(selectedItem3);curdOrder(selectedItem3);paneerOrder(selectedItem3);dalList(selectedItem3);sweetsList(selectedItem3);riceList(selectedItem3);dis(selectedItem3);break;
            case 4:vegetableD();soupOrDrink(selectedItem4);starterList(selectedItem4);allVegitable(selectedItem4);curdOrder(selectedItem4);paneerOrder(selectedItem4);dalList(selectedItem4);sweetsList(selectedItem4);riceList(selectedItem4);dis(selectedItem4);break;
            case 5:vegetableE();soupOrDrink(selectedItem5);starterList(selectedItem5);allVegitable(selectedItem5);pastaList(selectedItem5);curdOrder(selectedItem5);paneerStarterOrder(selectedItem5);paneerOrder(selectedItem5);dalList(selectedItem5);sweetsList(selectedItem5);riceList(selectedItem5);coffeeList(selectedItem5);dis(selectedItem5);break;
            case 6:vegetableF();soupSpecial();welcomeDrink(selectedItem6);starterSpecial(selectedItem6);paneerStarterOrder(selectedItem6);chineseItems();paneerOrder(selectedItem6);allVegitable(selectedItem6);curdOrder(selectedItem6);dalList(selectedItem6);riceList(selectedItem6);sweetsList(selectedItem6);iceCreamList(selectedItem6);dis(selectedItem6);break;
            
            default:System.out.println(RED+"Invalid choice"+BG);
        }
}
    
    void orderThali() {
        System.out.println("Enter item number to order (0 to skip):");
        int choice = inp.nextInt();
        if(choice >=1 && choice <= thali.length){
            vegetableType(choice);
        if(orderedItems.length>=0){
        boolean isAlreadyOrdered = false;
        for (int i = 0; i <= orderCount; i++) {
            if (thali[choice - 1].equals(orderedItems[i])) {
             System.out.println("\n" + MAGENTA + "Item already added" + BG);
            isAlreadyOrdered = true;
            break;
     }
    }
        if (!isAlreadyOrdered) {
            addOrder(thali[choice - 1], thaliPrice[choice - 1]);
        }

            }
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
            default:System.out.println(RED+"Invalid choice"+BG);
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

        if(orderedItems.length>=0){
        boolean isAlreadyOrdered = false;
        for (int i = 0; i <= orderCount; i++) {
            if(breakfast[choice-1].equals(orderedItems[i])){
             System.out.println("\n" + MAGENTA + "Item already added" + BG);
            isAlreadyOrdered = true;
            break;
            }
        }   
        if (!isAlreadyOrdered) {
            addOrder(breakfast[choice-1], breakfastPrice[choice-1]);
        }

      }
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
            if(orderedItems.length>=0){
        boolean isAlreadyOrdered = false;
        for (int i = 0; i <= orderCount; i++) {
             if(soup[choice-1].equals(orderedItems[i])){
                System.out.println("\n"+MAGENTA+"Item already added"+BG);
            isAlreadyOrdered = true;
            break;
     }
    }
        if (!isAlreadyOrdered) {
            addOrder(soup[choice-1], soupPrice[choice-1]);
        }
            }          
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
        boolean isAlreadyOrdered = false;
        if(choice >=1 && choice <= mocktails.length){
         if(orderedItems.length>=0){
        for(int i=0;i<=orderCount;i++){
             if(mocktails[choice-1].equals(orderedItems[i])){
                System.out.println("\n"+MAGENTA+"Item already added"+BG);
            isAlreadyOrdered = true;
            break;
     }
    }
        if (!isAlreadyOrdered) {
            addOrder(mocktails[choice-1], mocktailPrice[choice-1]);
        }
            }          
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
        String selectedItem = paneerStarter[choice - 1];
        boolean isAlreadyOrdered = false;
        if (choice == 0) return;

        if (choice < 1 || choice > paneerStarter.length) {
        System.out.println(RED+"Invalid choice. Please try again."+BG);
        return;
         }

        for (int i = 0; i < orderCount; i++) { 
        if (orderedItems[i].equals(selectedItem)) {
            isAlreadyOrdered = true;
            break;
        }
      }
        if (!isAlreadyOrdered) {
        addOrder(selectedItem, paneerStarterPrice[choice - 1]);
    } else {
            System.out.println("\n"+MAGENTA+"Item already added"+BG);
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
        String selectedItem = paneerDish[choice - 1];
        boolean isAlreadyOrdered = false;
        if (choice == 0) return;

        if (choice < 1 || choice > paneerDish.length) {
        System.out.println(RED+"Invalid choice. Please try again."+BG);
        return;
         }

        for (int i = 0; i < orderCount; i++) { 
        if (orderedItems[i].equals(selectedItem)) {
            isAlreadyOrdered = true;
            break;
        }
      }
        if (!isAlreadyOrdered) {
        addOrder(paneerDish[choice-1], paneerDishPrice[choice-1]);
    } else {
            System.out.println("\n"+MAGENTA+"Item already added"+BG);
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
        String selectedItem = curd[choice - 1];
        boolean isAlreadyOrdered = false;
        if (choice == 0) return;

        if (choice < 1 || choice > curd.length) {
        System.out.println(RED+"Invalid choice. Please try again."+BG);
        return;
         }

        for (int i = 0; i < orderCount; i++) { 
        if (orderedItems[i].equals(selectedItem)) {
            isAlreadyOrdered = true;
            break;
        }
      }
        if (!isAlreadyOrdered) {
        addOrder(curd[choice-1], curdPrice[choice-1]);
    } else {
            System.out.println("\n"+MAGENTA+"Item already added"+BG);
    }
    }
    // ---------------- SWEETS ----------------
    String sweet[] = {"Gulab Jamun", "Gajar Ka Halwa", "Aam Khand", "Vanilla",
                      "Moong Ka Halwa", "Shreekhand", "Sitaphal Basundi"};
    double sweetPrice[] = {80, 100, 120, 90, 110, 130, 140, 150};
    void sweetsOrIceCream() {
        System.out.println(RESET+BOLD + MAROON + "\n=== SWEETS LIST ===" + RESET+BG+BLACK);
        for (int i = 0; i < sweet.length; i++) {
            System.out.printf("%d. %-25s %10.2f\n", (i+1), sweet[i], sweetPrice[i]);
        }
    }
    void orderSweet() {
        System.out.println("Enter item number to order (0 to skip):");
        int choice = inp.nextInt();
        String selectedItem = sweet[choice - 1];
        boolean isAlreadyOrdered = false;
        if (choice == 0) return;

        if (choice < 1 || choice > sweet.length) {
        System.out.println(RED+"Invalid choice. Please try again."+BG);
        return;
         }

        for (int i = 0; i < orderCount; i++) { 
        if (orderedItems[i].equals(selectedItem)) {
            isAlreadyOrdered = true;
            break;
        }
      }
        if (!isAlreadyOrdered) {
        addOrder(sweet[choice-1], sweetPrice[choice-1]);
    } else {
            System.out.println("\n"+MAGENTA+"Item already added"+BG);
    }
    }
    String[] starter = {"Spring Rolls", "Momos","French fries", "Cheese Balls", "Bruschetta","Veg lollipop","Noodles"};

    void chineseItems(){
    int ch;
    String items[] = {"Veg Manchurian","Chilli Paneer","Hakka Noodles","Fried Rice","Spring Rolls","Schezwan Noodles","Chilli Mushroom","Crispy Veg"};
     System.out.println(RESET+BOLD + MAROON + "\n=== CHINESE FOOD ITEMS  ===" + RESET+BG+BLACK);
        for (int i = 0; i < items.length; i++) {
            System.out.println((i+1)+". "+items[i]);
        }
        do{
        System.out.println(RESET+BOLD + MAROON + "Enter a choice number "+RESET+BG+BLACK);
        ch=inp.nextInt();
        switch(ch){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:System.out.println(MAGENTA+"You Selected "+items[ch-1]+BG);break;
            default:System.out.println(RED+"Invalid choice"+BG);
        }
        }while(ch<=0 || ch>items.length);
}
    // ---------------- Thali Method ----------
    void soupSpecial(){
        soupMenu();
           int v1,v2;
        do{
        System.out.println(RESET+BOLD + MAROON + "Enter 1 soup "+RESET+BG+BLACK);
        v1=inp.nextInt();
        if(v1<=soup.length)
        System.out.println(MAGENTA+"You Selected "+soup[v1-1]+BG);
        else
        System.out.println(RED+"Invalid choice"+BG);
        }while(v1<0 || v1>4);
        do{
        System.out.println(RESET+BOLD + MAROON + "Enter 2 soup "+RESET+BG+BLACK);
        v2=inp.nextInt();
        if(v1==v2){
            System.out.println("Select another soup");
            v2=inp.nextInt();
        }
        if(v2<=soup.length){
          System.out.println(MAGENTA+"You Selected "+soup[v2-1]+BG);
        }else
        System.out.println(RED+"Invalid choice"+BG);
        }while(v2<0||v2>4|| v1==v2);
    }
void starterSpecial(String[] selectedItems) {
    System.out.println(RESET + BOLD + MAROON + "===== STARTER LIST =====" + RESET + BG + BLACK);

    for (int i = 0; i < starter.length; i++) {
        System.out.println((i + 1) + ". " + starter[i]);
    }

    int[] selections = new int[3]; // to keep track of selected indices
    int i = 0;

    while (i < 3) {
        System.out.println(RESET + BOLD + MAROON + "Enter Starter #" + (i + 1) + RESET + BG + BLACK);
        int choice = inp.nextInt();

        if (choice < 1 || choice > starter.length) {
            System.out.println(RED + "Invalid choice. Please enter a number between 1 and " + starter.length + BG);
            continue;
        }

        boolean duplicate = false;
        for (int j = 0; j < i; j++) {
            if (selections[j] == choice) {
                duplicate = true;
                break;
            }
        }

        if (duplicate) {
            System.out.println(RED + "You have already selected this starter. Choose another one." + BG);
            continue;
        }

        // Store selected starter index
        selections[i] = choice;

        // Append the starter name to selectedItems[12]
        if (selectedItems[12] == null) {
            selectedItems[12] = starter[choice - 1];
        } else {
            selectedItems[12] += ", " + starter[choice - 1];
        }

        System.out.println(MAGENTA + "You Selected " + starter[choice - 1] + BG);
        i++;
    }
}

    void welcomeDrink(String selectedItems[]){
        String drink[]={"Fanta","Mazza","Coke-cola"};
        System.out.println(RESET+BOLD + MAROON + "===== WELCOME DRINK ====="+RESET+BG+BLACK);
        for(int i=0;i<drink.length;i++){
            System.out.println((i+1)+". "+drink[i]);
        }
        int ch;
        do{
        System.out.println(RESET+BOLD + MAROON + "Enter a choice "+RESET+BG+BLACK);
        ch=inp.nextInt();
        switch(ch){
            case 1:
            case 2:
            case 3:System.out.println(MAGENTA+"You Selected "+drink[ch-1]+BG);break;
            default:System.out.println(RED+"Invalid choice"+BG);
        }
        }while(ch<=0 || ch>3);
        selectedItems[0]=drink[ch-1];
    }
    void soupOrDrink(String selectedItems[]){
        int sd;
        do{
        System.out.println(RESET+BOLD + MAROON + "Enter a choice "+RESET+BG+BLACK+"\n1.Soup\n2.Welcome Drink");
        sd=inp.nextInt();
        switch(sd){
                case 1:soupMenu();
                int ch;
                do{
                System.out.println(RESET+BOLD + MAROON + "Enter a choice "+RESET+BG+BLACK);
                ch=inp.nextInt();
        switch(ch){
            case 1:
            case 2:
            case 3:
            case 4:System.out.println(MAGENTA+"You Selected "+soup[ch-1]+BG);break;
            default:System.out.println(RED+"Invalid choice"+BG);
          }
        }while(ch<=0 || ch>4);
        selectedItems[0]=soup[ch-1];
          return;
        case 2:welcomeDrink(selectedItems);return;
        default:System.out.println(MAGENTA+"Re-enter Item"+BG);
        }
        }while(sd!=1||sd!=2);
    }
    void allVegitable(String selectedItems[]){
        String[] veg = {"Veg Kolhapuri", "Veg Jalfrezi", "Veg Kadai", "Vegetable Pulao", "Dal Tadka", "Dal Makhani", "Chana Masala", "Rajma Masala", "Mix Veg Curry", "Aloo Gobi", "Aloo Matar", "Baingan Bharta", "Bhindi Masala", "Stuffed Capsicum", "Tandoori Aloo", "Veg Biryani", "Dum Aloo", "Lauki Kofta", "Malai Kofta", "Kadhi Pakora", "Palak Corn", "Methi Malai Matar", "Vegetable Stew", "Vegetable Hakka Noodles", "Vegetable Manchurian", "Gobi 65", "Tinda Masala", "Arbi Masala", "Kundru Fry", "Sambar"};
        System.out.println(RESET+BOLD + MAROON + "\n===== LIST OF VEGITABLES =====" + RESET+BG+BLACK);
        for(int i=0;i<veg.length;i++){
            System.out.println((i+1)+". "+veg[i]);
        }
        int v1,v2;
        do{
        System.out.println(RESET+BOLD + MAROON + "Enter 1 vegitable "+RESET+BG+BLACK);
        v1=inp.nextInt();
        if(v1<=veg.length)
        System.out.println(MAGENTA+"You Selected "+veg[v1-1]+BG);
        else
        System.out.println(RED+"Invalid choice"+BG);
        }while(v1<0 || v1>30);
        selectedItems[1]=veg[v1-1];
        do{
        System.out.println(RESET+BOLD + MAROON + "Enter 2 vegitable "+RESET+BG+BLACK);
        v2=inp.nextInt();
        if(v1==v2){
            System.out.println("Select another one vegitable");
            v2=inp.nextInt();
        }
        if(v2<=veg.length){
          System.out.println(MAGENTA+"You Selected "+veg[v2-1]+BG);
        }else
        System.out.println(RED+"Invalid choice"+BG);
        }while(v2<0||v2>30|| v1==v2);
        selectedItems[2]=veg[v2-1];
    }
    void dalList(String selectedItems[]){
        int ch;
       String[] dal = {"Dal Makhani", "Tadka Dal", "Dal Fry", "Chana Dal", "Moong Dal", "Panchmel Dal", "Masoor Dal", "Dal Tadka with Butter", "Dal Bukhara", "Dal Palak"};
        System.out.println(RESET+BOLD + MAROON + "===== DAL LIST ====="+RESET+BG+BLACK);
        for(int i=0;i<dal.length;i++){
            System.out.println((i+1)+". "+dal[i]);
        }
        do{
        System.out.println(RESET+BOLD + MAROON + "Enter a choice number "+RESET+BG+BLACK);
        ch=inp.nextInt();
        switch(ch){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:System.out.println(MAGENTA+"You Selected "+dal[ch-1]+BG);break;
            default:System.out.println(RED+"Invalid choice"+BG);
        }
        }while(ch<=0 || ch>10);
        selectedItems[3]=dal[ch-1];
    }
    void iceCreamList(String selectedItems[]){
        int ch;
        String[] iceCream = {"Vanilla", "Chocolate", "Strawberry", "Mango", "Butterscotch"};
        System.out.println(RESET+BOLD + MAROON + "===== Ice-Cream LIST ====="+RESET+BG+BLACK);
        for(int i=0;i<iceCream.length;i++){
            System.out.println((i+1)+". "+iceCream[i]);
        }
        do{
        System.out.println(RESET+BOLD + MAROON + "Enter a choice number "+RESET+BG+BLACK);
        ch=inp.nextInt();
        switch(ch){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:System.out.println(MAGENTA+"You Selected "+iceCream[ch-1]+BG);break;
            default:System.out.println(RED+"Invalid choice"+BG);
        }
        }while(ch<=0 || ch>5);
        selectedItems[11]=iceCream[ch-1];
    }
    void riceList(String selectedItems[]){ 
        int ch;
        String[] rice = {"Basmati Rice", "Jeera Rice", "Fried Rice", "Saffron Rice", "Lemon Rice"};
        System.out.println(RESET+BOLD + MAROON + "===== RICE LIST ====="+RESET+BG+BLACK);
        for(int i=0;i<rice.length;i++){
            System.out.println((i+1)+". "+rice[i]);
        }
        do{
        System.out.println(RESET+BOLD + MAROON + "Enter a choice number "+RESET+BG+BLACK);
        ch=inp.nextInt();
        switch(ch){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:System.out.println(MAGENTA+"You Selected "+rice[ch-1]+BG);break;
            default:System.out.println(RED+"Invalid choice"+BG);
        }
        }while(ch<=0 || ch>5);
        selectedItems[5]=rice[ch-1];
    }
    void pastaList(String selectedItems[]){
        int ch;
        String[] pasta = {"White Sauce Pasta", "Red Sauce Pasta", "Cheese Pasta", "Veggie Pasta", "Macaroni Pasta", "Penne Pasta", "Garlic Butter Pasta", "Masala Pasta", "Herb Pasta"};
        System.out.println(RESET+BOLD + MAROON + "===== PASTA LIST ====="+RESET+BG+BLACK);
        for(int i=0;i<pasta.length;i++){
            System.out.println((i+1)+". "+pasta[i]);
        }
        do{
        System.out.println(RESET+BOLD + MAROON + "Enter a choice number "+RESET+BG+BLACK);
        ch=inp.nextInt();
        switch(ch){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:System.out.println(MAGENTA+"You Selected "+pasta[ch-1]+BG);break;
            default:System.out.println(RED+"Invalid choice"+BG);
        }
        }while(ch<=0 || ch>9);
        selectedItems[10]=pasta[ch-1];
    }
    void coffeeList(String selectedItems[]){
        int ch;
        String[] coffee = {"Espresso", "Cappuccino", "Latte", "Americano", "Mocha", "Macchiato", "Irish Coffee", "Cold Coffee"};
        System.out.println(RESET+BOLD + MAROON + "===== COFFEE LIST ====="+RESET+BG+BLACK);
        for(int i=0;i<coffee.length;i++){
            System.out.println((i+1)+". "+coffee[i]);
        }
        do{
        System.out.println(RESET+BOLD + MAROON + "Enter a choice number "+RESET+BG+BLACK);
        ch=inp.nextInt();

        switch(ch){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:System.out.println(MAGENTA+"You Selected "+coffee[ch-1]+BG);break;
            default:System.out.println(RED+"Invalid choice"+BG);
        }
        }while(ch<=0 || ch>8);
        selectedItems[11]=coffee[ch-1];
    }
    void starterList(String selectedItems[]){
        int ch;
        System.out.println(RESET+BOLD + MAROON + "===== STARTER LIST ====="+RESET+BG+BLACK);
        for(int i=0;i<starter.length;i++){
            System.out.println((i+1)+". "+starter[i]);
        }
        do{
        System.out.println(RESET+BOLD + MAROON + "Enter a choice number "+RESET+BG+BLACK);
        ch=inp.nextInt();
        switch(ch){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:System.out.println(MAGENTA+"You Selected "+starter[ch-1]+BG);break;
            default:System.out.println(RED+"Invalid choice"+BG);
        }
        }while(ch<=0 || ch>7);
        selectedItems[7]=starter[ch-1];
    }
    void curdOrder(String selectedItems[]){
        curdDishes();
        int ch;
        do{
        System.out.println(RESET+BOLD + MAROON + "Enter a choice number "+RESET+BG+BLACK);
        ch=inp.nextInt();
        switch(ch){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:System.out.println(MAGENTA+"You Selected "+curd[ch-1]+BG);break;
            default:System.out.println(RED+"Invalid choice"+BG);
        }
        }while(ch<=0 || ch>7);
        selectedItems[8]=curd[ch-1];
    }
    void paneerOrder(String selectedItems[]){
        System.out.println(RESET+BOLD + MAROON + "===== PANEER DISH LIST =====" + RESET+BG+BLACK);
        for(int i=0;i<paneerDish.length;i++)
        System.out.println((i+1)+". "+paneerDish[i]);
        int ch;
        do{
        System.out.println(RESET+BOLD + MAROON + "Enter a choice number "+RESET+BG+BLACK);
        ch=inp.nextInt();
        switch(ch){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:System.out.println(MAGENTA+"You Selected "+paneerDish[ch-1]+BG);break;
            default:System.out.println(RED+"Invalid choice"+BG);
        }
        }while(ch<=0 || ch>11);
        selectedItems[6]=paneerDish[ch-1];
    }
    void paneerStarterOrder(String selectedItems[]){
        System.out.println(RESET+BOLD + MAROON + "===== PANEER STARTER LIST =====" + RESET+BG+BLACK);
        for(int i=0;i<paneerStarter.length;i++)
        System.out.println((i+1)+". "+paneerStarter[i]);
        int ch;
        do{
        System.out.println(RESET+BOLD + MAROON + "Enter a choice number "+RESET+BG+BLACK);
        ch=inp.nextInt();
        switch(ch){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:System.out.println(MAGENTA+"You Selected "+paneerStarter[ch-1]+BG);break;
            default:System.out.println(RED+"Invalid choice"+BG);
        }
        }while(ch<=0 || ch>6);
        selectedItems[9]=paneerStarter[ch-1];
    }
    void sweetsList(String selectedItems[]){
        System.out.println(RESET+BOLD + MAROON + "===== SWEETS LIST =====" + RESET+BG+BLACK);
        for(int i=0;i<sweet.length;i++)
        System.out.println((i+1)+". "+sweet[i]);
        int ch;
        do{
        System.out.println(RESET+BOLD + MAROON + "Enter a choice number "+RESET+BG+BLACK);
        ch=inp.nextInt();
        switch(ch){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:System.out.println(MAGENTA+"You Selected "+sweet[ch-1]+BG);break;
            default:System.out.println(RED+"Invalid choice"+BG);
        }
        }while(ch<=0 || ch>7);
        selectedItems[4]=sweet[ch-1];
    }
        // ---------------- ORDER SYSTEM ----------------
    void addOrder(String item, double price) {
        orderedItems[orderCount] = item;
        orderedPrices[orderCount] = price;
        total += price * guest;
        orderCount++;
        System.out.println(item + " added to order.");
    }
    boolean great(String dateString, String pattern) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            LocalDate inputDate = LocalDate.parse(dateString, formatter);

            LocalDate currentDate = LocalDate.now();

            return inputDate.isAfter(currentDate);
        
    }
    void details(){
        System.out.print(BG+BLACK+"Enter your name : ");
        name=inp.nextLine();
        do{
        System.out.print("Enter total number of guest : ");
        guest=inp.nextInt();
        }while(guest<=0 ||guest>1000);

        System.out.print("Enter mobile number : "+BG);
        mob=inp.nextLong();
        do{
        System.out.print("Enter event date(foramte dd/mm/yy) : ");
        date=inp.next();
        }while(!date.matches("^(0[1-9]|[12][0-9]|3[01])/(0[0-9]|1[0-2])/\\d{4}$"));
    }
    void displayBill() {
        System.out.println(RESET+BOLD + MAROON + "How many guest present here" + RESET+BG+BLACK);
        currGuest=inp.nextInt();
        int extra=0;
        if(guest>=100){
            extra=5;
        }
        if(currGuest<=guest){
            total=total;
        }
        else if(currGuest>(guest+extra)){
            int rem=currGuest-guest;
            for(int i=0;i<orderedPrices.length;i++){
                total+=rem*orderedPrices[i];
            }
        }
        System.out.print("\u001b[2J\u001b[H");
        System.out.println(RESET+BOLD + MAROON + "\n\t\t===============  JMB BILL   ===============" + RESET+BG+BLACK);
        System.out.println("\n--------------------------------------------\n");
        System.out.printf("%-10s%2s%25s%2s%n", "Bill No:", billno, "Customer Name:", name);
        System.out.printf("%-10s%2s%25s%2s%n", "No. of guest:", currGuest,"Booking Date:", date);
        System.out.println("Mobile no : "+ mob);
        System.out.println("Today date : "+LocalDate.now());
        System.out.println("\n------------------------------------------------------");
        System.out.printf("S.no"+"%-25s %-10s %-10s\n", "  Item", "Qty", "Price(Rs)");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < orderCount; i++) {
            System.out.printf((i+1)+".  %-25s %-10d %-10.2f\n", orderedItems[i], currGuest, orderedPrices[i]);
        }
        System.out.println("------------------------------------------------------");
        System.out.printf("TOTAL: %s\n", currencyFormatter.format(total));
        double gst=total*9/100;
        double totalGst=total+gst;
        System.out.printf("GST(9%%): %s%n", currencyFormatter.format(gst));
        System.out.println("--------------------------------------------");
        System.out.printf("%-20s %s%n", "TOTAL(in. GST):", currencyFormatter.format(totalGst));
        System.out.println(RESET);
        System.out.println(BOLD + MAROON + "\t\t==========  THANK YOU VISIT AGAIN ! ==========" + RESET);
        System.out.println(RESET);
        
    }
  void dis(String str1[]){
    System.out.println(RESET+BOLD + MAROON + "===== OREDRED THALI ITEMS =====" + RESET+BG+BLACK);
    for(String str:str1)
    System.out.println(str);
    System.out.println("Roti,Naan,Butter Paratha\nPickle, Salad, Papad");
}   
}
