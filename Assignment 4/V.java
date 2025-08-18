class Main {
    public static void main(String[] args) {
       for(int i=1;i<=5;i++){
           for(int j=1;j<=5;j++){
               if(j==i)
               System.out.print("*");
               else
               System.out.print(" ");
           }
               for(int k=4;k>0;k--){
               if(k==i)
               System.out.print("*");
               else
               System.out.print(" ");
               }
           System.out.println();
       }
    }
}