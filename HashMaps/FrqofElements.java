package HashMaps;
import java.util.*;
public class FrqofElements {
    public static void FreqCount(List<Integer> list){
        Map<Integer,Integer> map = new HashMap<>();
        int[] count = new int[list.size()];
        for(int i : list){
            map.put(i, map.getOrDefault(count[i]++, 0) + 1);
        }
        System.out.println("The freq count is " + count);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(7);
        FreqCount(list);
    }
}
