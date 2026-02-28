// Last updated: 2/28/2026, 2:54:21 PM
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
16
17class Solution {
18    public int widthOfBinaryTree(TreeNode root) {
19        if(root == null){
20            return 0;
21        }
22        
23        Queue<Pair> q = new LinkedList<>();
24        q.add(new Pair(root, 0L));
25        int ans = 0;
26        
27        while(!q.isEmpty()){
28            int size = q.size();
29            long min = q.peek().index;
30            long first = 0;
31            long last = 0;
32            
33            for(int i = 0; i < size; i++){
34                Pair p = q.poll();
35                long currIndex = p.index - min;
36                
37                if(i == 0) first = currIndex;
38                if(i == size - 1) last = currIndex;
39                
40                if(p.node.left != null){
41                    q.add(new Pair(p.node.left, 2 * currIndex + 1));
42                }
43                if(p.node.right != null){
44                    q.add(new Pair(p.node.right, 2 * currIndex + 2));
45                }
46            }
47            
48            ans = Math.max(ans, (int)(last - first + 1));
49        }
50        
51        return ans;
52    }
53}
54
55class Pair {
56    TreeNode node;
57    long index;
58    
59    Pair(TreeNode node, long index){
60        this.node = node;
61        this.index = index;
62    }
63}