// 3. Write a Java program to add all the elements of a priority queue to another priority queue.

import java.util.PriorityQueue;
import java.util.Collections;
class Main{
    public static void main(String args[]){
    PriorityQueue<String> colors=new PriorityQueue<>();
    Collections.addAll(colors,"Red","Green","Yellow","Pink","RoseGold");
    PriorityQueue<String> addColors=new PriorityQueue<>(colors);
    System.out.println("Elements in addColors queue : "+addColors);
    }
}