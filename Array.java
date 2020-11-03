import java.util.Scanner;
class Array{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
      
        int [] a= new int[5];
        
        for(int i=0;i <= 4; i++){
           a[i] = i;
           System.out.println();
        }
      
        for(int i=0;i <= 4; i++){
           System.out.println(a[i]);
         }
        

    }
}