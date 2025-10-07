import java.io.*;
class Shopping implements Serializable{
    int qty;
    String name;
    double price;
    Shopping(int qty,String name,double price){
        this.qty=qty;
        this.name=name;
        this.price=price;
    }
    @Override
    public String toString(){
        return "Shopping Items Details : { "+name+" , "+qty+" , "+price+" } ";
    }
}
class Main{
    public static void main(String args[]){
        
        Shopping shop = new Shopping(1010,"Soap",45.43);

        File file = new File("C:\\Users\\admin\\Desktop\\Assignment\\Assignment 10\\Example\\Shopping.dat");
        if(!file.exists()){
            try{
            file.createNewFile();
            System.out.println("File Created Successfully");
            }catch(Exception e){
                 System.out.println("Exception : "+e);
        }
        }
      
        try(FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fout);){    
            oos.writeObject(shop);
            System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}