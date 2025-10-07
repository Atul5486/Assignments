// 1. Write a program to count how many times character ‘t’ occurs in a file.
import java.io.*;
class Main{
    public static void main(String args[]){
        File file=new File("C:\\Users\\admin\\Desktop\\Assignment\\Assignment 10\\Example\\file.txt");
        int count=0;

        try(FileInputStream fs=new FileInputStream(file)){
           while(true){
            int x=fs.read();
            if(x==-1){
                break;
            }
            if((char)x=='t'){
                count++;
            }
            System.out.print((char)x);
           }
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
        System.out.println("\nCount of t in this file : "+count);
    }
}