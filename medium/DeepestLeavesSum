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
    public int deepestLeavesSum(TreeNode root) {
        
        int depth = 0;
        int sum = 0;
        depth = depthcnt(root);
        int cnt = 0;
        
        sum += child(root, depth, cnt);
        
        return sum;
    }
    
    public int depthcnt(TreeNode root) {  // 깊이(레벨)을 구하는 메소드
        
        if(root == null) {
            return 0;
        }
        
        return 1+Math.max(depthcnt(root.left),depthcnt(root.right));  // 최대 레벨 return
    }
    
    public int child(TreeNode root, int depth, int cnt) {
        
        cnt++;
        int sum = 0;
        
        if(depth == cnt) {  // 최대 레벨과 현재 레벨이 같을 때
            
            return root.val;
        
        } else {
        
            if(root.left != null) {
                sum += child(root.left, depth, cnt);
            }
            
            if(root.right != null) {
                sum += child(root.right, depth, cnt);
            }
            
        }
        
        return sum;
        
    }
    
}
