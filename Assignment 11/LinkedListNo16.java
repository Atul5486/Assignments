//  Write a Java program to shuffle elements in a linked list.
import java.util.LinkedList;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(1);
        list.add(10);
        list.add(100);
        list.add(1000);
        System.out.println("Before Shuffle : "+list);
        Collections.shuffle(list);
        System.out.println("After Shuffle : "+list);
    }
}