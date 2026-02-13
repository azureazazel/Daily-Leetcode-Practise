package LinkedLists;
import java.util.*;

public class DupElementsInsOrder {
    public static void Delete(List<Integer> list){
        Set<Integer> set = new LinkedHashSet<>();
        int n = list.size();
        for( int i : list){
            set.add(i);
        }
        System.out.println("Here is the list without duplicates while maintaing insertion order");
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(5);
        list.add(5);
        list.add(28);
        list.add(21);

        Delete(list);
    }
}
