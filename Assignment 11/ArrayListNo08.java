import java.util.ArrayList;
import java.util.Collections;
class Main{
    public static void main(String[] args){
        ArrayList<String> colors=new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println("Original ArrayList: "+colors);

        Collections.sort(colors);

        System.out.println("Sorted ArrayList: "+colors);
    }
}