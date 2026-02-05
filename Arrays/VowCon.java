public class VowCon {
    public static boolean Vowel(char c){
        char lower = Character.toLowerCase(c);
        if(lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower=='u'){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        if(Vowel('A') == true){
            System.out.println("This character is a vowel");
        }
        else{
            System.out.println("This character is a consonant");
        }
    }
}
