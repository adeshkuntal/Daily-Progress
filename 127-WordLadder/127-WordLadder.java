// Last updated: 1/3/2026, 11:37:29 AM
1class Solution {
2    public int ladderLength(String begin, String end, List<String> word) {
3        if(!word.contains(end)){
4            return 0;
5        }
6
7        Queue<String> pq = new LinkedList<>();
8        pq.add(begin);
9
10        boolean[] vis = new boolean[word.size()];
11        int count = 1;
12
13        while(!pq.isEmpty()){
14            int size = pq.size();
15            for(int i = 0; i < size; i++){
16                String curr = pq.poll();
17                if(curr.equals(end)){
18                    return count;
19                }
20
21                for(int j = 0; j < word.size(); j++){
22                    if(!vis[j] && checkWord(curr, word.get(j))){
23                        vis[j] = true;
24                        pq.add(word.get(j));
25                    }
26                }
27            }
28            count++;
29        }
30        return 0;
31    }
32
33    public boolean checkWord(String a, String b){
34        int diff = 0;
35        for(int i = 0; i < a.length(); i++){
36            if(a.charAt(i) != b.charAt(i)){
37                diff++;
38            }
39            if(diff > 1){
40                return false;
41            }
42        }
43        return diff == 1;
44    }
45}
46