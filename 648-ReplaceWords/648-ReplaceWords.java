// Last updated: 8/4/2025, 6:54:15 PM
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String s = "";
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String replacement = words[i];
            for (int j = 0; j < dictionary.size(); j++) {
                String root = dictionary.get(j);
                if (words[i].startsWith(root)) {
                    if (root.length() < replacement.length()) {
                        replacement = root;
                    }
                }
            }
            s += replacement;
            if (i != words.length - 1) {
                s += " ";
            }
        }
        return s;
    }
}
