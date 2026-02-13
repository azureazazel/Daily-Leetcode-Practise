package Java8;

import java.util.Arrays;
import java.util.List;

public class RemoveDupe {
    public static List<Integer> remove(List<Integer> list){
        return list.stream().distinct().toList();
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,3,5,9,9,55);
        System.out.println(remove(list));
    }
}
