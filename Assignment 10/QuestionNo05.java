import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
class Main{
    public static void main(String args[]){
        String imageFile = "C:\\Users\\admin\\Desktop\\Assignment\\Assignment 10\\Example\\Bag1.jpg"; 
        Path imagePath=Paths.get(imageFile);
        try {
            long size=Files.size(imagePath);
            System.out.println("IMage size in bytes is : "+size);
            double time=(double)size/256;
            System.out.println("Time needs to upload file is : "+time+" sec");
        } catch (IOException e) {
            System.err.println("Error reading the image: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
