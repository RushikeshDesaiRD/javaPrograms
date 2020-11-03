import java.util.Scanner;
public class Student{
    String name=""; 
    int rollNo=0;
    Scanner sc = new Scanner(System.in);

    public void get_details(){
        System.out.println("Enter Your Name");
        name = sc.nextLine();
        System.out.println("Enter Roll No");
        rollNo = sc.nextInt();

    }


    public void show_details(){
        System.out.println("Your Name Is "+name);
       
        System.out.println("Your Roll No Is "+rollNo);
        

    }
}