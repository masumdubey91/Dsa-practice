class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for
        (int i=0;i<n;i++){
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(maxSum,currentSum);

        }
        return maxSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna