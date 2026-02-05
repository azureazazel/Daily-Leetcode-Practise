public class GradeSys {
    public static void grade(char c){
        switch (c) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
    }
    public static void main(String[] args){
        grade('C');
    }
}
