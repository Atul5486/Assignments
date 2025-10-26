// 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
import java.util.LinkedList;
import java.util.ListIterator;
class Main{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(100);
        list.add(1000);
        list.add(list.size(),4);
        list.offerLast(101);
        list.addLast(50);
        int count=2;
        ListIterator itr=list.listIterator(count);
        while(itr.hasNext())
        System.out.println(itr.next());
            

                 
    }
}