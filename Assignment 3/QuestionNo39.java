import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter value of x : ");
        int x=inp.nextInt();
        System.out.print("Enter value of y : ");
        int y=inp.nextInt();
        System.out.print("Enter value of z : ");
        int z=inp.nextInt();
        y=x-2+3*x-7;
       System.out.println("Y : "+y);
        y=x++ + ++x;
        System.out.println("Y : "+y);
        z=x++ - --y - --x +x++;
        System.out.println("X : "+x+" Y : "+y+" Z : "+z);
        // z = (x && y) || !(x || y);
        System.out.println("Z : "+z);
    }
}