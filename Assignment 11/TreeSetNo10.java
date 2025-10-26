// 10. Write a Java program to get the element in a tree set which is greater than or equal to the given element..

import java.util.TreeSet;
import java.util.Collections;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter element to check");
        int elem=inp.nextInt();
        int count=0;
        TreeSet<Integer> numbers=new TreeSet<>();
        Collections.addAll(numbers,1,2,6,35,2,63,9,563,25);
        for(int num:numbers){
            if(num>=elem)
            System.out.println(num);
            else 
            count++;
        }
        if(count>0)
        System.out.println("Elements in tree set is not greater than or equal to given element");

        
    }   
}