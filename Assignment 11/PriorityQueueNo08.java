// 8. Write a Java program to retrieve the first element of the priority queue.

import java.util.PriorityQueue;
import java.util.Collections;
class Main{
    public static void main(String args[]){

    PriorityQueue<String> colors=new PriorityQueue<>();
    Collections.addAll(colors,"Red","Green","Yellow","Pink","RoseGold");

    System.out.println("First Element is : "+colors.peek());
    }
}