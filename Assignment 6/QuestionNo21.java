import java.util.Scanner;
class Main {
    static String result(float per){
        if(per>=75 && per<=100) return "Grade A";
        else if(per>=60 && per<75) return "Grade B"; 
        else if(per>=50 && per<60) return "Grade C";
        else if(per>=33 && per<50) return "Grade D";
        else return "Grade Fail";
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Marks of 5 subject");
        int mark1=inp.nextInt();
        int mark2=inp.nextInt();
        int mark3=inp.nextInt();
        int mark4=inp.nextInt();
        int mark5=inp.nextInt();
        float per=(float)(mark1+mark2+mark3+mark4+mark5)/5;
        System.out.println("Percantage is : "+per);
        System.out.println("Result : "+result(per));
    }
}