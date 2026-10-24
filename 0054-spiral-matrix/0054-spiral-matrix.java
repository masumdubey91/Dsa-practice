class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                ans.add(matrix[top][j]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);

            }
            right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    ans.add(matrix[bottom][j]);
                }
                bottom--;

            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
         }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna