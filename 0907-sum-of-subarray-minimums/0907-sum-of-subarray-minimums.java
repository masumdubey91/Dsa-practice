class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            left[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            right[i]=st.isEmpty()?n:st.peek();
            st.push(i);

        }
        int mod=1_000_000_007;
        long sum=0;
        for(int i=0;i<n;i++){
            int leftChoices=i-left[i];
            int rightChoices=right[i]-i;
            long contribution=(long) arr[i]*leftChoices*rightChoices;
            sum=(sum+contribution)%mod;
        }
        return (int) sum;


        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna