// Last updated: 3/6/2026, 3:26:07 PM
1class Solution {
2    public int ladderLength(String begin, String end, List<String> word) {
3        if(!word.contains(end)){
4            return 0;
5        }
6        Queue<String> q = new LinkedList<>();
7        q.add(begin);
8
9        boolean[] vis = new boolean[word.size()];
10        int count = 1;
11
12        while(!q.isEmpty()){
13            int size = q.size();
14            for(int j=0; j<size; j++){
15                String curr = q.poll();
16
17                if(curr.equals(end)){   // FIX
18                    return count;
19                }
20
21                for(int i=0; i<word.size(); i++){
22                    if(!vis[i] && compare(curr,word.get(i))){
23                        vis[i] = true;
24                        q.add(word.get(i));
25                    }
26                }
27            }
28            count++;
29        }
30
31        return 0;
32    }
33
34    public boolean compare(String a,String b){
35        int diff = 0;
36        int i=0;
37
38        while(i<a.length()){
39            if(a.charAt(i) != b.charAt(i)){
40                diff++;
41            }
42            if(diff > 1){
43                return false;
44            }
45            i++;    
46        }
47        return diff == 1;
48    }
49}