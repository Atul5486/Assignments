// . Write a program to count no of words in a text file and average word size.
import java.io.*;
class Main{
    public static void main(String args[]){
        File file=new File("C:\\Users\\admin\\Desktop\\Assignment\\Assignment 10\\Example\\file.txt");
        int count=0,space=0;
        try(FileInputStream fs=new FileInputStream(file)){
            while(true){
            int x=fs.read();
            if(x==-1){
                break;
            }
            if(x==' '){
                space++;
            }
            count++;
            System.out.print((char)x);
            }

        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
        System.out.println("\nNumber of words : "+count);
        System.out.println("Average words : "+(count/space));
    }
}