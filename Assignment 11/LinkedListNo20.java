// Write a Java program to retrieve, but not remove, the first element of a linked list.
import java.util.LinkedList;
import java.util.Collections;

class Main{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(1);
        list.add(10);
        list.add(100);
        int first=list.getFirst();
        System.out.println("First Element : "+first);
        System.out.println("Full List : "+list);
    }
}