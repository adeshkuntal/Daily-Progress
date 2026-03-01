// Last updated: 3/1/2026, 1:36:11 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;y
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
12        List<Integer> res = new ArrayList<>();
13        HashMap<TreeNode, TreeNode> parent = new HashMap<>();
14        buildParent(root, null, parent);
15        
16        Queue<TreeNode> q = new LinkedList<>();
17        Set<TreeNode> vis = new HashSet<>();
18
19        q.add(target);
20        vis.add(target);
21        int dist = 0;
22
23        while(!q.isEmpty()) {
24            if(dist == k) break;
25            int size = q.size();
26            
27            for(int i = 0; i < size; i++) {
28                TreeNode curr = q.poll();
29                
30                if(curr.left != null && !vis.contains(curr.left)) {
31                    vis.add(curr.left);
32                    q.add(curr.left);
33                }
34                
35                if(curr.right != null && !vis.contains(curr.right)) {
36                    vis.add(curr.right);
37                    q.add(curr.right);
38                }
39                
40                if(parent.get(curr) != null && !vis.contains(parent.get(curr))) {
41                    vis.add(parent.get(curr));
42                    q.add(parent.get(curr));
43                }
44            }
45            dist++;
46        }
47
48        while(!q.isEmpty()){
49            res.add(q.poll().val);
50        }
51        return res;
52    }
53    public static void buildParent(TreeNode node, TreeNode par, Map<TreeNode, TreeNode> parent){
54        if(node == null){
55            return;
56        }
57        parent.put(node,par);
58        buildParent(node.left,node, parent);
59        buildParent(node.right,node, parent);
60
61    }
62}