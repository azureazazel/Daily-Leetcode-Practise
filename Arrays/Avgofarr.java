public class Avgofarr {
    public static int Avg(int[] arr){
        int n = arr.length;
        int sum =0;
        for(int i = 0;i<n;i++){
            sum += arr[i];
        }
        int avg = sum/n;
        return avg;
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        System.out.println(Avg(arr));
    }
}
