package Java8;

import java.util.Arrays;
import java.util.List;

public class CountPrefix {
    public static int CountStrings(List<String> list, String prefix){
        return (int) list.stream().filter(n->n.startsWith(prefix)).count();
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Tree", "Trax","Stree", "Strax");
        System.out.println(CountStrings(list, "Tr"));
    }
}
