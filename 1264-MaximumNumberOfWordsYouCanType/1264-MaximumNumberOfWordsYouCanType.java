// Last updated: 8/4/2025, 6:51:43 PM
class Solution {
    public int canBeTypedWords(String text, String bl) {
        String[] words = text.split(" ");
        boolean[] ans = new boolean[words.length];

        // Initialize all values to true
        Arrays.fill(ans, true);

        for (int j = 0; j < bl.length(); j++) {
            char a = bl.charAt(j);
            for (int i = 0; i < words.length; i++) {
                for (int k = 0; k < words[i].length(); k++) {
                    if (a == words[i].charAt(k)) {
                        ans[i] = false;
                    }
                }
            }
        }
        int a = 0;
        for(int i=0; i< ans.length; i++){
            if(ans[i]==true){
                a+=1;
            }
        }
        return a;
    }
}