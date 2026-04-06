package Sets;
import java.util.HashSet;

class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int maxlen = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
           set.add(num);
            }
        for(int num : set){
            if(!set.contains(num-1)){
                int current = num;
                int length = 1;
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                maxlen = Math.max(maxlen, length);
            }
        }
        return maxlen;
        }
    }