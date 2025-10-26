//  Write a Java program to display elements and their positions in a linked list.
import java.util.LinkedList;
class Main{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(1);
        list.add(10);
        list.add(100);
        list.add(1000);

        for(int i=0;i<list.size();i++){
            System.out.println("Element : "+list.get(i)+" Index : "+i);
        }  

    }
}