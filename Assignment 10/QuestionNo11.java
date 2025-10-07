class File1{
    public void method(){
        System.out.println("Method 1");
    }
}
class File2 extends File1{
    public void method(){
        System.out.println("Method 2");
    }
}
class Main{
    public static void main(String args[]){
        File1 file1=new File1();
        File2 file2=new File2();
        new Thread(){
            @Override
            public void run(){ 
            synchronized(file1){
                System.out.println("Working with file 1");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println("Exception : "+e);
            }
            }
             synchronized(file2){
                System.out.println("Needs file 1");
            }
        }
        }.start();
        new Thread(){
            @Override
            public void run(){ 
            synchronized(file2){
                System.out.println("Working with file 2");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println("Exception : "+e);
            }
            }
             synchronized(file1){
                System.out.println("Needs file 2");
            }
        }
        }.start();
}
}