import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter fahrenheit : ");
        float f=inp.nextFloat();
        float c=(f - 32) * 5/9;
        System.out.println("Fahrenheit to celsius : "+c);
        }
}