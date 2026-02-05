// Last updated: 2/5/2026, 12:08:07 PM
1class Solution {
2    public String replaceWords(List<String> dictionary, String sentence) {
3        String s = "";
4        String[] words = sentence.split(" ");
5        for (int i = 0; i < words.length; i++) {
6            String replacement = words[i];
7            for (int j = 0; j < dictionary.size(); j++) {
8                String root = dictionary.get(j);
9                if (words[i].startsWith(root)) {
10                    if (root.length() < replacement.length()) {
11                        replacement = root;
12                    }
13                }
14            }
15            s += replacement;
16            if (i != words.length - 1) {
17                s += " ";
18            }
19        }
20        return s;
21    }
22}
23