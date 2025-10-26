//  Write a Java program to remove the first and last elements from a linked list.
import java.util.LinkedList;
class Main{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(1);
        list.add(10);
        list.add(100);
        list.add(1000);
        System.out.println("Before Removing : "+list);
        list.removeFirst();
        list.removeLast();
        System.out.println("After Removing : "+list);

    }
}