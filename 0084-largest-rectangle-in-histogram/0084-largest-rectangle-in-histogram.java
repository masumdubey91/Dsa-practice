class Solution {
    public int largestRectangleArea(int[] heights) {
        int n =heights.length;
        int[] nse=new int[n];
        int[] pse=new int[n];
        Stack<Integer> st=new Stack<>();


     for(int i=0;i<n;i++){
        while(!st.isEmpty() && heights[st.peek()]>=heights[i] ){
            st.pop();

        }
        pse[i]=st.isEmpty()?-1:st.peek();
        st.push(i);

} 
st.clear();
for(int i=n-1;i>=0;i--){
        while(!st.isEmpty() && heights[st.peek()]>heights[i] ){
            st.pop();

        }
        nse[i]=st.isEmpty()?n:st.peek();
        st.push(i);

} 
int max=0;

for(int i=0;i<n;i++){
    
int width=nse[i]-pse[i]-1;
int area=heights[i]*width;


max=Math.max(max,area);
       

}
return max;
   }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna