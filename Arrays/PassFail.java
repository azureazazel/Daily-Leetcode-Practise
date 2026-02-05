import java.util.Scanner;
public class PassFail {
    public static boolean Check(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        sc.close(); 
        if(marks>=40){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        if(Check() == true){
            System.out.println("Student has passed");
        }
        else{
            System.out.println("Student has failed");
        }
    }
}
