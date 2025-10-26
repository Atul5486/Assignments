import java.util.ArrayList;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        ArrayList<String> list1 = new ArrayList<String>();
        Collections.addAll(list1,"Apple","Banana","Cherry","Dargon Fruit");
        ArrayList<String> list2 = (ArrayList<String>) list1.clone();
        System.out.println("After cloning in list 2 : "+list2);
    }
}