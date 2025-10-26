// 2. Write a Java program to iterate through all elements in the priority queue.

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Iterator;
class Main{
    public static void main(String args[]){
    PriorityQueue<String> colors=new PriorityQueue<>();
    Collections.addAll(colors,"Red","Green","Yellow","Pink","RoseGold");
    Iterator itr=colors.iterator();
        System.out.println("Elements in queue");
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    }
}