import java.util.Scanner;
class Test{
    Scanner inp=new Scanner(System.in);
    private int testCode;
    private String desc;
    private int totalCan;
    private int center;

    int calcCenter(){
        int rem=totalCan%50;
        if(rem>0) center+=1;
     return center+=totalCan/50;
 }
 public void schedule(){
     System.out.println("Enter test code");
     testCode=inp.nextInt();
     inp.nextLine();
     System.out.println("Enter description of exam");
     desc=inp.nextLine();
     System.out.println("Enter total number of candidate");
     totalCan=inp.nextInt();
     calcCenter();
 }
 public void display(){
     System.out.println("\n========== Test Details ==========");
      System.out.println("Test code is : "+testCode);
     System.out.println("Description of exam is : "+desc);
     System.out.println("Total Number of  candidates : "+totalCan);
     System.out.println("Centers required : "+center);
 }
  
}
class Main {
public static void main(String[] args) {
    Test tcs=new Test();
    tcs.schedule();
    tcs.display();
    }
}