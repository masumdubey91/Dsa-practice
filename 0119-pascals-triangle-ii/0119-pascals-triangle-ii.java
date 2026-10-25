class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row=new ArrayList<>();
        row.add(1);
        for(int i=1;i<=rowIndex;i++){
            row.add(1);
            for(int j=i-1;j>0;j--){
                row.set(j,row.get(j)+row.get(j-1));
            }
        }
        return row;



        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna