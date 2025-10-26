// 14. Write a Java program to retrieve and remove the first element of a tree set.

import java.util.TreeSet;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        TreeSet<Integer> numbers=new TreeSet<>();
        Collections.addAll(numbers,1,2,6,35,2,63,9,563,25);
        Integer first=numbers.pollFirst();
        if(first!=null){
             System.out.println("Retrieved and removed first element: " + first);
            System.out.println("TreeSet after removing first element: " + numbers);
        }else
         System.out.println("TreeSet was empty, no element to retrieve or remove.");

    }   
}