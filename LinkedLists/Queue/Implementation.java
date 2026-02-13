package LinkedLists.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Implementation {
    Queue<Integer> queue = new LinkedList<>();
    public int insert(int value){
        return queue.add(value);
    }

    public int look(){
        return queue.peek();
    }
    public int remove(){
        return queue.poll();
    }
    public static void main(String[] args) {
        
    }
}
