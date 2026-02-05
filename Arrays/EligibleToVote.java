public class EligibleToVote {
    public static void Voting(int age){
        if(age>=18){
            System.out.println("This person can vote");
        }
        else{
            System.out.println("This person cannot vote");
        }
    }
    public static void main(String[] args){
        Voting(16);
    }
}
