// Last updated: 3/1/2026, 1:44:29 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int countNodes(TreeNode root) {
18        if(root == null){
19            return 0;
20        }
21        Queue<TreeNode> q = new LinkedList<>();
22        q.add(root);
23        int count = 0;
24        
25        while(!q.isEmpty()) {
26            int size = q.size();
27            count += size;
28            for(int i = 0; i < size; i++) {
29                TreeNode curr = q.poll();
30                
31                if(curr.left != null) {
32                    q.add(curr.left);
33                }
34                
35                if(curr.right != null) {
36                    q.add(curr.right);
37                }
38            }
39        }
40
41        return count;
42    }
43}