import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        ArrayList<String> colors=new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        String element=colors.get(2);

        System.out.println("Element index 2: "+element);
    }
}