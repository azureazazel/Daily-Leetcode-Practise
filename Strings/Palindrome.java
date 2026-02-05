class Palindrome{
    public static boolean check(String str){
        int right = str.length()-1;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == str.charAt(right)){
                right++;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        if(check("madam") == true){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}