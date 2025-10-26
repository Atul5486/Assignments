// Write a Java program to remove and return the first element of a linked list.
import java.util.LinkedList;
class Main{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(10);
        list.add(100);
        list.add(1000);
        System.out.println("First Element is : "+list.removeFirst()+"\nList : "+list);
    }
}