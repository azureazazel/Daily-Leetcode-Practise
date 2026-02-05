public class PalinArray {
    public static boolean Palindrome(int[] arr){
        int n = arr.length;
        int right = arr.length-1;
        for(int i = 0;i<n;i++){
            if(arr[i] == arr[right]){
                return true;
            }
            right++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        if(Palindrome(arr) == true){
            System.out.println("This is a palindrome");
        }
        else{
            System.out.println("This is not a palindrome");
        }
    }
}
