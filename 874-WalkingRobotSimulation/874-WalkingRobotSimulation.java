// Last updated: 4/6/2026, 11:55:30 AM
1import java.util.HashSet;
2
3class Solution {
4    public int robotSim(int[] c, int[][] obstacles) {
5        int x = 0;
6        int y = 0;
7        int max = 0;
8        
9        boolean north = true;
10        boolean east = false;
11        boolean south = false;
12        boolean west = false;
13
14        HashSet<String> set = new HashSet<>();
15        for(int[] o : obstacles){
16            set.add(o[0] + "," + o[1]);
17        }
18        
19        for(int i=0; i<c.length; i++){
20            if(c[i] == -1){
21                if(north){
22                    north = false;
23                    east = true;
24                }
25                else if(east){
26                    east = false;
27                    south = true;
28                }
29                else if(south){
30                    south = false;
31                    west = true;
32                }
33                else if(west){
34                    west = false;
35                    north = true;
36                }
37            }
38            
39            else if(c[i] == -2){
40                if(north){
41                    north = false;
42                    west = true;
43                }
44                else if(west){
45                    west = false;
46                    south = true;
47                }
48                else if(south){
49                    south = false;
50                    east = true;
51                }
52                else if(east){
53                    east = false;
54                    north = true;
55                }
56            }
57
58            else if(c[i] > 0){
59                for(int step = 0; step < c[i]; step++){
60                    int nx = x;
61                    int ny = y;
62
63                    if(north) ny++;
64                    else if(south) ny--;
65                    else if(east) nx++;
66                    else if(west) nx--;
67
68                    if(set.contains(nx + "," + ny)){
69                        break;
70                    }
71
72                    x = nx;
73                    y = ny;
74
75                    max = Math.max(max, x*x + y*y);
76                }
77            }
78        }
79        
80        return max;
81    }
82}