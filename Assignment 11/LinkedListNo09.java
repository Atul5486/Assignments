//  Write a Java program to insert some elements at the specified position into a linked list.
import java.util.LinkedList;
class Main{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(100);
        list.add(1000);
        list.add(1,20);
        list.add(2,40);
        list.add(3,60);
        list.add(4,80);

        System.out.println(list);        
    }
}