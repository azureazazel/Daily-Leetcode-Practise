public class NumberPrint {
    public static void number() {
        for (int i = 1; i <= 5; i++) {      
            for (int j = 1; j <= i; j++) {   
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        number();
    }
}
