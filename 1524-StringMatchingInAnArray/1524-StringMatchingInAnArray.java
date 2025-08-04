// Last updated: 8/4/2025, 6:51:16 PM
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> st = new ArrayList<>();

        for(int i=0; i< words.length; i++){
            String a = words[i];
            for(int k=0; k< words.length; k++){
                if(words[k].contains(a) && !words[k].equals(a)){
                    if(!st.contains(a)) {
                        st.add(a);
                    }
                    
                }
            }
        }

        return st;
    }
}