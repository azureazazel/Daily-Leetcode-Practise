package Java8;

import java.util.Arrays;
import java.util.List;

public class FindMin {
    public static int Min(List<Integer> list){
        return list.stream().reduce(Integer::min).orElse(0);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,4,29,37,75);
        System.out.println(Min(list));
    }
}
