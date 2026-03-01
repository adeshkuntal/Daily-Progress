// Last updated: 3/1/2026, 2:03:46 PM
1class Solution {
2    int preIndex = 0;
3    Map<Integer, Integer> map = new HashMap<>();
4    
5    public TreeNode buildTree(int[] preorder, int[] inorder) {
6        for(int i = 0; i < inorder.length; i++) {
7            map.put(inorder[i], i);
8        }
9        return build(preorder, 0, inorder.length - 1);
10    }
11    
12    public TreeNode build(int[] preorder, int left, int right) {
13        if(left > right) return null;
14        
15        int val = preorder[preIndex++];
16        TreeNode root = new TreeNode(val);
17        
18        int index = map.get(val);
19        
20        root.left = build(preorder, left, index - 1);
21        root.right = build(preorder, index + 1, right);
22        
23        return root;
24    }
25}