
public class SeclargestElement {
    public static int Second(int[] arr){
        int n = arr.length;
        int largest = arr[0];
        int seclargest = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]>largest){
                seclargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>seclargest && arr[i]!=largest){
                seclargest = arr[i];
            }
        }
        return seclargest;   
    }
    public static void main(String[] args){
        int[] arr = {10,25,5,40,30};
        System.out.println(Second(arr));
    }
}
