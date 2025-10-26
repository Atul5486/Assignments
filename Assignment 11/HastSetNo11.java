// 11. Write a Java program to compare two sets and retain elements that are the same.
import java.util.*;
class Main{
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        Collections.addAll(set,10,20,30,40,50,60);
        HashSet<Integer> set1=new HashSet<>();
        Collections.addAll(set1,10,2,3,4,5,6);
        set.retainAll(set1);
        System.out.println("Similar element in both sets : "+set);
    }
}