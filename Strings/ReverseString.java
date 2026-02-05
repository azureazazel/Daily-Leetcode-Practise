

public class ReverseString {
    public static void reverseStr(String name){
        int i = name.length()-1;
        char[] reversed = new char[name.length()];
        for(char c : name.toCharArray()){
            reversed[i] = c;
            i--;
        }
        System.out.println("The reversed string is " + new String(reversed));
    }
    public static void main(String[] args) {
        String name = "Java";
        reverseStr(name);
    }
}
