import java.util.Scanner;
import java.io.*;
class Main{
    public static void main(String args[]){
        File file=new File("C:\\Users\\admin\\Desktop\\Assignment\\Assignment 10\\Example\\file1.txt");
        try{
            if(file.exists()){
                file.renameTo(new File("Example20\\File1.java"));
                System.out.println("Name change Successfully");
            }else{
               System.out.println("File Not found");
            }
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}