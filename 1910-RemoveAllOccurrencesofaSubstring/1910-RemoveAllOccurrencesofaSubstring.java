// Last updated: 3/15/2026, 6:44:37 PM
1class Solution {
2    public String removeOccurrences(String s, String part) {
3        StringBuilder str = new StringBuilder(s);
4        int idx = str.indexOf(part);
5        while(idx != -1){
6            str.delete(idx,idx+part.length());
7            idx = str.indexOf(part);
8        }
9
10        return str.toString();
11    }
12}