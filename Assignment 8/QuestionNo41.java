import java.util.Scanner;
class Faculty{
    private String fname;
    private String dep;
    protected int salary;
    Faculty(String fname,String dep){
        this.fname=fname;
        this.dep=dep;
    }
    void getData(){
        System.out.println("Name of faculty : "+fname);
        System.out.println("Department of faculty : "+dep);
        System.out.println("Salary of faculty : "+salary);
    }
}
class FullTimeFaculty extends Faculty{
    private int allowance;
    private int basic;
    FullTimeFaculty(String fname,String dep,int allowance,int basic){
        super(fname,dep);
        this.basic=basic;
        this.allowance=allowance;
        super.salary=basic+allowance;
    }
    void show(){super.getData();};
}
class PartTimeFaculty extends Faculty{
    private int hour;
    private int rate;
    PartTimeFaculty(String fname,String dep,int hour,int rate){
        super(fname,dep);
        this.rate=rate;
        this.hour=hour;
        super.salary=hour*rate;
    }
    void show(){super.getData();};
}
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter faculty name");
        String name=inp.nextLine();
        System.out.println("Enter department name");
        String dep=inp.nextLine();
        System.out.println("Enter working hour");
        int hour=inp.nextInt();
        System.out.println("Enter working rate");
        int rate=inp.nextInt();
        PartTimeFaculty pc=new PartTimeFaculty(name,dep,hour,rate);
        System.out.println("\nEnter basic salary");
        int basic=inp.nextInt();
        System.out.println("Enter Allowance");
        int allowance=inp.nextInt();

        FullTimeFaculty fc=new FullTimeFaculty(name,dep,basic,allowance);
        System.out.println("\n====== Part Time Salary ======");
        pc.show();
        System.out.println("\n====== Full Time Salary ======");
        fc.show();
    }
}