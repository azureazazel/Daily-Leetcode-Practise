package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FindEven {
    public static List<Integer> even(List<Integer> list){
        return list.stream().filter(n->n%2==0).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(25,2,6,16,78,95);
        System.out.println(even(list));
    }
}
