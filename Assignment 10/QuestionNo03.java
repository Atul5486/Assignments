// . Write a program to count no of words in a text file and average word size.
import java.io.*;
class Main{
    public static void main(String args[]){
        File file=new File("C:\\Users\\admin\\Desktop\\Assignment\\Assignment 10\\Example\\file.txt");
        File file1=new File("C:\\Users\\admin\\Desktop\\Assignment\\Assignment 10\\Example\\file1.txt");
        try(FileInputStream fs=new FileInputStream(file);
        FileOutputStream fs1=new FileOutputStream(file1);
        DataOutputStream fs2=new DataOutputStream(fs1);
        ){
            while(true){
            int x=fs.read();
            if(x==-1){
                break;
            }
            fs2.writeInt(x);
            }
            System.out.println("Data Copy Successfully");

        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
       
    }
}