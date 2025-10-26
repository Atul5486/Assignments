//9. Write a Java program to retrieve and remove the first element.

import java.util.PriorityQueue;
import java.util.Collections;
class Main{
    public static void main(String args[]){

    PriorityQueue<String> colors=new PriorityQueue<>();
    Collections.addAll(colors,"Red","Green","Yellow","Pink","RoseGold");

    System.out.println("First Element is : "+colors.poll()+" remaining queue : "+colors);
    }
}