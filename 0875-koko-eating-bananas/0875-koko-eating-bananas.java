class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int low=1;
        int high=0;
        for(int i=0;i<=nums.length-1;i++){
            high=Math.max(high,nums[i]);
              }
              int ans=high;
              while(low<=high){
                int mid=low+(high-low)/2;
                    long sum=0;
                    for(int i=0;i<=nums.length-1;i++){
                        sum+=(nums[i]+(long)mid-1)/mid;
                    }
                    if(sum<=h){
                        ans=mid;
                        high=mid-1;
                        }else{
                            low=mid+1;
                        }

                    
                
              }
              return ans;



    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna