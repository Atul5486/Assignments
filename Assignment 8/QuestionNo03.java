import java.util.Scanner;
class Main {
     public static Scanner inp=new Scanner(System.in);
     private int value;
     private int fact=0;
     void init(){
         System.out.println("Enter a number");
         value=inp.nextInt();
         fact();
     }
     void fact(){
         int sum=1;
        for(int i=1;i<=value;i++){
            sum*=i;
        }
        fact+=sum;
    }
    void display(){
        System.out.println("Factorial of "+value + " is : "+fact);
    }
    
public static void main(String[] args) {
       Main add=new Main();
       add.init();
       add.display();
    }
}