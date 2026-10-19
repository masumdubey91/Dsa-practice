class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st=new Stack<>();
        for(String op:operations){
            if(op.equals("C")){
                st.pop();
            }else if(op.equals("D")){
                st.push(2*st.peek());
            }else if(op.equals("+")){
                int last=st.pop();
                int SecondLast=st.peek();
                st.push(last);
                st.push(last+SecondLast);
            }else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int ans:st){
            sum+=ans;
        }
          return sum;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna