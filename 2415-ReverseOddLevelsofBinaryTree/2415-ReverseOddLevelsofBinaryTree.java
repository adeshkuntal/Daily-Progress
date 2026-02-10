// Last updated: 2/10/2026, 11:56:52 AM
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
18    public TreeNode reverseOddLevels(TreeNode root) {
19        Queue<TreeNode> q = new LinkedList<>();
20        q.offer(root);
21        int level = 0;
22
23        while(!q.isEmpty()){
24            int size = q.size();
25            List<TreeNode> currLevel = new ArrayList<>();
26            
27            for(int i=0; i<size; i++){
28                TreeNode curr = q.poll();
29                currLevel.add(curr);
30                if(curr.left != null){
31                    q.offer(curr.left);
32                }
33                if(curr.right != null){
34                    q.offer(curr.right);
35                }
36            }
37            if (level % 2 == 1) {
38                int l = 0;
39                int r = currLevel.size() - 1;
40                while (l < r) {
41                    int tmp = currLevel.get(l).val;
42                    currLevel.get(l).val = currLevel.get(r).val;
43                    currLevel.get(r).val = tmp;
44                    l++;
45                    r--;
46                }
47            }
48            level++;
49        }
50        
51        return root;
52    }
53}
54
55
56