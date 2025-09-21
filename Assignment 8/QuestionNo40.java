import java.util.Scanner;
class OneBHK{
private int roomArea,hallArea;
protected double price;
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
        System.out.println("Room 1 Area : "+roomArea);
        System.out.println("Hall Area : "+hallArea);
    }
}
class TwoBHK extends OneBHK{
    private int room2Area;
   
    static int count =0;
    
    TwoBHK(int roomArea,int hallArea,int room2Area,double price){
        super(roomArea,hallArea,price);
        this.room2Area=room2Area;
        count++;
    }
    void display(){
        show();
        System.out.println("Room 2 Area : "+room2Area);
        System.out.println("Price of room : "+price);
    }
}
class Main{
    public static void main(String args[]){
    Scanner inp=new Scanner(System.in);
    TwoBHK room[]=new TwoBHK[3];

    for(int i=0;i<room.length;i++){
        System.out.println("Enter details of room "+(i+1));
        System.out.println("Enter room 1 area");
        int roomArea=inp.nextInt();
        System.out.println("Enter room 2 area");
        int room2Area=inp.nextInt();
        System.out.println("Enter Hall Area");
        int hallArea=inp.nextInt();
        System.out.println("Enter price");
        double price=inp.nextDouble();
        room[i]=new TwoBHK(roomArea,hallArea,room2Area,price);
    }
    System.out.println("\nTotal rooms : "+room[2].count);
    for(TwoBHK obj:room){
        obj.display();
    }
    }
}
