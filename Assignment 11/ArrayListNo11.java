import java.util.ArrayList;
import java.util.Collections;
class Main{
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        System.out.println("Original ArrayList: "+list);

        Collections.reverse(list);

        System.out.println("Reversed ArrayList: "+list);
    }
}