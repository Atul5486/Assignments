import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        ArrayList<String> colors=new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        colors.add(0,"Yellow");

        System.out.println("After insertion: "+colors);
    }
}