// 16. Write a Java program to remove a given element from a tree set.
import java.util.TreeSet;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        TreeSet<Integer> numbers=new TreeSet<>();
        Collections.addAll(numbers,1,2,6,35,2,63,9,563,25);
        int num=9;
        if(numbers.remove(num)){
        System.out.println("Element remove from given set "+numbers);
        }else
        System.out.println("Element not found in given set "+numbers);
    }   
}