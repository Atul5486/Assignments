import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter your choice");
        double total=0;
        int ch;
        do{
        System.out.println("1.Spark plugs \n2.Brake pads \n3.Fuel filter \n4.Wiper blades \n5.Radiator");
        ch=inp.nextInt();
        switch(ch){
            case 1:
                System.out.println("Enter price of Spark plugs");
                double sprice=inp.nextDouble();
                System.out.println("Enter unit of spark plugs");
                int sunit=inp.nextInt();
                double totalS=sprice*sunit;
                total+=totalS;
                break;
            case 2:
                System.out.println("Enter price of Brake pads");
                double bprice=inp.nextDouble();
                System.out.println("Enter unit of Brake pads");
                int bunit=inp.nextInt();
                double totalB=bprice*bunit;
                total+=totalB;
                break;
            case 3:
                System.out.println("Enter price of Fuel filter");
                double fprice=inp.nextDouble();
                System.out.println("Enter unit of Fuel filter");
                int funit=inp.nextInt();
                double totalF=fprice*funit;
                total+=totalF;
                break;
            case 4:
                System.out.println("Enter price of Wiper blades");
                double wprice=inp.nextDouble();
                System.out.println("Enter unit of Wiper blades");
                int wunit=inp.nextInt();
                double totalW=wprice*wunit;
                total+=totalW;
                break;
            case 5:
            System.out.println("Enter price of Radiator");
                double rprice=inp.nextDouble();
                System.out.println("Enter unit of Radiator");
                int runit=inp.nextInt();
                double totalR=rprice*runit;
                total+=totalR;
                break;
            case 6:
                System.out.println("Exiting");break;
            default:
            System.out.println("Invalid choice");
        }
        }while(ch!=6);
        System.out.println("Total amount is : "+total);
    }
}