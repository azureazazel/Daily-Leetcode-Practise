public class SmallestElement {
    public static int Small(int[] arr){
        int small =  arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        return small;
    }
    public static void main(String[] args){
        int[] arr = {10,25,5,40,30};
        System.out.println(Small(arr));
    }
}
