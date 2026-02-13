// Last updated: 2/13/2026, 9:30:53 PM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> ans = new ArrayList<>();
19        
20        if(root == null) {
21            return ans;
22        }
23        
24        Queue<TreeNode> q = new LinkedList<>();
25        q.add(root);
26        
27        while(!q.isEmpty()) {
28            int size = q.size();
29            List<Integer> level = new ArrayList<>();
30            
31            for(int i = 0; i < size; i++) {
32                TreeNode curr = q.poll();
33                level.add(curr.val);
34                
35                if(curr.left != null) {
36                    q.add(curr.left);
37                }
38                if(curr.right != null) {
39                    q.add(curr.right);
40                }
41            }
42            
43            ans.add(level);
44        }
45        
46        return ans;
47    }
48}
49