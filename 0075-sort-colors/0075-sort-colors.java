class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;

        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;

            }else if(nums[mid]==2){
                int temp=nums[mid];
                 nums[mid]=nums[high];
                nums[high]=temp;
                high--;

            }else{
                mid++;
            }
        } 
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna