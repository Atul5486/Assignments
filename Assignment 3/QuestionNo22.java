import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("You want a car on rent enter(Y or N)");
        char ch=inp.next().toUpperCase().charAt(0);
        char size;
        char coupon;
        float cPrice=456.56f;
        float fPrice=460.50f;
        if(ch=='Y'){
            System.out.println("Enter C for Compact and F for Full size");
            size=inp.next().toUpperCase().charAt(0);
            if(size=='C'){
            System.out.println("User select compact");
            System.out.println("You have any coupon (Y or N)");
            coupon=inp.next().toUpperCase().charAt(0);
            if(coupon=='Y')
            System.out.println("The price of compact car after applying coupon is : "+(cPrice-cPrice*7/100));
            else
            System.out.println("The price of compact car is :"+cPrice);
            }
            else if(size=='F'){
            System.out.println("user select full size");
            System.out.println("You have any coupon (Y or N)");
            coupon=inp.next().toUpperCase().charAt(0);
            if(coupon=='Y')
            System.out.println("The price of compact car after applying coupon is : "+(fPrice-fPrice*7/100));
            else
            System.out.println("The price of compact car is :"+fPrice);
                
            }
            else
            System.out.println("Invalid input");
            
        }else
        System.out.println("Thank you visit again");
       
    }
}