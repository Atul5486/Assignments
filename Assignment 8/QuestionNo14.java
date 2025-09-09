import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
           Product pro=new Product();
           pro.acceptProduct(inp);
           pro.displayProduct();
    }
}
class Product{
    private int pid;
    private String pname;
    private double amount;
    void acceptProduct(Scanner inp){
        System.out.println("Enter product id");
        pid=inp.nextInt();
        inp.nextLine();
        System.out.println("Enter Product name");
        pname=inp.nextLine();
        System.out.println("Enter product amount");
        amount=inp.nextDouble();
    }
    void displayProduct(){
        System.out.println("\n===== Product Details =====\nProduct id : "+pid);
        System.out.println("Product name : "+pname);
        System.out.println("Product amount : "+amount);
    }
}