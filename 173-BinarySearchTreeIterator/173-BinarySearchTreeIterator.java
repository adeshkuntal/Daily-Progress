// Last updated: 3/3/2026, 3:29:48 PM
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
16class BSTIterator {
17
18    Stack<TreeNode> stack = new Stack<>();
19
20    public BSTIterator(TreeNode root) {
21        pushLeft(root);
22    }
23    
24    public int next() {
25        TreeNode node = stack.pop();
26        if(node.right != null){
27            pushLeft(node.right);
28        }
29        return node.val;
30    }
31    
32    public boolean hasNext() {
33        return !stack.isEmpty();
34    }
35
36    private void pushLeft(TreeNode node){
37        while(node != null){
38            stack.push(node);
39            node = node.left;
40        }
41    }
42}
43
44/**
45 * Your BSTIterator object will be instantiated and called as such:
46 * BSTIterator obj = new BSTIterator(root);
47 * int param_1 = obj.next();
48 * boolean param_2 = obj.hasNext();
49 */