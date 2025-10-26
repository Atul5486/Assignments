import java.util.ArrayList;
import java.util.Iterator;
class Main{
    public static void main(String[] args){
        ArrayList<String> colors=new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        Iterator<String> itr=colors.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}