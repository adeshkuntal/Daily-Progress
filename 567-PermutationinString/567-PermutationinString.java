// Last updated: 3/16/2026, 7:51:27 PM
1import java.util.*;
2
3class Solution {
4    public boolean checkInclusion(String s1, String s2) {
5        HashMap<Character,Integer> map = new HashMap<>();
6
7        for(int i=0; i<s1.length(); i++){
8            char ch = s1.charAt(i);
9            map.put(ch,map.getOrDefault(ch,0)+1);
10        }
11
12        for(int i=0; i<=s2.length()-s1.length(); i++){
13            if(check(map,s2.substring(i,i+s1.length()))){
14                return true;
15            }
16        }
17
18        return false;
19    }
20
21    public boolean check(HashMap<Character,Integer> map,String s){
22        HashMap<Character,Integer> temp = new HashMap<>(map);
23
24        for(int i=0; i<s.length(); i++){
25            char ch = s.charAt(i);
26
27            if(temp.containsKey(ch)){
28                temp.put(ch,temp.get(ch)-1);
29                if(temp.get(ch)==0){
30                    temp.remove(ch);
31                }
32            }else{
33                return false;
34            }
35        }
36
37        return temp.isEmpty();
38    }
39}