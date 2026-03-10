// Last updated: 3/10/2026, 3:15:25 PM
1import java.util.*;
2
3class Solution {
4    private int timer;
5    private int[] disc; // Discovery time of a node
6    private int[] low;  // Lowest discovery time reachable from a node (including itself and its subtree)
7    private boolean[] visited;
8    private List<List<Integer>> adj; // Adjacency list for the graph
9    private List<List<Integer>> bridges; // List to store the critical connections (bridges)
10
11    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
12        // Initialize class members for each call to criticalConnections
13        timer = 0;
14        disc = new int[n];
15        low = new int[n];
16        visited = new boolean[n];
17        adj = new ArrayList<>();
18        bridges = new ArrayList<>();
19
20        // Initialize adjacency list for N nodes
21        for (int i = 0; i < n; i++) {
22            adj.add(new ArrayList<>());
23        }
24
25        // Build the graph (undirected) from the input connections
26        for (List<Integer> connection : connections) {
27            int u = connection.get(0);
28            int v = connection.get(1);
29            adj.get(u).add(v);
30            adj.get(v).add(u); // Add edge in both directions for an undirected graph
31        }
32
33        // Perform DFS from each unvisited node
34        // This ensures all connected components are traversed if the graph is disconnected
35        for (int i = 0; i < n; i++) {
36            if (!visited[i]) {
37                dfs(i, -1); // -1 indicates no parent for the root node of the DFS tree
38            }
39        }
40
41        return bridges; // Corrected: return the populated bridges list
42    }
43
44    /**
45     * Depth-First Search (DFS) function to find bridges using Tarjan's algorithm.
46     * @param u The current node being visited.
47     * @param parent The parent of the current node in the DFS tree.
48     */
49    private void dfs(int u, int parent) {
50        visited[u] = true;
51        disc[u] = low[u] = timer++; // Set discovery time and low-link value for node u
52
53        // Traverse all neighbors of u
54        for (int v : adj.get(u)) {
55            if (v == parent) { // Skip if neighbor v is the direct parent of u (avoid going back immediately)
56                continue;
57            }
58
59            if (visited[v]) { // If v is already visited, it's a back-edge to an ancestor
60                low[u] = Math.min(low[u], disc[v]); // Update low-link value of u with discovery time of v
61            } else { // If v is not visited, it's a forward-edge to an unvisited child
62                dfs(v, u); // Recursively call DFS for child v, with u as its parent
63                low[u] = Math.min(low[u], low[v]); // Update low-link value of u based on child v's low-link value
64
65                // Bridge condition: if the lowest discovery time reachable from v
66                // is greater than the discovery time of u, then the edge (u, v) is a bridge.
67                // This means v and its subtree cannot reach u or an ancestor of u
68                // without passing through the edge (u,v).
69                if (low[v] > disc[u]) {
70                    bridges.add(Arrays.asList(u, v));
71                }
72            }
73        }
74    }
75}