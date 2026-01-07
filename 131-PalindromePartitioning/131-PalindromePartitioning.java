// Last updated: 1/7/2026, 4:31:12 PM
1class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> res = new ArrayList<>();
4        List<String> l = new ArrayList<>();
5        find_partition(res,l,s);
6        return res;
7    }
8    public void find_partition(List<List<String>> res,List<String> ans,String ques){
9        if(ques.length() == 0){
10            res.add(new ArrayList<>(ans));
11            return;
12        }
13        for(int i=1; i<=ques.length(); i++){
14            String s = ques.substring(0,i);
15            if(isPalindrome(s)){
16                ans.add(s);
17                find_partition(res,ans,ques.substring(i));
18                ans.remove(ans.size() - 1);
19            }
20        }
21    }
22    public boolean isPalindrome(String s){
23        int i = 0;
24        int j = s.length() - 1;
25        while(i < j){
26            if(s.charAt(i) != s.charAt(j)){
27                return false;
28            }
29            i++;
30            j--;
31        }
32        return true;
33    }
34}