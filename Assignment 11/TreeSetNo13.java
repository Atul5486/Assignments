// 13. Write a Java program to get an element in a tree set that has a lower value than the given element.

import java.util.TreeSet;
import java.util.Collections;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter element to check : ");
        int elem=inp.nextInt();
        TreeSet<Integer> numbers=new TreeSet<>();
        Collections.addAll(numbers,1,2,6,35,2,63,9,563,25);
        Integer lower=numbers.lower(elem);
        if(lower!=null)
        System.out.println("Ceiling element for "+elem+" : "+lower);
        else
        System.out.println("No element found strictly lower : "+elem);
    }   
}