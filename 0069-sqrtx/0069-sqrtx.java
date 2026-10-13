class Solution {
    public int mySqrt(int x) {
        int low=1;
        int high=x;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((long)mid*mid<=x){
                ans=mid;
                low=mid+1;

            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna