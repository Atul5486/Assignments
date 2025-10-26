// 10. Write a Java program to compare two hash set.
import java.util.*;
class Main{
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        Collections.addAll(set,10,20,30,40,50,60);
        HashSet<Integer> set1=new HashSet<>();
        Collections.addAll(set1,1,2,3,4,5,6);
        if(set.equals(set1))
        System.out.println("Both are equal");
        else
        System.out.println("Both not are equal");
    }
}