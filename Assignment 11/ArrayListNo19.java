import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(20); 

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original ArrayList: " + colors);
        System.out.println("Size of ArrayList before trimming: " + colors.size());

        colors.trimToSize();

        System.out.println("ArrayList after trimming : " + colors);
        System.out.println("Size of ArrayList after trimming: " + colors.size());

        colors.add("Orange");
        System.out.println("ArrayList after adding element: " + colors);
    }
}