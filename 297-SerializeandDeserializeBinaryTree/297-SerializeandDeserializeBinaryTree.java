// Last updated: 3/1/2026, 2:31:08 PM
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
12    public String serialize(TreeNode root) {
13        if(root == null) return "";
14        
15        StringBuilder sb = new StringBuilder();
16        Queue<TreeNode> q = new LinkedList<>();
17        q.add(root);
18        
19        while(!q.isEmpty()) {
20            TreeNode curr = q.poll();
21            
22            if(curr == null) {
23                sb.append("null,");
24            } else {
25                sb.append(curr.val).append(",");
26                q.add(curr.left);
27                q.add(curr.right);
28            }
29        }
30        
31        return sb.toString();
32    }
33
34    public TreeNode deserialize(String data) {
35        if(data.length() == 0) return null;
36        
37        String[] arr = data.split(",");
38        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
39        
40        Queue<TreeNode> q = new LinkedList<>();
41        q.add(root);
42        
43        int i = 1;
44        
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
60        
61        return root;
62    }
63}