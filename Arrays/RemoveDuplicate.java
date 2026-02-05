import java.util.*;
public class RemoveDuplicate {
    public static int[] remove(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int[] newarr = set.stream().mapToInt(Integer::intValue).toArray();
        return newarr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5};
        int[] newarr =  remove(arr);
        System.out.println(Arrays.toString(newarr));
    }
}
