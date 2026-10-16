class Solution {
    static final long  MOD=1_000_000_007L;
    
    public int countGoodNumbers(long n){
        long evenways=power(5,(n+1)/2);
        long oddways=power(4,(n)/2);
        return (int)((evenways*oddways)%MOD);

         }
         private long power(long base,long exp){
            if(exp==0){
                return 1;
            }
            long half=power(base,exp/2);
            long result=(half*half)%MOD;
            if(exp%2==1){
                result=(result*base)%MOD;
            }
            return result;

         }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna