// 8. Write a Java program to compare two tree sets.
import java.util.TreeSet;
import java.util.Collections;
class Main{
    public static void main(String args[]){
        TreeSet<String> colors=new TreeSet<>();
        Collections.addAll(colors,"Pink","Green","Yellow","Voilet","Lightseagreen","Black");
        TreeSet<String> lightColors=new TreeSet<>();
        Collections.addAll(lightColors,"LightPink","LightGreen","LightYellow","LightVoilet","Lightseagreen");
        
        if(colors.equals(lightColors)){
            System.out.println("Both tree set are equals");
        }else
            System.out.println("Both tree set aren't equals");

        
    }   
}