class Solution {
    public int mySqrt(int x) {
        
        int l = 1;
        int r = x /2; //Because for x >= 2, the square root can never be greater than x / 2.
        int ans = 0;

        if(x < 2){
            return x;
        }

        while(l <= r){
            int mid = l + (r-l) / 2;

            if(mid <= x / mid){
                ans = mid;
                l = mid + 1; //to find the largest.
            }
            else{
                r = mid - 1;
            }
        }

        return ans;
    }
}