// 10. Write a Java program to convert a priority queue to an array containing all its elements.

import java.util.PriorityQueue;
import java.util.Collections;

class Main{
    public static void main(String args[]){

    PriorityQueue<String> colors=new PriorityQueue<>();
    Collections.addAll(colors,"Red","Green","Yellow","Pink","RoseGold");
    Object arr[]=colors.toArray();
    System.out.println("Array elements:");
        for (Object color : arr) {
            System.out.println(color);
        }

    }
}