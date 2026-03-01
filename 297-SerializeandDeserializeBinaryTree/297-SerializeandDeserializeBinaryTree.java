// Last updated: 3/1/2026, 8:55:40 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10public class Codec {
11
12    // Encodes a tree to a single string.
13    public String serialize(TreeNode root) {
14        if(root == null) return "";
15        
16        String s = "";
17        Queue<TreeNode> q = new LinkedList<>();
18        q.add(root);
19
20        while(!q.isEmpty()){
21            TreeNode curr = q.poll();
22            if(curr == null){
23                s += "null,";
24            }
25            else{
26                s += curr.val+",";
27                q.add(curr.left);
28                q.add(curr.right);
29            }
30        }
31        return s;
32    }
33
34    // Decodes your encoded data to tree.
35    public TreeNode deserialize(String data) {
36        if(data.length() == 0) return null;
37
38        String[] arr = data.split(",");
39        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
40        
41        Queue<TreeNode> q = new LinkedList<>();
42        q.add(root);
43        
44        int i = 1;
45        while(!q.isEmpty()) {
46            TreeNode curr = q.poll();
47            
48            if(!arr[i].equals("null")) {
49                curr.left = new TreeNode(Integer.parseInt(arr[i]));
50                q.add(curr.left);
51            }
52            i++;
53            
54            if(!arr[i].equals("null")) {
55                curr.right = new TreeNode(Integer.parseInt(arr[i]));
56                q.add(curr.right);
57            }
58            i++;
59        }
60        return root;
61    }
62}
63
64// Your Codec object will be instantiated and called as such:
65// Codec ser = new Codec();
66// Codec deser = new Codec();
67// TreeNode ans = deser.deserialize(ser.serialize(root));