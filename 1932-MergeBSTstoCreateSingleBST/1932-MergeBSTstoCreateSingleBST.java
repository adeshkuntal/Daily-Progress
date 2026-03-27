// Last updated: 3/27/2026, 8:10:24 PM
1class Solution {
2    public TreeNode canMerge(List<TreeNode> trees) {
3        Map<Integer, TreeNode> map = new HashMap<>();
4        Set<Integer> child = new HashSet<>();
5
6        for (TreeNode t : trees) {
7            map.put(t.val, t);
8            if (t.left != null) child.add(t.left.val);
9            if (t.right != null) child.add(t.right.val);
10        }
11
12        TreeNode root = null;
13
14        for (TreeNode t : trees) {
15            if (!child.contains(t.val)) {
16                root = t;
17                break;
18            }
19        }
20
21        if (root == null) return null;
22
23        map.remove(root.val);
24
25        if (!dfs(root, Integer.MIN_VALUE, Integer.MAX_VALUE, map)) return null;
26
27        if (!map.isEmpty()) return null;
28
29        return root;
30    }
31
32    private boolean dfs(TreeNode node, int min, int max, Map<Integer, TreeNode> map) {
33        if (node == null) return true;
34
35        if (node.val <= min || node.val >= max) return false;
36
37        if (node.left == null && node.right == null && map.containsKey(node.val)) {
38            TreeNode temp = map.get(node.val);
39            node.left = temp.left;
40            node.right = temp.right;
41            map.remove(node.val);
42        }
43
44        return dfs(node.left, min, node.val, map) &&
45               dfs(node.right, node.val, max, map);
46    }
47}