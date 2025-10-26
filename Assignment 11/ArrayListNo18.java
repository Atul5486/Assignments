import java.util.ArrayList;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list,"Apple","Banana","Cherry","Dargon Fruit");
        System.out.println("Original ArrayList: " + list);
        // list.clear();
        if(list.size()==0){
            System.out.println("Array list is empty");
        }else
        System.out.println("Array list is not empty");
    }
}