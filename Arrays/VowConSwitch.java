public class VowConSwitch {
    public static boolean Vowel(char c){
        char result =  Character.toLowerCase(c);
        switch(result){
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
            default:
                return false;
        }
    }
    public static void main(String[] args){
        if(Vowel('h') == true){
            System.out.println("This character is a vowel");
        }
        else{
            System.out.println("This character is a consonant");
        }
    }
}
