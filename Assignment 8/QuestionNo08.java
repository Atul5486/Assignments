import java.util.Scanner;
class Area{
    private int len;
    private int bre;
    Area(int len,int bre){
        this.len=len;
        this.bre=bre;
    }
    void display(){
        System.out.println("Area of rectangle is : "+len*bre);
    }
}
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter length");
        int len=inp.nextInt();
        System.out.println("Enter breadth");
        int bre=inp.nextInt();
        Area obj=new Area(len,bre);
        obj.display();
    }
}