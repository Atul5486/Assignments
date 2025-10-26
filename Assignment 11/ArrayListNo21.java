import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(10); 
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        System.out.println("ArrayList Before Replace elements: " + colors);
        colors.set(1,"Lightseagreen");
        System.out.println("ArrayList After Replace elements: " + colors);
    }
}