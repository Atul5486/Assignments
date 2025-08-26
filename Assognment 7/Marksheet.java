import java.util.Scanner;

class Marksheet {
   
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String HEADER_BG = "\u001B[44m";
    public static final String HEADER_FG = "\033[33m"; 
    public static final String TABLE_HEADER_BG = "\u001B[46m";
    public static final String PASS_FG = "\u001B[32m";   
    public static final String FAIL_FG = "\u001B[31m"; 
    final String BORDER = "\033[47m";
    final String TABLE_FG = "\033[30m";

    private String name;
    private int rollno;
    private int marks[]=new int[5];
    private int prMarks[]=new int[2];
    private String sub[]={"Cloud Computing","DBMS","Statics","Operating System","Java"};
    private double per;
    private int count=0;
    private String year;
    private String sem;
    private String fname;
    private String mname;
    private String dob;

    void setData(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter name");
        name=inp.nextLine();
        System.out.println("Enter roll no");
        rollno=inp.nextInt();
        inp.nextLine();
        System.out.println("Enter year");
        year=inp.nextLine();
        System.out.println("Enter Semester");
        sem=inp.nextLine();
        System.out.println("Enter your father name");
        fname=inp.nextLine();
        System.out.println("Enter your mother name");
        mname=inp.nextLine();
        System.out.println("Enter your DOB (DD-MM-YY)");
        dob=inp.nextLine();
    }

void getData() {
    System.out.println(BORDER+TABLE_FG);
    System.out.println("Name        : " + name);
    System.out.println(TABLE_FG + "Father Name : " + fname + "\tMother Name   : " + mname);
    System.out.println(TABLE_FG + "Roll No     : " + rollno + "\t\tDOB (DD-MM-YY) : " + dob);
    System.out.println(TABLE_FG + "Year        : " + year + "\t\t\tSemester      : " + sem);
}

    void setTheoryData(){
        Scanner inp=new Scanner(System.in);
        for(int i=0;i<5;i++){
            do{
                System.out.println("Enter marks of "+sub[i]);
                marks[i]=inp.nextInt();
            }while(marks[i]<0 || marks[i]>100);
        }
    }

    void setPracticalData(){
        Scanner inp=new Scanner(System.in);
        for(int i=0;i<2;i++){
            do{
                System.out.println("Enter Practical marks of subject "+(i+1));
                prMarks[i]=inp.nextInt();
            }while(prMarks[i]<0 || prMarks[i]>25);
        }
    }

    double percentage(){
        int total=0;
        for(int mark:marks)
            total+=mark;
        for(int pm:prMarks)
            total+=pm;
        per=(double)total/(5*100+2*25)*100; 
        return per;
    }

    String grade(){
        if(per>=90) return "A+";
        else if(per>=80) return "A";
        else if(per>=70) return "B+";
        else if(per>=60) return "B";
        else if(per>=50) return "C";
        else if(per>=33) return "D";
        else return "Fail";
    }

    void count(){
        for(int mark:marks){
            if(mark<33) count++;
        }
    }

    String status(){
        count();
        if(count>=3) return "Year Back";
        else if(count>0 && count<3) return "ATKT";
        else return "Pass";
    }

    void printMarksheet(){
        System.out.println("| "+HEADER_BG + HEADER_FG + BOLD + "================= OFFICIAL MARKSHEET =================" + RESET+BORDER);
        System.out.println(TABLE_FG+"|"+"\n\tABC Science College, Indore (M.P.)");
        System.out.println("| "+FAIL_FG+BOLD+"\t\tGRADE SHEET"+RESET+BORDER);
        System.out.println(TABLE_FG+"| "+"\tBCA "+sem +" SEMESTER MAIN EXAMINATION\n");
        System.out.println("| "+"--------------------------------------------------------");
        getData();
        System.out.println(BORDER+"| "+"--------------------------------------------------------");

        System.out.printf("| "+TABLE_HEADER_BG + TABLE_FG + "%-20s %-10s %-10s" + "\n","Subject","Out Of","Obtained"+RESET+BORDER+HEADER_FG);

        int totalTheory=0, totalPractical=0;
        for(int i=0;i<5;i++){
            totalTheory+=marks[i];
            System.out.printf("| "+"%-20s %-10d %-10d\n",sub[i],100,marks[i]);
        }
        for(int i=0;i<2;i++){
            totalPractical+=prMarks[i];
            System.out.printf("| "+"%-20s %-10d %-10d\n","Practical "+(i+1),25,prMarks[i]);
        }
        System.out.println("| "+"--------------------------------------------------------");
        int grandTotal=totalTheory+totalPractical;
        System.out.printf("| "+"%-20s %-10d %-10d\n","TOTAL",550,grandTotal);

        float p=(float)percentage();
        String g=grade();
        String s=status();

        System.out.println("| "+"--------------------------------------------------------");
        System.out.println("| "+"Percentage : "+p+"%");
        System.out.println("| "+"Grade      : "+g);
        if(s.equals("Pass")){
            System.out.println("|"+"Result     : "+PASS_FG+s+" (Your are Promoted to next Class)"+RESET);
        }else{
            System.out.println("| "+"Result     : "+FAIL_FG+s+RESET);
        }
        System.out.println(BORDER+"|"+"--------------------------------------------------------");
        System.out.println("| Principle : David Henry \t Signature : DavidHenry"+RESET);
        System.out.println("| "+HEADER_BG + HEADER_FG + "========================================================" + RESET);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        Marksheet mk= new Marksheet();
        mk.setData();
        mk.setTheoryData();
        mk.setPracticalData();
        mk.printMarksheet();
    }
}
