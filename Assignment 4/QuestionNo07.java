import java.util.Scanner;
class Booking{
    Scanner inp=new Scanner(System.in);
    String source,destination,date,day,time;
    double totalFare=0;
    int busFare=500;
    int trainFare=700;
    int flightFare=1000;
    int male,female,srMale,srFemale,children;
    void setInfo(){
       System.out.print("Enter source : ");
       source=inp.nextLine();
       System.out.print("Enter destination : ");
       destination=inp.nextLine();
       System.out.print("Enter date(dd-mm-yy) : ");
       date=inp.nextLine();
       System.out.print("Enter day : ");
       day=inp.next().toLowerCase();
       inp.nextLine();
       System.out.print("Enter time (HH:MM) : ");
       time =inp.nextLine();
       select();
    }
    void getDetails(){
        System.out.println("\n ----------Reservation summary ----------");
        System.out.println("Source : "+source);
        System.out.println("Destination : "+destination);
        System.out.println("Date : "+date);
        System.out.println("Day : "+day);
        System.out.println("Time : "+time);
        System.out.println("Total passenger : \n Male : "+male+" Female :"+female+" Senior Male : "+srMale+" senior Female : "+srFemale);
        System.out.println("Total fare : "+totalFare);
    }
    void select(){
        if (day.equals("saturday") || day.equals("sunday")) {
            System.out.println("No bookings are allowed on Saturday and Sunday!");
            return;
        }
    System.out.println("Enter vehicle type");
    System.out.println("1.Bus \n2.Train \n3.Flight");
    int ch=inp.nextInt();
        switch(ch){
            case 1:System.out.println("Bus");  
                        setData();
                        totalFare=busFare*(male+female+children)+(srMale+srFemale)*0.3;
                        getDetails();
                        break;
            case 2:System.out.println("Train");setData();
             totalFare=busFare*(male+female+children)+(srMale+srFemale)*0.3;
             getDetails();
            break;
            case 3:System.out.println("Flight");setData();
             totalFare=busFare*(male+female+children)+(srMale+srFemale)*0.3;
             getDetails();
             break;
            default:
            System.out.println("Invalid choice");
        }
    }
    void setData(){
        System.out.println("Enter number of male");
        male=inp.nextInt();
        System.out.println("Enter number of female");
        female=inp.nextInt();
        System.out.println("Enter number of senior male(60+)");
        srMale=inp.nextInt();
        System.out.println("Enter number of senior Female(60+)");
        srFemale=inp.nextInt();
        System.out.println("Enter number of children");
        children=inp.nextInt();
    }
}
class Main {
    public static void main(String[] args) {
       Booking obj=new Booking();
       obj.setInfo();
    }
}