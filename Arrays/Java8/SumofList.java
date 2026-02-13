package Java8;

import java.util.Arrays;
import java.util.List;

public class SumofList {
    public static int SumList(List<Integer> list){
        return list.stream().reduce(0, Integer::sum);
    }
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,3,4,5);
        System.out.println(SumList(list));
    }
}
