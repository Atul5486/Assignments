import java.util.ArrayList;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list,"Apple","Banana","Cherry","Dargon Fruit");
        System.out.println("Original ArrayList: " + list);
        list.clear();
        System.out.println("ArrayList after clear(): " + list);
    }
}