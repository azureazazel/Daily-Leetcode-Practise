package Java8;

import java.util.Arrays;
import java.util.List;

public class SortDesc {
    public static List<Integer> dessort(List<Integer> list){
        return list.stream().sorted((a, b) -> b.compareTo(a)).toList();
    }
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,3,4,5);
        System.out.println(dessort(list));
    }

}
