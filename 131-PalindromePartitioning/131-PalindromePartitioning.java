// Last updated: 3/17/2026, 8:52:11 PM
1class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> res = new ArrayList<>();
4        fn(res,new ArrayList<>(),s,0);
5        return res;
6    }
7    public void fn(List<List<String>> res,ArrayList<String> temp,String s,int idx){
8        if(idx == s.length()){
9            res.add(new ArrayList<>(temp));
10            return;
11        }
12        for(int i=idx; i<s.length(); i++){
13            if(isPalindrome(s.substring(idx,i+1))){
14                temp.add(s.substring(idx,i+1));
15                fn(res,temp,s,i+1);
16                temp.remove(temp.size()-1);
17            }
18        }
19    }
20    public boolean isPalindrome(String str){
21        int l = 0;
22        int r = str.length()-1;
23        while(l < r){
24            if(str.charAt(l) != str.charAt(r)){
25                return false;
26            }
27            l++;
28            r--;
29        }
30        return true;
31    }
32}