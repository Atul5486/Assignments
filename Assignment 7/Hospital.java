import java.util.Scanner;
public class Main{
    static Scanner inp=new Scanner(System.in);
    
    static Doctor[] dc=new Doctor[100];
    static Patient[] pt=new Patient[100];
    static Medicine[] md=new Medicine[100];
    
    static int doctorCount=0,patientCount=0,medicineCount=0;
    
    // ------------------- Doctor ------------------
    static void addDoctor(){
        System.out.println("Enter Id of doctor");
        int id=inp.nextInt();
        inp.nextLine();
        System.out.println("Enter Name of doctor");
        String name=inp.nextLine();
        System.out.println("Enter specialization of doctor");
        String specialization=inp.nextLine();
        dc[doctorCount++]=new Doctor(id,name,specialization);
    }
    static void searchDoc() {
        System.out.println("Enter name or id of doctor");
        String key = inp.next();
        boolean found = false;

        if (doctorCount > 0) {
            for (int i = 0; i < doctorCount; i++) {
                if(key.equalsIgnoreCase(dc[i].getName())) {
                    dc[i].display();
                    found = true;
                    break;
                }
                    int num = Integer.parseInt(key);
                    if (num == dc[i].getId()) {
                        dc[i].display();
                        found = true;
                        break;
                    }
            }
        }
        if(!found){
            System.out.println("\nNot found\n");
        }
    }
    static void displayDoc(){
        System.out.printf("\n %-10s %-20s %-20s%n", "Doctor Id", "Name", "Specialization ");
        for(int i=0;i<doctorCount;i++){
            dc[i].display();
        }
        System.out.println("--------------------------------");
    }

    // ------------------- Patient ------------------
    static void searchPat() {
        System.out.println("Enter name or id of patient");
        String key = inp.next();
        boolean found = false;

        if (patientCount > 0) {
            for (int i = 0; i < patientCount; i++) {
                if(key.equalsIgnoreCase(pt[i].getName())) {
                    pt[i].display();
                    found = true;
                    break;
                }
                    int num = Integer.parseInt(key);
                    if (num == pt[i].getId()) {
                        pt[i].display();
                        found = true;
                        break;
                    }
            }
        }
        if(!found){
            System.out.println("\nNot found\n");
        }
    }
   static void displayPat(){
    System.out.printf("\n %-10s %-20s %-20s %-10s%n", "Patient Id", "Name", "Disease", "DoctorId");
    for(int i=0;i<patientCount;i++){
        pt[i].display();
    }
    System.out.println("--------------------------------");
}

    static void addPatient(){
    System.out.println("Enter Id of patient");
    int id=inp.nextInt();
    inp.nextLine();
    System.out.println("Enter Name of patient");
    String name=inp.nextLine();
    System.out.println("Enter disease of patient");
    String disease=inp.nextLine();
    System.out.println("Enter doctor ID for treatment:");
    int docId = inp.nextInt();

    boolean doctorExists = false;
    for (int i=0; i<doctorCount; i++) {
        if (dc[i].getId() == docId) {
            doctorExists = true;
            break;
        }
    }
    if (!doctorExists) {
        System.out.println("Invalid Doctor ID! Patient not added.");
        return;
    }

    pt[patientCount++] = new Patient(id, name, disease, docId);
}

static void viewPatientsUnderDoctor(){
    System.out.println("Enter Doctor ID to see patients:");
    int docId = inp.nextInt();
    boolean found = false;

    System.out.printf("\n %-10s %-20s %-20s%n", "Patient Id", "Name", "Disease");
    for (int i=0; i<patientCount; i++) {
        if (pt[i].getDoctorId() == docId) {
            System.out.printf(" %-10d %-20s %-20s%n", pt[i].getId(), pt[i].getName(), pt[i].getDisease());
            found = true;
        }
    }
    if (!found) {
        System.out.println("No patients found for this doctor.");
    }
}

    // ------------------- Medicine ------------------
    static void addMedicine(){
        System.out.println("Enter Id of medicine");
        int id=inp.nextInt();
        inp.nextLine();
        System.out.println("Enter Name of medicine");
        String name=inp.nextLine();
        System.out.println("Enter price of medicine");
        double price=inp.nextDouble();
        md[medicineCount++]=new Medicine(id,name,price);
    }
    static void searchMedi() {
        System.out.println("Enter name or id of medicine");
        String key = inp.next();
        boolean found = false;

        if (medicineCount > 0) {
            for (int i = 0; i < medicineCount; i++) {
                if(key.equalsIgnoreCase(md[i].getName())) {
                    md[i].display();
                    found = true;
                    break;
                }
                    int num = Integer.parseInt(key);
                    if (num == md[i].getId()) {
                        md[i].display();
                        found = true;
                        break;
                    }
            }
        }
        if(!found){
            System.out.println("\nNot found\n");
        }
    }
    static void displayMedi(){
        System.out.printf("\n%-10s %-20s %-20s%n", "Medicine Id", "Name", "Price");
        for(int i=0;i<medicineCount;i++){
            md[i].display();
        }
        System.out.println("--------------------------------");
    }
    
    // ------------------- Main Menu ------------------
    public static void main(String args[]){
        int choice;
        do{
            System.out.println("\nEnter your choice");
            System.out.println("1.Add doctor");
            System.out.println("2.View all doctors");
            System.out.println("3.Search doctor");
            System.out.println("4.Add patient");
            System.out.println("5.View all patients");
            System.out.println("6.Search patient");
            System.out.println("7.Add medicine");
            System.out.println("8.View all medicines");
            System.out.println("9.Search medicine");
            System.out.println("10.View patients under a doctor");
            System.out.println("0.Quit");
            choice=inp.nextInt();
            switch(choice){
                case 1:addDoctor();break;
                case 2:displayDoc();break;
                case 3:searchDoc();break;
                case 4:addPatient();break;
                case 5:displayPat();break;
                case 6:searchPat();break;
                case 7:addMedicine();break;
                case 8:displayMedi();break;
                case 9:searchMedi();break;
                case 10:viewPatientsUnderDoctor();break;
                case 0:System.out.println("Exiting successfully");break;
                default:System.out.println("Invalid choice");
            }
        }while(choice!=10);
    }
}

// ===================== Classes =====================
class Doctor{
    private int id;
    private String name;
    private String specialization;
    Doctor(int id,String name,String specialization){
        this.id=id;
        this.name=name;
        this.specialization=specialization;
    }
    void display() {
        System.out.printf(" %-10d %-20s %-20s%n", id, name, specialization);
    }

    public int getId() { return id; }
    public String getName() { return name; }
}

class Patient {
    private int id;
    private String name;
    private String disease;
    private int doctorId;

    Patient(int id, String name, String disease, int doctorId) {
        this.id = id;
        this.name = name;
        this.disease = disease;
        this.doctorId = doctorId;
    }

    void display() {
        System.out.printf(" %-10d %-20s %-20s %-10d%n", id, name, disease, doctorId);
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getDoctorId() { return doctorId; }
    public String getDisease() { return disease; }
}

class Medicine{
    private int id;
    private String name;
    private double price;
    Medicine(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
   void display() {
        System.out.printf(" %-10d %-20s %-20.2f%n", id, name, price);
    }
    public int getId() { return id; }
    public String getName() { return name; }
}
