import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
           System.out.println("Enter length of p1 plot");
           int len=inp.nextInt();
           System.out.println("Enter breadth of p1 plot");
           int bre=inp.nextInt();
           Plot p1=new Plot(len,bre);
           System.out.println("Enter length of p2 plot");
           len=inp.nextInt();
           System.out.println("Enter breadth of p2 plot");
           bre=inp.nextInt();
           Plot p2=new Plot(len,bre);
          System.out.println("Result is : "+p1.compareArea(p2));
    }
}
class Plot{
    private int length,breadth;
    Plot(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    float area(){
        return length*breadth;
    }
    int compareArea(Plot p){
    float currentObj=this.area();
    float passArg=p.area();
        if(passArg==currentObj) return 0;
        else if(passArg>currentObj) return -1;
        else return 1;
    }
}