// 9. Write a Java program to find numbers less than 7 in a tree set.

import java.util.TreeSet;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        TreeSet<Integer> numbers=new TreeSet<>();
        Collections.addAll(numbers,1,2,6,35,2,63,9,563,25);
        for(int num:numbers){
            if(num<7)
            System.out.println(num);
        }

        
    }   
}