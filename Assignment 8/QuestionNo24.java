/* 24.Create a class Rectangle with two protected data members (length and breadth).Declare a Constructor which accepts length and breadth of a Rectangle
Create another class Area which calculates the area of a Rectangle.
Create another class Perimeter which calculates the perimeter of a Rectangle.*/
import java.util.Scanner;
class Rectangle{
    protected int length;
    protected int breadth;
    Rectangle(int len,int bre){
        length=len;
        breadth=bre;
    }
}
class Area extends Rectangle{
     Area(int len,int bre){
        super(len,bre);
    }
    void calculateArea(){
        int area=length*breadth;
        System.out.println("\nArea of rectangle is : "+area);
    }
}
class Perimeter extends Rectangle{
    Perimeter(int len,int bre){
        super(len,bre);
    }
    void calculatePeri(){
        int peri=2*(length+breadth);
        System.out.println("\nPerimeter of rectangle is : "+peri);
    }
}
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter length");
        int len=inp.nextInt();
        System.out.println("Enter breadth");
        int bre=inp.nextInt();
        Area a=new Area(len,bre);
        a.calculateArea();
        Perimeter p=new Perimeter(len,bre);
        p.calculatePeri();
    }
}