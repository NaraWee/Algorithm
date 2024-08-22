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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        boolean b = false;
        
        if(p == null && q == null) {
            return true;
        } else if(p == null || q == null) {
            return false;
        }
        
        if(p.val != q.val) {
            return false;
        }
        
        b = isSameTree(p.right, q.right);
        
        if(b) {
            b = isSameTree(p.left, q.left);    
        }   
        
        return b;
        
    }
    
}
