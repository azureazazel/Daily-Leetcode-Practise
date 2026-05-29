public class KokoBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int maxspeed = 0;
        for(int s : piles){
            maxspeed = Math.max(s, maxspeed);
        }
        int left = 1;
        int right = maxspeed;
        while(left<right){
            int mid = left + (right-left) / 2;
            int hours = 0;
            for(int pile : piles){
                hours += (pile + mid -1)/mid;
            }
            if(hours<=h){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}
