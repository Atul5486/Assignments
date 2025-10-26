import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(10); 

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        colors.ensureCapacity(20);

        System.out.println("Capacity ensured for 20 elements.");

        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Purple");
        System.out.println("ArrayList after adding elements: " + colors);
    }
}