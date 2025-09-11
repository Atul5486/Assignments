import java.util.Scanner;
class Product{
    private int pid, price, quantity;
    int total=0,totalitemsP=0;
    Product(int pid,int price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
        this.total=price*quantity;
        totalitemsP+=total;
    }
    int pri() {return price;};
    int proid() {return pid;};
}
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int pid,price,qty,total=0;
    Product p[]=new Product[5];
    for(int i=0;i<p.length;i++){
        System.out.println("Enter product id "+(i+1));
        pid=inp.nextInt();
        System.out.println("Enter product price "+(i+1));
        price=inp.nextInt();
        System.out.println("Enter product Quantity "+(i+1));
        qty=inp.nextInt();
        p[i]=new Product(pid,price,qty);
}
int max=0;
int id=0;
for(Product pro:p){
    total+=pro.totalitemsP;
    if(max<pro.pri())
    max=pro.pri();
}
System.out.println("Total price of all product is : "+total);
for(Product pro:p){
    if(max==pro.pri())
    id=pro.proid();
}
System.out.println("Product id which has higest price : "+id);
    }
}