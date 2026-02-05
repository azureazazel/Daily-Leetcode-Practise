import java.util.Scanner;
public class LeapYear {
    public static boolean CheckYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year");
        int year = sc.nextInt();
        sc.close();
        if(year%400 == 0 || (year%100!=0 && year%4==0)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        if(CheckYear()== true){
            System.out.println("The given year is a leap year");
        }
        else{
            System.out.println("The given year is not a leap year");
        }
    }
}
