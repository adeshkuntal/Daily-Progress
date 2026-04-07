// Last updated: 4/7/2026, 11:46:01 AM
1class Robot {
2    int width, height;
3    int x, y;
4    int dir;
5    
6    public Robot(int width, int height) {
7        this.width = width;
8        this.height = height;
9        x = 0;
10        y = 0;
11        dir = 0;
12    }
13    
14    public void step(int num) {
15        int p = 2 * (width + height) - 4;
16        num = num % p;
17        
18        if (num == 0 && x == 0 && y == 0) {
19            dir = 3;
20            return;
21        }
22        
23        while (num > 0) {
24            if (dir == 0) {
25                int move = Math.min(num, width - 1 - x);
26                x += move;
27                num -= move;
28                if (x == width - 1 && num > 0) dir = 1;
29            } 
30            else if (dir == 1) {
31                int move = Math.min(num, height - 1 - y);
32                y += move;
33                num -= move;
34                if (y == height - 1 && num > 0) dir = 2;
35            } 
36            else if (dir == 2) {
37                int move = Math.min(num, x);
38                x -= move;
39                num -= move;
40                if (x == 0 && num > 0) dir = 3;
41            } 
42            else {
43                int move = Math.min(num, y);
44                y -= move;
45                num -= move;
46                if (y == 0 && num > 0) dir = 0;
47            }
48        }
49    }
50    
51    public int[] getPos() {
52        return new int[]{x, y};
53    }
54    
55    public String getDir() {
56        if (dir == 0) return "East";
57        if (dir == 1) return "North";
58        if (dir == 2) return "West";
59        return "South";
60    }
61}