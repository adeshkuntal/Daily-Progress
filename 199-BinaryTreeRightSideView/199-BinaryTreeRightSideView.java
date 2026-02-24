// Last updated: 2/24/2026, 6:54:19 PM
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
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer> l = new ArrayList<>();
19        if(root == null){
20            return l;
21        }
22
23        Queue<TreeNode> q = new LinkedList<>();
24        q.add(root);
25
26        while(!q.isEmpty()){
27            int size = q.size();
28            for(int i = 0; i < size; i++){
29                TreeNode temp = q.poll();
30                if(i == size - 1){
31                    l.add(temp.val);
32                }
33                if(temp.left != null){
34                    q.add(temp.left);
35                }
36                if(temp.right != null){
37                    q.add(temp.right);
38                }
39            }
40        }
41
42        return l;
43    }
44}