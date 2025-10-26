// Write a Java program to retrieve, but not remove, the last element of a linked list.
import java.util.LinkedList;
class Main{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(1);
        list.add(10);
        list.add(100);
        int last=list.getLast();
        System.out.println("Last Element : "+last);
        System.out.println("Full List : "+list);
    }
}