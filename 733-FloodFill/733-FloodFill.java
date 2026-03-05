// Last updated: 3/5/2026, 12:22:13 PM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int m = image.length;
4        int n = image[0].length;
5
6        int orig = image[sr][sc];
7        if(orig == color) return image;
8        image[sr][sc] = color;
9
10        Queue<int[]> q = new LinkedList<>();
11        q.add(new int[]{sr,sc});
12        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
13
14        while(!q.isEmpty()){
15            int size = q.size();
16            for(int i=0; i<size; i++){
17                int[] curr = q.poll();
18                for(int[] d:dir){
19                    int x = curr[0]+d[0];
20                    int y = curr[1]+d[1];
21
22                    if(x>=0 && x<m && y>=0 && y<n && image[x][y] == orig){
23                        image[x][y] = color;
24                        q.add(new int[]{x,y});
25                    }
26                }
27            }
28            
29        }
30        return image;
31
32    }
33}