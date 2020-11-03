import java.util.Scanner;
class ConstructorMethod{
   
   String name1 = "";
   int rollNo1 = 0; 
   public ConstructorMethod(String name, int rollNo){
          name1 = name;
          rollNo1 = rollNo;      
   }
   public void show_details(){
       System.out.println("Your Name Is = "+name1);
       System.out.println("Your Roll No Is = "+rollNo1);
   }
}


class Constructor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String name = "";
        int rollNo = 0; 
        System.out.println("Enter Your Name");
        name = sc.nextLine();
        System.out.println("Enter Your Roll No");   
        rollNo = sc.nextInt();     
        ConstructorMethod std = new ConstructorMethod(name, rollNo);
        std.show_details();


    }
}