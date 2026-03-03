// Last updated: 3/3/2026, 3:43:45 PM
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
17    public boolean findTarget(TreeNode root, int k) {
18        Set<Integer> set = new HashSet<>();
19        Queue<TreeNode> q = new LinkedList<>();
20        q.add(root);
21
22        while(!q.isEmpty()){
23            int size = q.size();
24            for(int i=0; i<size; i++){
25                TreeNode curr = q.poll();
26                int need = k-curr.val;
27                if(set.contains(need)){
28                    return true;
29                }
30                set.add(curr.val);
31                if(curr.left != null){
32                    q.add(curr.left);
33                }
34                if(curr.right != null){
35                    q.add(curr.right);
36                }
37            }
38        }
39
40        return false;
41    }
42}