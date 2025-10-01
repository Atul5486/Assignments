class Hospital{
    static Patient pt[]=new Patient[10];
    static int count=0;
     void addPatient(String name,int age,String illness){
            pt[count++]=new Patient(name,age,illness);
        }
        void records(){
            for(int i=0;i<count;i++){
                pt[i].display();
            }
        }
        void discharge(int id){
            for(int i=0;i<count;i++){
                if(id==pt[i].id){
                    System.out.println("\nDischarge Patient Details");
                    pt[i].status="Discharged";
                    pt[i].display();
                }
            }
        }

    class Patient{
        String name,illness,status;
        int age,id;
        boolean discharge;
        
        Patient(String name,int age,String illness){
            this.name=name;
            this.age=age;
            this.illness=illness;
            this.id=count;
            this.status="Admit";
        }
        void display(){
            System.out.println("\nPatient Details");
            System.out.println("Patient Name : "+name);
            System.out.println("Patient id : "+id);
            System.out.println("Patient age : "+age);
            System.out.println("Patient illness : "+illness);
            System.out.println("Patient Status : "+status);
        }
        int getAge(){
            return age;
        }
    }
   static class HealthStats{
    int total=0;
        void avgAge(){
            for(int i=0;i<count;i++){
               total+= pt[i].getAge();
            }
            System.out.println("\nAverage age of patient is : "+(total/count));
        }
    }
}
class Main{
    public static void main(String args[]){
    Hospital hp=new Hospital();
    hp.addPatient("Peter",25,"Maleria");
    hp.addPatient("James",50,"Maleria");
    hp.addPatient("Andrew",56,"Maleria");
    hp.records();
    hp.discharge(1);
    Hospital.HealthStats obj=new Hospital.HealthStats();
    obj.avgAge();
     }
}