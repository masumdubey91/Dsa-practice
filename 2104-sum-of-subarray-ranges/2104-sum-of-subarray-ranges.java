class Solution {
    public long subArrayRanges(int[] arr) {
         int n=arr.length;
         long minSum=0;
         long maxSum=0;
        int[] leftMin=new int[n];
        int[] rightMin=new int[n];
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            leftMin[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            rightMin[i]=st.isEmpty()?n:st.peek();
            st.push(i);

        }
         for(int i=0;i<n;i++){
            int leftChoices=i-leftMin[i];
            int rightChoices=rightMin[i]-i;
           minSum+=(long) arr[i]*leftChoices*rightChoices;
        }
         int[] leftMax=new int[n];
        int[] rightMax=new int[n];
     st.clear();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            leftMax[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            rightMax[i]=st.isEmpty()?n:st.peek();
            st.push(i);

        }
         for(int i=0;i<n;i++){
            int leftChoices=i-leftMax[i];
            int rightChoices=rightMax[i]-i;
           maxSum+=(long) arr[i]*leftChoices*rightChoices;
        }
        return maxSum-minSum;


        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna