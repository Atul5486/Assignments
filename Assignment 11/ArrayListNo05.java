import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        ArrayList<String> colors=new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original ArrayList: "+colors);

        colors.set(1,"Black");

        System.out.println("Updated ArrayList: "+colors);
    }
}