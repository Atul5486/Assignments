import java.util.Scanner;
public class Main{
    static Scanner inp=new Scanner(System.in);
    
        static Doctor[] dc=new Doctor[100];
        static Patient[] pt=new Patient[100];
        static Medicine[] md=new Medicine[100];
        
        
        static int doctorCount=0,patientCount=0,medicineCount=0;
        
        static void addDoctor(){
            System.out.println("Enter Id of doctor");
            int id=inp.nextInt();
            inp.nextLine();
            System.out.println("Enter Name of doctor");
            String name=inp.nextLine();
            System.out.println("Enter specialization of doctor");
            String specialization=inp.nextLine();
            dc[doctorCount++]=new Doctor(id,name,specialization);
        }
        static void displayDoc(){
            for(int i=0;i<doctorCount;i++){
               dc[i].display();
            }
        }
        static void addPatient(){
            System.out.println("Enter Id of patient");
            int id=inp.nextInt();
            inp.nextLine();
            System.out.println("Enter Name of patient");
            String name=inp.nextLine();
            System.out.println("Enter disease of patient");
            String disease=inp.nextLine();
            pt[patientCount++]=new Patient(id,name,disease);
        }
        static void addMedicine(){
            System.out.println("Enter Id of medicine");
            int id=inp.nextInt();
            inp.nextLine();
            System.out.println("Enter Name of medicine");
            String name=inp.nextLine();
            System.out.println("Enter price of medicine");
            Double price=inp.nextDouble();
            md[medicineCount++]=new Medicine(id,name,price);
        }
        
    public static void main(String args[]){
     int choice;
     do{
         System.out.println("Enter your choice");
     System.out.println("1.Add doctor \n2.View all doctor\n3.Find doctor\n4.Add Patient\n5.View all Patient\n6.Find Patient\n7.Add Medicine\n8.View all Medicine\n9.Find Medicine\n10.Quit");
         choice=inp.nextInt();
     switch(choice){
        case 1:addDoctor();
        case 2:displayDoc();
        case 3:break;
        case 4:break;
        case 5:break;
        case 6:break;
        case 7:break;
        case 8:break;
        case 9:break;
        case 10:System.out.println("Exiting successfully");
            break;
        default:
     }
     }while(choice!=10);
    }
}
class Doctor{
    private int id;
    private String name;
    private String specialization;
    Doctor(int id,String name,String specialization){
        this.id=id;
        this.name=name;
        this.specialization=specialization;
    }
    void display(){
        System.out.println("Doctor Id : "+id + " Name : "+name+" Specialization : "+specialization);
    }
}
class Patient{
  private int id;
  private String name;
  private String disease;
  Patient(int id,String name,String disease){
        this.id=id;
        this.name=name;
        this.disease=disease;
    }
    void display(){
        System.out.println("Patient Id : "+id + " Name : "+name+" Disease : "+disease);
    }
}
class Medicine{
  private int id;
  private String name;
  private double price;
  Medicine(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    void display(){
        System.out.println("Medicine Id : "+id + " Name : "+name+" Price : "+price);
    }
}
