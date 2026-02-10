// Last updated: 2/10/2026, 12:21:09 PM
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
17    public boolean isEvenOddTree(TreeNode root) {
18        Queue<TreeNode> q = new LinkedList<>();
19        q.offer(root);
20        int level = 0;
21
22        while(!q.isEmpty()){
23            int size = q.size();
24            List<TreeNode> currLevel = new ArrayList<>();
25            for(int i=0; i<size; i++){
26                TreeNode curr = q.poll();
27                currLevel.add(curr);
28                if(curr.left != null){
29                    q.offer(curr.left);
30                }
31                if(curr.right != null){
32                    q.offer(curr.right);
33                }
34            }
35
36            if(level % 2 == 0){
37                int l = 0;
38                int r = currLevel.size() - 1;
39                while(l <= r-1){
40                    if(currLevel.get(l).val % 2 == 0 || currLevel.get(l).val >= currLevel.get(l+1).val){
41                        return false;
42                    }
43                    l++;
44                }
45                if(currLevel.get(r).val % 2 == 0){
46                    return false;
47                }
48            }
49            else{
50                int l = 0;
51                int r = currLevel.size() - 1;
52                while(l <= r-1){
53                    if(currLevel.get(l).val % 2 != 0 || currLevel.get(l).val <= currLevel.get(l+1).val){
54                        return false;
55                    }
56                    l++;
57                }
58                if(currLevel.get(r).val % 2 != 0){
59                    return false;
60                }
61            }
62            level++;
63        }
64
65        return true;
66    }
67}
68