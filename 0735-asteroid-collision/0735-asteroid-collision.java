class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int asteroid:asteroids){
            boolean alive=true;

        
        while(alive && !stack.isEmpty() && stack.peek()>0 && asteroid<0){
            if(Math.abs(asteroid)>stack.peek()){
                stack.pop();

            }
            else if(Math.abs(asteroid)==stack.peek()){
                stack.pop();
                alive=false;

            }
            else{
                alive=false;
            }
        }
        if(alive){
            stack.push(asteroid);
        }
        
    }
    int[] ans=new int[stack.size()];

    for(int i=0 ;i<stack.size();i++){
    ans[i]=stack.get(i);
    }
    return ans;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna