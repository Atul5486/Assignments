import java.util.Scanner;
class FourWheeler{
    private char category;
    private int amount;
    FourWheeler(char category,int amount){
        this.category=category;
        this.amount=amount;
    }
    char getCategory(){return this.category;}
    int getamount() {return this.amount;}
}
class Car extends FourWheeler{
    private String brand;
    private int model;
        Car(char category,int amount){
        super(category,amount);
        }
    void getDetail(String brand,int model){
        this.brand=brand;
        this.model=model;
    }
    void display(){
        System.out.println("\n===== Car Details ===== ");
        System.out.println("Brand of car : "+brand);
        System.out.println("Model of car : "+model);
        System.out.println("Category of car : "+super.getCategory());
        System.out.println("Amount of car : "+super.getamount());

    }

}
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter brand of car");
        String brand=inp.nextLine();
        System.out.println("Enter model of car");
        int model=inp.nextInt();
        System.out.println("Enter category of car");
        char ch=inp.next().charAt(0);
        System.out.println("Enter amount of car");
        int amt=inp.nextInt();
       
        Car car=new Car(ch,amt);
        car.getDetail(brand,model);
        car.display();
        
    }
}