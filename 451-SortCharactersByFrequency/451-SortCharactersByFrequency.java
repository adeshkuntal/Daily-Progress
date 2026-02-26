// Last updated: 2/26/2026, 4:20:39 PM
1import java.util.*;
2
3class Solution {
4    public String frequencySort(String s) {
5        int max = 0;
6        HashMap<Character, Integer> map = new HashMap<>();
7        for(int i=0; i<s.length(); i++){
8            char ch = s.charAt(i);
9            map.put(ch,map.getOrDefault(ch,0)+1);
10            if(map.get(ch) > max){
11                max = map.get(ch);
12            }
13        }
14
15        List<List<Character>> l = new ArrayList<>();
16        for (int i = 0; i <= max; i++){
17            l.add(new ArrayList<>());
18        }
19
20        for (char ch : map.keySet()){
21            int f = map.get(ch);
22            l.get(f).add(ch);
23        }
24
25        StringBuilder ans = new StringBuilder();
26
27        for(int i=max; i>=1; i--){
28            for(char ch : l.get(i)){
29                for(int j=0; j<i; j++){
30                    ans.append(ch);
31                }
32            }
33        }
34
35        return ans.toString();
36    }
37}