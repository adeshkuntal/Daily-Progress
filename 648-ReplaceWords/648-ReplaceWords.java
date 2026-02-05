// Last updated: 2/5/2026, 12:09:16 PM
1class Solution {
2    public String replaceWords(List<String> dictionary, String sentence) {
3        String s = "";
4        String[] words = sentence.split(" ");
5
6        for (int i = 0; i < words.length; i++) {
7            String replacement = words[i];
8            for (int j = 0; j < dictionary.size(); j++) {
9                String root = dictionary.get(j);
10                if (words[i].startsWith(root)) {
11                    if (root.length() < replacement.length()) {
12                        replacement = root;
13                    }
14                }
15            }
16            s += replacement;
17            if (i != words.length - 1) {
18                s += " ";
19            }
20        }
21        return s;
22    }
23}