import java.util.Scanner;
class Medical{
    Scanner inp=new Scanner(System.in);
    String medicine[]={"Atorvastatin","Levothyroxine","Metformin", "Lisinopril", "Albuterol", "Omeprazole","Amlodipine", "Metoprolol","Ibuprofen","Amoxicillin"};
    double price[]={100,200,300,450,550,62.12,654.25,36.32,50,90};
    void retailer(){
        int unit[]=new int[5];
        double total=0;
        int count=0;
        for(int i=0;i<medicine.length/2;i++){
             System.out.println("Medicine name \t Price");
            System.out.println(medicine[i]+"\t "+price[i]);
            System.out.println("Enter unit of medicine "+(i+1));
            unit[i]=inp.nextInt();
            total+=unit[i]*price[i];
            if(unit[i]>0)
            count++;
        }
        System.out.println("Total amount of : "+count + " medicine is :"+total);
        
        System.out.println();
    }
    void wholeSeller(){
         int unit[]=new int[5];
        double total=0;
        int count=0;
        for(int i=0;i<medicine.length;i++){
            System.out.println("Medicine name \t Price");
            System.out.println(medicine[i]+"\t "+price[i]);
            System.out.println("Enter unit of medicine "+(i+1));
            unit[i]=inp.nextInt();
            total+=unit[i]*price[i];
            if(unit[i]>0)
            count++;
        }
        System.out.println("Total amount of : "+count + " medicine is :"+total);
        
        System.out.println();
    }
}
class Main {
    public static void main(String[] args) {
       Medical obj=new Medical();
       obj.retailer();
       obj.wholeSeller();
    }
}