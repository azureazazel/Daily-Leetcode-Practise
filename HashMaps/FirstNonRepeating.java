package HashMaps;
import java.util.*;
public class FirstNonRepeating{
    public static Character Find(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String str = "Malayalam";
        System.out.println("First non Repeating character" + Find(str));
    }
}