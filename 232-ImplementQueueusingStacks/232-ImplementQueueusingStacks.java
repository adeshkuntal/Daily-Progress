// Last updated: 3/20/2026, 5:46:55 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4        for(int i=0; i<s.length(); i++){
5            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
6                st.push(s.charAt(i));
7            }
8            else{
9                if (st.isEmpty()) return false;
10                char ch = st.pop();
11                if((s.charAt(i) == ')' && ch != '(') || (s.charAt(i) == '}' && ch != '{') || (s.charAt(i) == ']' && ch != '[')){
12                    return false;
13                }
14            }
15        }
16
17        return st.isEmpty();
18    }
19}