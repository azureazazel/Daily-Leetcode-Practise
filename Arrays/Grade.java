public class Grade {
    public static char grade(int marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        System.out.println("Your grade is: " + grade(87));
    }
}
