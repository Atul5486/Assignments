import java.util.Scanner;
import java.io.*;
class Main{
    public static void main(String args[]){
        File file=new File("C:\\Users\\admin\\Desktop\\Assignment\\Assignment 10\\Example");
        File files[]=file.listFiles();
            for(File fl:files){
                System.out.println("File Name : "+fl.getName()+"\tPath : "+fl.getPath());
            }
    }
}