// 7. Write a Java program to compare two priority queues.

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.HashSet;
class Main{
    public static void main(String args[]){

    PriorityQueue<String> colors=new PriorityQueue<>();
    Collections.addAll(colors,"Red","Green","Yellow","Pink","RoseGold");

    PriorityQueue<String> moreColors=new PriorityQueue<>();
    Collections.addAll(moreColors,"Red","Green","Yellow","Pink","RoseGold");
    // Collections.addAll(moreColors,"LightRed","LightSeaGreen","LightYellow","LightPink","RoseGold");

    if (new HashSet<>(colors).equals(new HashSet<>(moreColors)))
    System.out.println("Both contain the same elements");
    else
    System.out.println("They differ in elements");
    }
}