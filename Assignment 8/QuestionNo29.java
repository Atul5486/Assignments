import java.util.Scanner;
abstract class Volume{
    double radius,height;
    void getValue(double radius,double height){
        this.height=height;
        this.radius=radius;
    }
    void showValue(){
        System.out.println("Radius is : "+radius);
        System.out.println("Heigth is : "+height);
    }
    abstract double calVol();
}
class Cone extends Volume{
     double calVol(){ return 1*Math.PI*radius*radius*height/3;}
}
class Cylinder extends Volume{
    double calVol(){
        return Math.PI*radius*radius*height;
    }
}

class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        Cone c=new Cone();
        System.out.println("Enter radius of cone");
        double ra=inp.nextDouble();
        System.out.println("Enter height of cone");
        double he=inp.nextDouble();
        c.getValue(ra,he);
        c.showValue();
        System.out.println("Volume of cone is : "+c.calVol());

        Cylinder cy=new Cylinder();
        System.out.println("\nEnter radius of cylinder");
        ra=inp.nextDouble();
        System.out.println("Enter height of cylinder");
        he=inp.nextDouble();
        cy.getValue(ra,he);
        cy.showValue();
        System.out.println("Volume of cylinder is : "+cy.calVol());
     }
}