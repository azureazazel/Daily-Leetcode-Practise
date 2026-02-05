import java.util.Arrays;;
public class ReverseArr {
    public static int[] reverse(int[] arr){
        int[] reverse = new int[arr.length];
        int left = 0;
        for(int i = arr.length-1;i>=0;i--){
            reverse[left] = arr[i];
            left++;
        }
        return reverse;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] reversed = reverse(arr);
        System.out.println(Arrays.toString(reversed));
        
    }
}
