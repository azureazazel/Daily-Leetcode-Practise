public class CountVowels {
    public static int Count(String str){
        int n = str.length()-1;
        int count = 0;
        for(char c : str.toCharArray()){
            if((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') && c != ' '){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Count("Java Programming"));
    }
}
