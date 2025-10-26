// 4. Write a Java program to insert a given element into a priority queue.

import java.util.PriorityQueue;
import java.util.Collections;
class Main{
    public static void main(String args[]){
    PriorityQueue<String> colors=new PriorityQueue<>();
    Collections.addAll(colors,"Red","Green","Yellow","Pink","RoseGold");
    colors.offer("Blue");
    colors.offer("Black");
    System.out.println(colors);
    }
}