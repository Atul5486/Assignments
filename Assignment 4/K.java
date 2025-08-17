class Main {
    public static void main(String[] args) {
        for(int i=5;i>0;i--){
            for(int j=1;j<=4;j++){
                if(j==1 || j==i-1 || (i==2 && j==3) || (i==1 && j==4))
                System.out.print("* ");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}