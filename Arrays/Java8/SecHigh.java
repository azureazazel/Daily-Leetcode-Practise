package Java8;

import java.util.Arrays;
import java.util.List;

public class SecHigh {
    public static int FindSecond(List<Integer> list){
        return list.stream()
            .distinct()
            .sorted((a, b) -> b - a)
            .skip(1)
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("List must have at least 2 unique elements"));
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(55,100,24,101,49);
        System.out.println(FindSecond(list));
    }
}
