// Last updated: 1/2/2026, 11:36:54 AM
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
21
22//DFS 
23
24// class Solution {
25//     public Node cloneGraph(Node node) {
26//         if (node == null) {
27//             return null;
28//         }
29        
30//         Map<Node, Node> visited = new HashMap<>();
31//         return cloneGraphHelper(node, visited);
32//     }
33    
34//     private Node cloneGraphHelper(Node node, Map<Node, Node> visited) {
35//         Node copy = new Node(node.val);
36//         visited.put(node, copy);
37//         for (Node neighbor : node.neighbors) {
38//             if (visited.containsKey(neighbor)) {
39//                 copy.neighbors.add(visited.get(neighbor));
40//             } else {
41//                 Node neighborCopy = cloneGraphHelper(neighbor, visited);
42//                 copy.neighbors.add(neighborCopy);
43//             }
44//         }
45//         return copy;
46//     }
47// }
48
49
50//BFS
51class Solution {
52    public Node cloneGraph(Node node) {
53        if (node == null) return null;
54        if (node.neighbors.isEmpty()) return new Node(node.val);
55
56        HashMap<Node, Node> cp = new HashMap<>();
57        Queue<Node> qu = new LinkedList<>();
58
59        cp.put(node, new Node(node.val));
60        qu.offer(node);
61
62        while(!qu.isEmpty()) {
63            Node curr = qu.poll();
64            for(Node nei: curr.neighbors) {
65                if(!cp.containsKey(nei)) {
66                    cp.put(nei, new Node(nei.val));
67                    qu.add(nei);
68                }
69                cp.get(curr).neighbors.add(cp.get(nei));
70            }
71        }
72        return cp.get(node);
73    }
74}