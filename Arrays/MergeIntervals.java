import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
       public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
       int[] current = intervals[0];
        List<int[]> result = new ArrayList<>();
       for(int i = 1;i<intervals.length;i++){
            int[] next = intervals[i];
            if(next[0]<=current[1]){
                current[1] = Math.max(next[1], current[1]);
            }
            else{
                result.add(current);
                current = next;
            }
       }
        result.add(current);
        return result.toArray(new int[result.size()][]);
    }
}
