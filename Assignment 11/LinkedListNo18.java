//  Write a Java program to copy a linked list to another linked list.
import java.util.LinkedList;
import java.util.Collections;

class Main{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(1);
        list.add(10);
        list.add(100);
        list.add(1000);
        LinkedList<Integer> list1=new LinkedList<>(Collections.nCopies(list.size(),null));
        list1.add(01);
        Collections.copy(list1,list);
        System.out.println("After Copy : "+list1);
    }
}