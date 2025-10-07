import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

class Main{
    public static void main(String args[]){
        String header[]={"Name","Age","City"};
        String data1[]={"Peter","20","Indore"};
        String data2[]={"Andrew","25","Bhopal"};
        String data3[]={"Jackson","22","Indore"};

        File file=new File("C:\\Users\\admin\\Desktop\\Assignment\\Assignment 10\\Example\\Data.csv");

        try(FileWriter fw=new FileWriter(file)){
            fw.append(header[0]).append(",").append(header[1]).append(",").append(header[2]).append("\n");
            fw.append(data1[0]).append(",").append(data1[1]).append(",").append(data1[2]).append("\n");
            fw.append(data2[0]).append(",").append(data2[1]).append(",").append(data2[2]).append("\n");
            fw.append(data3[0]).append(",").append(data3[1]).append(",").append(data3[2]).append("\n");
            System.out.println("Data Inserted Successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}