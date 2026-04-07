// Last updated: 4/7/2026, 3:43:00 PM
1import java.util.*;
2
3class Solution {
4    public List<String> simplifiedFractions(int n) {
5        List<String> res = new ArrayList<>();
6        for(int i = 1; i <= n; i++){
7            for(int j = i + 1; j <= n; j++){
8                if(gcd(i, j) == 1){
9                    res.add(i + "/" + j);
10                }
11            }
12        }
13        
14        return res;
15    }
16    
17    public int gcd(int a, int b){
18        while(b != 0){
19            int temp = b;
20            b = a % b;
21            a = temp;
22        }
23        return a;
24    }
25}