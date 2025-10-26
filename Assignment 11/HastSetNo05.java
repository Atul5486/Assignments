// 5. Write a Java program to test if a hash set is empty or not.
import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator;
class Main{
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        Collections.addAll(set,1,2,3,5,6,3,2,10);
        if(set.isEmpty())
        System.out.println("Hashset is empty");
        else
        System.out.println("Hashset not is empty");
        
    }
}