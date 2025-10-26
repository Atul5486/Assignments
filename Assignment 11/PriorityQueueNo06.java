// 6. Write a Java program to count the number of elements in a priority queue.

import java.util.PriorityQueue;
import java.util.Collections;
class Main{
    public static void main(String args[]){
    PriorityQueue<String> colors=new PriorityQueue<>();
    Collections.addAll(colors,"Red","Green","Yellow","Pink","RoseGold");
    System.out.println("Number of  elements in queue : "+colors.size());
    }
}