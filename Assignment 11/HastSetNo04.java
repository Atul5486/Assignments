// 4. Write a Java program to empty an hash set.
import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator;
class Main{
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        Collections.addAll(set,1,2,3,5,6,3,2,10);
        System.out.println("Before Empty: "+set);
        set.removeAll(set);
        System.out.println("After Empty: "+set);
    }
}