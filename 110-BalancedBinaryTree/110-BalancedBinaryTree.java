// Last updated: 2/24/2026, 12:42:24 PM
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> res = new ArrayList<>();
19        
20        if(root == null) return res;
21        
22        Queue<TreeNode> q = new LinkedList<>();
23        q.add(root);
24        boolean flag = false;
25        
26        while(!q.isEmpty()){
27            int size = q.size();
28            List<Integer> l = new ArrayList<>();
29            
30            for(int i=0; i<size; i++){
31                TreeNode curr = q.poll();
32                l.add(curr.val);
33                
34                if(curr.left != null){
35                    q.add(curr.left);
36                }
37                if(curr.right != null){
38                    q.add(curr.right);
39                }
40            }
41            
42            if(flag){
43                Collections.reverse(l);
44            }
45            
46            res.add(l);
47            flag = !flag;
48        }
49        
50        return res;
51    }
52}