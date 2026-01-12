// Last updated: 1/12/2026, 10:22:15 PM
1class Solution {
2    public String countOfAtoms(String formula) {
3        Stack<HashMap<String,Integer>> stack = new Stack<>();
4        stack.push(new HashMap<String,Integer>());
5        int i = 0;
6        int n = formula.length();
7
8        while(i < n){
9            char ch = formula.charAt(i);
10
11            if(ch == '('){
12                stack.push(new HashMap<String,Integer>());
13                i++;
14            }
15            else if(ch == ')'){
16                HashMap<String,Integer> curr = stack.pop();
17                i++;
18
19                StringBuilder mult = new StringBuilder();
20                while(i < n && Character.isDigit(formula.charAt(i))){
21                    mult.append(formula.charAt(i));
22                    i++;
23                }
24
25                int m = 1;
26                if(mult.length() > 0){
27                    m = Integer.parseInt(mult.toString());
28                }
29
30                for(String atom : curr.keySet()){
31                    curr.put(atom, curr.get(atom) * m);
32                }
33
34                for(String atom : curr.keySet()){
35                    stack.peek().put(atom,
36                        stack.peek().getOrDefault(atom, 0) + curr.get(atom));
37                }
38            }
39            else{
40                StringBuilder atom = new StringBuilder();
41                atom.append(ch);
42                i++;
43
44                while(i < n && Character.isLowerCase(formula.charAt(i))){
45                    atom.append(formula.charAt(i));
46                    i++;
47                }
48
49                StringBuilder count = new StringBuilder();
50                while(i < n && Character.isDigit(formula.charAt(i))){
51                    count.append(formula.charAt(i));
52                    i++;
53                }
54
55                int c = 1;
56                if(count.length() > 0){
57                    c = Integer.parseInt(count.toString());
58                }
59
60                stack.peek().put(atom.toString(),
61                    stack.peek().getOrDefault(atom.toString(), 0) + c);
62            }
63        }
64
65        TreeMap<String,Integer> sortedMap = new TreeMap<>(stack.peek());
66        StringBuilder res = new StringBuilder();
67
68        for(String atom : sortedMap.keySet()){
69            res.append(atom);
70            int count = sortedMap.get(atom);
71            if(count > 1){
72                res.append(count);
73            }
74        }
75        return res.toString();
76    }
77}
78