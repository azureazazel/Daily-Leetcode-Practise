package Java8;

import java.util.Arrays;
import java.util.List;

public class Findmax {
    public static int max(List<Integer> list){
        return list.stream().reduce(Integer::max).orElse(0);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(55,100,24,101,49);
        System.out.println(max(list));
    }
}
