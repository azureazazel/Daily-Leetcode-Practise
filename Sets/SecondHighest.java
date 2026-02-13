package Sets;
import java.util.*;
public class SecondHighest {
    public static int SecFind(List<Integer> list){
        Set<Integer> set = new TreeSet<>();
        for(int i : list){
            set.add(i);
        }
        int j = set.size()-2;
        if(set.contains(j)){
            return ((Object) set).getvalue(j);
        }
    }
}
