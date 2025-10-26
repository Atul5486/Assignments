import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println("Original ArrayList: "+colors);

        colors.remove(2);

        System.out.println("After removing third element: "+colors);
    }
}