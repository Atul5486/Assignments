class Name{
    synchronized void show(String firstName,String lastName){
        System.out.print("First name : " +firstName+"\t");
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
        System.out.println("Last Name : "+lastName);
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }
}
class SetName extends Thread{
    Name nm;
    String firstName,lastName;
    SetName(Name nm,String firstName,String lastName){
        this.nm=nm;
        this.firstName=firstName;
        this.lastName=lastName;
        start();
    }
    public void run(){
    nm.show(firstName,lastName);
    }
}
class Main{
    public static void main(String args[]){
        Name obj=new Name();
        SetName set1=new SetName(obj,"David","Chang");
        SetName set2=new SetName(obj,"Kim","Jong");
        SetName set3=new SetName(obj,"Peter","Parker");

    }
}