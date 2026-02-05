

public class LargestElement {
    public static int Largest(int[] arr){
        int result = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>result){
                result = arr[i];
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {10,25,5,40,30};
        System.out.println(Largest(arr));
    }
}
