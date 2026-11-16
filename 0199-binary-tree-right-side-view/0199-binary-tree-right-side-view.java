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
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> ans=new ArrayList<>();

        rightveiw(root,0,ans);
        return ans;


        
    }
    public void rightveiw(TreeNode root,int level, List<Integer> ans){
        if(root==null)return ;
        if(level==ans.size()){
            ans.add(root.val);
        }
        rightveiw(root.right,level+1,ans);
         rightveiw(root.left,level+1,ans);


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna