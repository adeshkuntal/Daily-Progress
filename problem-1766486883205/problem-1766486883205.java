// Last updated: 12/23/2025, 4:18:03 PM
1class Solution {
2    public String generateTag(String caption) {
3        if (caption.trim().isEmpty()){
4            return "#";
5        }
6
7        String[] arr = caption.trim().split("\\s+");
8        String res = "#";
9
10        String first_word = arr[0];
11        first_word = first_word.substring(0, 1).toLowerCase() +
12                     (first_word.length() > 1 ? first_word.substring(1).toLowerCase() : "");
13        res += first_word;
14
15        for (int i = 1; i < arr.length; i++) {
16            String w = arr[i];
17            if (w.isEmpty()) continue;
18            w = w.substring(0, 1).toUpperCase() +
19                (w.length() > 1 ? w.substring(1).toLowerCase() : "");
20            res += w;
21            if (res.length() >= 100) break;
22        }
23
24        return res.length() > 100 ? res.substring(0, 100) : res;
25    }
26}