public class DivFive {
    public static boolean Five(int num){
        if(num%5 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        if(Five(17) == true){
            System.out.println("This number is divisible by 5");
        }
        else{
            System.out.println("It is not divisible by 5");
        }
    }
}
