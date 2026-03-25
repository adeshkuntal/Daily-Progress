// Last updated: 3/25/2026, 10:01:33 PM
class Solution {
    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
        int[][] com = edges;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0; i<com.length; i++){
            int u = com[i][0];
            int v = com[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int[] dx = bfs(n,graph,x);
        int[] dy = bfs(n,graph,y);
        int[] dz = bfs(n,graph,z);

        int ans = 0;

        for(int i=0; i<n; i++){
            int a = dx[i];
            int b = dy[i];
            int c = dz[i];

            if(a > b){
                int t = a;
                a = b;
                b = t;
            }
            if(b > c){
                int t = b;
                b = c;
                c = t;
            }

            if(a*a + b*b == c*c){
                ans++;
            }
        }

        return ans;
    }

    private int[] bfs(int n, ArrayList<ArrayList<Integer>> graph, int start){
        int[] dist = new int[n];
        Arrays.fill(dist,-1);

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        dist[start] = 0;

        while(!q.isEmpty()){
            int u = q.poll();
            for(int v : graph.get(u)){
                if(dist[v] == -1){
                    dist[v] = dist[u]+1;
                    q.add(v);
                }
            }
        }

        return dist;
    }
}