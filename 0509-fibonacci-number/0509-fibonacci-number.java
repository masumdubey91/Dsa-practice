class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;

        }else if(n==1){
            return 1;

        }
        int firstterm=0;
        int secondterm=1;
        for(int i=1;i<=n;i++){
          int  thirdterm=firstterm+secondterm;
            firstterm=secondterm;
            secondterm=thirdterm;
             }
        return firstterm;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna