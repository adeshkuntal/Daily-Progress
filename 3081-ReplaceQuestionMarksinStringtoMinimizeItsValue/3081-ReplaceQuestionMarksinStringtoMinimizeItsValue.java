// Last updated: 12/28/2025, 1:56:25 PM
1class Solution {
2    public String minimizeStringValue(String s) {
3        int count = 0;  // count -> ? 
4        int[] freq = new int[26];
5        for(char ch : s.toCharArray()) {
6            if(ch == '?') count++;
7            else freq[ch-'a']++;
8        }
9
10        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.freq == b.freq ? (a.ch-'0') - (b.ch-'0'): a.freq - b.freq);
11        for(int i = 0; i < freq.length; i++) {
12            char ch = (char)('a' + i);
13            pq.offer(new Pair(ch, freq[i]));
14        }
15
16        List<Character> ls = new ArrayList<>();
17        int ind = 0;
18        for(int i = 0; i < count; i++) {
19            Pair p = pq.poll();
20            ls.add(p.ch);
21
22            pq.offer(new Pair(p.ch, p.freq + 1));
23        }
24
25        Collections.sort(ls);
26        
27        StringBuilder ans = new StringBuilder();
28        for(char ch : s.toCharArray()) {
29            if(ch == '?') ans.append(ls.get(ind++));
30            else ans.append(ch);
31        }
32
33        return ans.toString();
34    }
35}
36
37class Pair {
38    char ch;
39    int freq;
40
41    public Pair(char ch, int freq) {
42        this.ch = ch;
43        this.freq = freq;
44    }
45}