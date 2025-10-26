//  Write a Java program that swaps two elements in a linked list.
import java.util.LinkedList;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(1);
        list.add(10);
        list.add(100);
        list.add(1000);
        System.out.println("Before Swapping : "+list);
        Collections.swap(list,0,2);
        System.out.println("After Swapping : "+list);
    }
}