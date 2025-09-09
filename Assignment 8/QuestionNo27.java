/* 27. Create a class Shape with one member function
a) double calcArea()
Create a class Rectangle with two data members (length and breadth) and inherits Shape and calculate the area
Create a class Circle with one data members (radius) and inherits Shape and calculate the area */
abstract class Shape{
    abstract double calcArea();
}
class Rectangle extends Shape{
    private int len;
    private int bre;
    Rectangle(int len,int bre){
        this.len=len;
        this.bre=bre;
    }
    @Override
    double calcArea(){
        return len*bre;
    }
}
class Circle extends Shape{
    private float radius;
    Circle(int radius){
        this.radius=radius;
    }
    @Override
    double calcArea(){
        return 2*Math.PI*radius;
    }
}
class Main{
    public static void main(String args[]){
        Rectangle rc=new Rectangle(10,20);
        double areaR=rc.calcArea();
        Circle c=new Circle(20);
        double areaC=c.calcArea();
        System.out.println("Area of both things");
        System.out.println("Area of rectangle : "+areaR);
        System.out.println("Area of Circle : "+areaC);
    }
}