import java.util.Scanner;
class Area{
    private int radius;
    private double area;
    void init(int radius){
        this.radius=radius;
    }
    void calc(){
        area=Math.PI*radius*radius;
    }
    void display(){
        System.out.println("Area of circle is : "+area);
    }

}
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        Area circle=new Area();
        System.out.println("Enter radius of circle");
        int radius=inp.nextInt();
        circle.init(radius); 
        circle.calc();
        circle.display();
    }
}