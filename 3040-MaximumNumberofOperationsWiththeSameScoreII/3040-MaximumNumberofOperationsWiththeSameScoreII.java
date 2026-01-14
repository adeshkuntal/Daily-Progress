// Last updated: 1/14/2026, 2:39:24 PM
1class Solution {
2    public String countOfAtoms(String formula) {
3        return Fn(formula);
4    }
5
6    public static String Fn(String formula) {
7        List<String> list = new ArrayList<>();
8        HashMap<String, Integer> map = new HashMap<>();
9
10
11        int global_num = 1;
12
13        int index = 0;
14        while(index < formula.length()) {
15            if(formula.charAt(index) == '(') {
16                // index++;
17                
18                int open_index = index + 1;
19                int count = 1;
20                while(open_index < formula.length() && count != 0) {
21                    if(formula.charAt(open_index) == '(') {
22                        count += 1;
23                    }
24                    else if(formula.charAt(open_index) == ')') {
25                        count -= 1;
26
27                    }
28
29                    open_index++;
30                }
31
32                int open_num = 0;
33                while(
34                    open_index < formula.length()     && 
35                    formula.charAt(open_index) >= '0' && 
36                    formula.charAt(open_index) <= '9') {
37
38                    open_num = (open_num * 10) + formula.charAt(open_index) - '0';
39
40                    open_index++;
41                }
42                if(open_num == 0) open_num = 1;
43                global_num *= open_num;
44
45                // System.out.println(global_num);
46
47            }
48
49            if(formula.charAt(index) == ')') {
50                int close_index = index + 1;
51
52                int close_num = 0;
53                while(
54                    close_index < formula.length() &&
55                    formula.charAt(close_index) >= '0' &&
56                    formula.charAt(close_index) <= '9'
57                ) {
58                    close_num = (close_num * 10) + formula.charAt(close_index) - '0';
59
60                    close_index++;
61                }
62
63                if(close_num == 0) close_num = 1;
64                global_num /= close_num;
65            }
66
67            if(formula.charAt(index) >= 'A' && formula.charAt(index) <= 'Z') {
68                String element = "" + formula.charAt(index);
69                index++;
70
71                while(index < formula.length() && formula.charAt(index) >= 'a' && formula.charAt(index) <= 'z') {
72                    element += formula.charAt(index);
73
74                    index++;
75                }
76
77                int num = 0;
78                while(index < formula.length() && formula.charAt(index) >= '0' && formula.charAt(index) <= '9') {
79                    num = (num * 10) + formula.charAt(index) - '0';
80
81                    index++;
82                }
83                if(num == 0) num = 1;
84
85                if(!map.containsKey(element)) {
86                    list.add(element);
87                } 
88
89                map.put(
90                    element, map.getOrDefault(element, 0) + (num * global_num)
91                );
92
93            }
94            else {
95                index++;
96            }
97        }
98
99        // System.out.println(list);
100        // System.out.println(map);
101
102        Collections.sort(list);
103
104        String result = "";
105
106        for(String str : list) {
107            result += str;
108
109            if(map.get(str) != 1) {
110                result += map.get(str);
111            }
112        }
113
114        return result;
115
116    }
117}