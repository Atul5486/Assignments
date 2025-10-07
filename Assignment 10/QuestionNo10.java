class Main extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=15;i++){
            if(i%5==0)
            System.out.print("HELLO  ");
            else
            System.out.print("hii  ");
        }
    }
    public static void main(String args[]){
        Main obj=new Main(); 
        obj.start();
    }
}