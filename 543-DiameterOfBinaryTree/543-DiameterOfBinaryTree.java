// Last updated: 8/4/2025, 6:54:38 PM
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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int diam1 = diameterOfBinaryTree(root.left);
        int diam2 = diameterOfBinaryTree(root.right);
        int diam3 = heightOfTree(root.left) + heightOfTree(root.right);

        return Math.max(diam3,Math.max(diam1,diam2));
    }
    public static int heightOfTree(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftheight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int h = Math.max(leftheight,rightHeight)+1;
        return h;
    }
}