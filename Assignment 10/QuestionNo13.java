class Except extends Exception{
    Except(String err){
        super(err);
    }
    void createException(){
        try{
        throw new Except("Divide by Odd number");
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }
}
class Main{
    public static void main(String args[]){
        Except exc=new Except("");
        int num1=10;
        int num2=2;
        if(num1%num2!=0){
            exc.createException();
        }else{
            System.out.println("Divided by even number");
        }
    }
}