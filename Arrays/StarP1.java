public class StarP1 {
    public static void Star(){
        for(int i = 1; i<=5;i++){
            for(int j = 5;j>=i;j--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Star();
    }
}
