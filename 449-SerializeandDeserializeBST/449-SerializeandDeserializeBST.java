// Last updated: 3/28/2026, 9:27:22 PM
1public class Codec {
2
3    public String serialize(TreeNode root) {
4        if(root == null) return "";
5
6        Queue<TreeNode> q = new LinkedList<>();
7        q.add(root);
8
9        StringBuilder sb = new StringBuilder();
10
11        while(!q.isEmpty()){
12            TreeNode node = q.poll();
13
14            if(node == null){
15                sb.append("null,");
16                continue;
17            }
18
19            sb.append(node.val).append(",");
20            q.add(node.left);
21            q.add(node.right);
22        }
23
24        return sb.toString();
25    }
26
27    public TreeNode deserialize(String data) {
28        if(data.length() == 0) return null;
29
30        String[] arr = data.split(",");
31        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
32
33        Queue<TreeNode> q = new LinkedList<>();
34        q.add(root);
35
36        int i = 1;
37
38        while(!q.isEmpty()){
39            TreeNode node = q.poll();
40
41            if(!arr[i].equals("null")){
42                node.left = new TreeNode(Integer.parseInt(arr[i]));
43                q.add(node.left);
44            }
45            i++;
46
47            if(!arr[i].equals("null")){
48                node.right = new TreeNode(Integer.parseInt(arr[i]));
49                q.add(node.right);
50            }
51            i++;
52        }
53
54        return root;
55    }
56}