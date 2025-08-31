import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       Vaccine obj=new Vaccine(1,"Done");
        System.out.println("Enter child name");
        String name=inp.nextLine();
        System.out.println("Enter Father name");
        String fname=inp.nextLine();
        System.out.println("Enter gender (Male Or Female)");
        String gender=inp.nextLine();
        System.out.println("Enter age");
        int age=inp.nextInt();
        System.out.println("Enter child id");
        int cid=inp.nextInt();
        System.out.println("Enter number of dose (Max 3) ");
        int dose=inp.nextInt();
        Child ch=new Child(cid,age,name,gender,fname,dose);
        ch.getDetails();
    }
}
class Child{
    int cid,age,dose;
    String name,gender,fname;
    Child(int cid,int age,String name,String gender,String fname,int dose){
        this.cid=cid;
        this.age=age;
        this.name=name;
        this.fname=fname;
        this.gender=gender;
        this.dose=dose;
    }
    void getDetails(){
        System.out.println("---------- Vaccine Details ----------");
        System.out.println("Name : "+name);
        System.out.println("Father name : "+fname);
        System.out.println("Age : "+age);
        System.out.println("Gender : "+gender);
        System.out.println("Child id : "+cid);
        Vaccine obj=new Vaccine(dose,"Done");
        obj.getVaccine();
    }
}
class Vaccine{
    final String vname="varicella";
    int dose;
    String status;
    Vaccine(int dose,String status){
        this.dose=dose;
        this.status=status;
    }
  public void getVaccine(){
        System.out.println("Vaccine Name : "+vname);
        System.out.println("Status : "+status);
        if(dose > 3)
        System.out.println("Dose : Over dose");
        else if(dose <0 )
        System.out.println("Dose : Invalid dose");
        else
        System.out.println("Dose : "+dose);
    }
}