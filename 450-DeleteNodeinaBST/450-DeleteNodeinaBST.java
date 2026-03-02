// Last updated: 3/2/2026, 4:39:43 PM
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
17    public TreeNode deleteNode(TreeNode root, int key) {
18        if(root == null){
19            return null;
20        }
21
22        if(root.val > key){
23            root.left = deleteNode(root.left, key);
24        }
25        else if(root.val < key){
26            root.right = deleteNode(root.right, key);
27        }
28        else{
29            if(root.left == null && root.right == null){
30                return null;
31            }
32
33            if(root.left == null){
34                return root.right;
35            }
36
37            if(root.right == null){
38                return root.left;
39            }
40            
41            TreeNode temp = root.right;
42            while(temp.left != null){
43                temp = temp.left;
44            }
45
46            root.val = temp.val;
47            root.right = deleteNode(root.right, temp.val);
48        }
49
50        return root;
51    }
52}