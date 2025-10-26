// 2. Write a Java program to iterate through all elements in a hash list.
import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator;
class Main{
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        Collections.addAll(set,1,2,3,5,6,3,2);
        Iterator itr=set.iterator();
        System.out.println("Elements in set");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}