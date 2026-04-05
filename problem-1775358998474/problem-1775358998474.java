// Last updated: 4/5/2026, 8:46:38 AM
1class Solution {
2    public List<Integer> findGoodIntegers(int n) {
3        Map<Integer,Integer> map = new HashMap<>();
4        int l = (int) Math.cbrt(n);
5        for(int a=1; a<=l; a++){
6            for(int b=a; b<=l; b++){
7                int sum = a*a*a + b*b*b;
8                if(sum > n){
9                    break;
10                }
11                map.put(sum,map.getOrDefault(sum,0)+1);
12            }
13        }
14
15        List<Integer> r = new ArrayList<>();
16        for(int k : map.keySet()){
17            if(map.get(k) >= 2){
18                r.add(k);
19            }
20        }
21
22        Collections.sort(r);
23
24        return r;
25    }
26}