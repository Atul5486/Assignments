// 12. Write a Java program to change priorityQueue to maximum priority queue.

import java.util.PriorityQueue;
import java.util.Collections;

class Main{
    public static void main(String args[]){

    PriorityQueue<String> colors=new PriorityQueue<>();
    Collections.addAll(colors,"Red","Green","Yellow","Pink","RoseGold");
    
    System.out.println("Low Priority queue : "+colors);

    PriorityQueue<String> maxColors=new PriorityQueue<>(Collections.reverseOrder());
    maxColors.addAll(colors);
    System.out.println("High priority queue : "+maxColors);
    }
}