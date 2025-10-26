// 1. Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue.
import java.util.PriorityQueue;
import java.util.Collections;
class Main{
    public static void main(String args[]){
    PriorityQueue<String> colors=new PriorityQueue<>();
    Collections.addAll(colors,"Red","Green","Yellow","Pink","RoseGold");
        System.out.println("Elements in queue : "+colors);
    }
}