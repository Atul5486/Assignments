// 1. Write a program to count how many times character ‘t’ occurs in a file.
import java.util.Scanner;
import java.io.*;
class Main{
    public static void main(String args[]){
        File file=new File("C:\\Users\\admin\\Desktop\\Assignment\\Assignment 10\\Example");
        if(!file.exists()){
            file.mkdir();
            System.out.println("Folder Created Successfully");
        }else{
        file.delete();
        System.out.println("Folder already exists");

        }
    }
}