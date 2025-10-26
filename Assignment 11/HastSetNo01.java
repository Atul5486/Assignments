// 1. Write a Java program to append the specified element to the end of a hash set.
import java.util.HashSet;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        Collections.addAll(set,1,2,3,5,6,3,2);
        Collections.addAll(set,10);
        System.out.println(set);
    }
}