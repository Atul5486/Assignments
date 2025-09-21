import java.util.Scanner;
class OneBHK{
private int roomArea,hallArea;
private double price;
    OneBHK(int roomArea,int hallArea,double price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }
    OneBHK(){       
            price=15000.50;
            roomArea=500;
            hallArea=1000;
        }
    void show(){
        System.out.println("===== Room Details =====");
        System.out.println("Room Area : "+roomArea);
        System.out.println("Hall Area : "+hallArea);
        System.out.println("Price of room : "+price);
    }

}
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter room area");
        int roomArea=inp.nextInt();
        System.out.println("Enter Hall Area");
        int hallArea=inp.nextInt();
        System.out.println("Enter price");
        double price=inp.nextDouble();
        OneBHK room=new OneBHK(roomArea,hallArea,price);
        room.show();
    }
}
