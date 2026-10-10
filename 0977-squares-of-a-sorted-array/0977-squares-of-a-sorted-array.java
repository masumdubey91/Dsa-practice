class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans=new int[n];

        int left=0;
        int right=n-1;
        int k=n-1;
        while(left<=right){
            int leftSquare=nums[left]*nums[left];
            int rightSquare=nums[right]*nums[right];
            if(leftSquare>rightSquare){
                ans[k]=leftSquare;
                left++;
                }
                else{
                    ans[k]=rightSquare;
                    right--;
                }
                k--;

        }
        return ans;
        

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna