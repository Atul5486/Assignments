// 5. Write a Java program to remove all elements from a priority queue.

import java.util.PriorityQueue;
import java.util.Collections;
class Main{
    public static void main(String args[]){
    PriorityQueue<String> colors=new PriorityQueue<>();
    Collections.addAll(colors,"Red","Green","Yellow","Pink","RoseGold");
    System.out.println("Before Remove elements in queue : "+colors);
    colors.removeAll(colors);
    System.out.println("After Remove elements in queue : "+colors);
    }
}