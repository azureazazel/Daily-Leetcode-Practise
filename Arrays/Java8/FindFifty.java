package Java8;

import java.util.Arrays;
import java.util.List;

public class FindFifty {
    public static List<Integer> Fifty(List<Integer> list){
        return list.stream().filter(n->n>50).toList();
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(55,100,24,101,49);
        System.out.println(Fifty(list));
    }
}
