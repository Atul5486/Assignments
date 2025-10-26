// 11. Write a Java program to convert a Priority Queue element to string representations.
import java.util.PriorityQueue;
import java.util.Collections;

class Main{
    public static void main(String args[]){

    PriorityQueue<String> colors=new PriorityQueue<>();
    Collections.addAll(colors,"Red","Green","Yellow","Pink","RoseGold");
    String  str=colors.toString();
    System.out.println("Array elements:"+str);
    }
}