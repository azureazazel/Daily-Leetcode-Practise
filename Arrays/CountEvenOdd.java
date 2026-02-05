public class CountEvenOdd {
    public static void Count(int[] arr){
        int oddcount = 0;
        int evencount = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("The even count in this array is " + evencount);
        System.out.println("The odd count in this array is " + oddcount);
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        Count(arr);
    }
}
