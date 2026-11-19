/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class pair{
    TreeNode node;
    int index;

    pair (TreeNode node,int index){
        this.node=node;
        this.index=index;

    }
} 
class Solution {
    public int widthOfBinaryTree(TreeNode root) {

        if(root==null)return 0;
        Queue<pair> q=new LinkedList<>();
        q.offer(new pair(root,0));
         int ans=0;
        while(!q.isEmpty()){
            int size=q.size();

           
            int min=q.peek().index;
            int first=0;
            int last=0;
            for(int i=0;i<size;i++){
                pair p=q.poll();
                int currIndex=p.index-min;
                if(i==0)first=currIndex;
                if(i==size-1)last=currIndex;

                if(p.node.left!=null){
                    q.offer(new pair(p.node.left,2*currIndex));

                }
                 if(p.node.right!=null){
                    q.offer(new pair(p.node.right,2*currIndex+1));
                    
                }
            }
            int width=last-first+1;
            ans=Math.max(ans,width);

        }
        return ans;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna