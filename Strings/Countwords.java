public class Countwords {
    public static int CountWords(String str){
        int count = 0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==' '){
               count++; 
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        System.out.println(CountWords("Java is easy"));
    }
}
