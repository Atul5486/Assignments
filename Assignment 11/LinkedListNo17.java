//  Write a Java program to join two linked lists.
import java.util.LinkedList;
class Main{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(1);
        list.add(10);
        list.add(100);
        list.add(1000);
        LinkedList<Integer> list1=new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println("Before join : "+list1);
        list1.addAll(list);
        System.out.println("After join : "+list1);
    }
}