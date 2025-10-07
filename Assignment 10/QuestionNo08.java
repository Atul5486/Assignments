import java.util.Scanner;
class Threads extends Thread{
    int row;
    Threads(int row){
        this.row=row;
    }
    public void run(){
        try{
            for(int i=1;i<=row;i++){
                for(int j=row;j>=i;j--){
                    System.out.print("* ");
                    Thread.sleep(1000);
                }
                System.out.println();
            }
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }
}
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=inp.nextInt();
        Threads obj=new Threads(row);
        obj.start();
    }
}