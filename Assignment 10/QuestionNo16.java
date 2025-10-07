import java.util.Scanner;
import java.io.*;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        File file1=new File("C:\\Users\\admin\\Desktop\\Assignment\\Assignment 10\\Example\\file1.txt");
        File file2=new File("C:\\Users\\admin\\Desktop\\Assignment\\Assignment 10\\Example\\file2.txt");
        System.out.println("Enter content");
        String str=inp.nextLine();
        try(FileOutputStream fs1=new FileOutputStream(file1);
        FileInputStream fs=new FileInputStream(file1);
        FileOutputStream fs2=new FileOutputStream(file2);){
            byte b[]=str.getBytes();
            fs1.write(b);
            System.out.println("Data Inserted Successfully");
            while(true){
            byte b1=(byte)fs.read();
            if(b1==-1) break;
            fs2.write(b1);
            }
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}