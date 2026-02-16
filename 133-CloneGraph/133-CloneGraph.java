// Last updated: 2/16/2026, 9:48:51 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    public Node cloneGraph(Node node) {
23        if (node == null) return null;
24        if (node.neighbors.isEmpty()) return new Node(node.val);
25
26        HashMap<Node, Node> cp = new HashMap<>();
27        Queue<Node> qu = new LinkedList<>();
28
29        cp.put(node, new Node(node.val));
30        qu.offer(node);
31
32        while(!qu.isEmpty()) {
33            Node curr = qu.poll();
34            for(Node nei: curr.neighbors) {
35                if(!cp.containsKey(nei)) {
36                    cp.put(nei, new Node(nei.val));
37                    qu.add(nei);
38                }
39                cp.get(curr).neighbors.add(cp.get(nei));
40            }
41        }
42        return cp.get(node);
43    }
44}