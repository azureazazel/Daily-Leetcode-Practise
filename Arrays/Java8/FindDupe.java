package Java8;

import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class FindDupe {
    public static List<Integer> findD(List<Integer> list){
        Set<Integer> seen = new HashSet<>();
        return list.stream().filter(n -> !seen.add(n)).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,3,5,9,9,55);
        System.out.println(findD(list));

    }
}
