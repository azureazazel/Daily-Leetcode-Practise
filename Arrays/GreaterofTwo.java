public class GreaterofTwo {
    public static int Greater(int n1, int n2){
        if(n1>n2){
            return n1;
        }
        else{
            return n2;
        }
    }
    public static void main(String[] args){
        int n1 = 5;
        int n2 = 15;
        int result = Greater(n1, n2);
        System.out.println(result);
    }
}
