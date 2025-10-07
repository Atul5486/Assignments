import java.io.*;
class Main{
    public static void main(String args[]){
        File file = new File("C:\\Users\\admin\\Desktop\\Assignment\\Assignment 10\\Example\\Shopping.dat");
        if(!file.exists()){
            System.out.println("File Not Found");
        }
        try(FileInputStream fin = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fin);){    
            Shopping obj = (Shopping)ois.readObject();
            System.out.println(obj);
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Exception : "+e);
        }
    }
}