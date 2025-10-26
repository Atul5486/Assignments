import java.util.ArrayList;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        ArrayList<String> list1 = new ArrayList<String>();
        Collections.addAll(list1,"Apple","Banana","Cherry","Dargon Fruit");
        ArrayList<String> list2 = new ArrayList<String>();
        Collections.addAll(list2,"Evacardo","Sita Fal","Grapes","Pomgranet");
        list1.addAll(list2);
        System.out.println("After join both \n"+list1);
    }
}