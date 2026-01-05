// Last updated: 1/5/2026, 9:17:58 PM
1class Solution {
2    public List<String> letterCombinations(String digit) {
3        if (digit == null || digit.length() == 0) {
4            return new ArrayList<>();
5        }
6        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
7        List<String> res = new ArrayList<>();
8        find_comb(res,new StringBuilder(),map,digit,0);
9        return res;
10    }
11    public void find_comb(List<String> res,StringBuilder ans,String[] map,String digit,int idx){
12        if(idx == digit.length()){
13            res.add(ans.toString());
14            return;
15        }
16        String possibleLetters = map[digit.charAt(idx) - '0'];
17        for (char letter : possibleLetters.toCharArray()) {
18            ans.append(letter);
19            find_comb(res,ans,map,digit,idx+1);
20            ans.deleteCharAt(ans.length() - 1);
21        }
22    }
23}