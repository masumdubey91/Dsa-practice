class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer>q=new LinkedList();
        
        for(int student:students){
            q.offer(student);
        }
        int i=0;
        int rotations=0;
        int n=q.size();
        while(!q.isEmpty() && rotations<n){
            if(q.peek()==sandwiches[i]){
                q.poll();
                i++;
                rotations =0;
                n=q.size();
            }
            else{
                q.offer(q.poll());
                rotations++;
            }
        }
        return q.size();


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna