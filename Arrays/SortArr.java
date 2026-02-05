class SortArr{
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i =0;i<n;i++){
            int minindex = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,3,1,4,2};
        sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}