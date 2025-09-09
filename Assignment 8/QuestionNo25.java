/* 5.Create a class Publication with two data members (title and price).Declare two member function:-
a)getData():- for accepting data from user.
b)putData():- for displaying data.

Create another class Sales with three data member ((s1,s2,s3) which accepts the sales of three months).
Declare two member function :-
a)getSales():- for accepting three month sales. 
b)showsales():- for displaying sales.

Create one more class Book with one data member (pages).
Declare two member function :- 
a)getBookDetail():- which accepts the book details which includes title, price, sales and pages. 
b)showBookDetail():- which displays the book details which includes title, price, sales and pages.
*/
import java.util.Scanner;
class Publication{
    Scanner inp=new Scanner(System.in);
    private String title;
    private double price;
    void getData(){
        System.out.println("Enter title");
        title=inp.nextLine();
        System.out.println("Enter price");
        price=inp.nextInt();
    }
    void putData(){
        System.out.println("Title is : "+title);
        System.out.println("Price : "+price);
    }
}
class Sales{
    Scanner inp=new Scanner(System.in);
    private int s1;
    private int s2;
    private int s3;
    void getSales(){
        System.out.println("Enter sales data of first month");
        s1=inp.nextInt();
        System.out.println("Enter sales data of second month");
        s2=inp.nextInt();
        System.out.println("Enter sales data of third month");
        s3=inp.nextInt();
    }
    void showsales(){
        System.out.println("Sales data of 1st month : "+s1);
        System.out.println("Sales data of 2nd month : "+s2);
        System.out.println("Sales data of 3rd month : "+s3);
    }
}
class Book extends Publication{
    private int pages;
    Sales sales = new Sales(); 
    void getBookDetail(){
        getData();
        sales.getSales();
        System.out.println("Enter pages of book");
        pages=inp.nextInt();
    }
    void showBookDetail(){
        putData();
        sales.showsales();
        System.out.println("Total pages : "+pages);
    }
}
class Main{
    public static void main(String args[]){
Book b1 = new Book();
        System.out.println("Enter book details:");
        b1.getBookDetail();

        System.out.println("\nBook details:");
        b1.showBookDetail();
}
}