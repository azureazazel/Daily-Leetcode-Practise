package HashMaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LRU(int capacity){
        super(capacity, 0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest){
        return size()>capacity;
    }

    public int get(int key){
        return super.getOrDefault(key, -1);
    }

    public int put(int key, int value){
        return super.put(key, value);
    }

    public static void main(String[] args){
         LRU cache = new LRU(2);

        cache.put(1, 10);
        cache.put(2, 20);
        System.out.println(cache); 

        cache.get(1);
        cache.put(3, 30); 

        System.out.println(cache);
    }
}

