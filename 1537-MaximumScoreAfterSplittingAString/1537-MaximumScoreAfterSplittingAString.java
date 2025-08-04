// Last updated: 8/4/2025, 6:51:13 PM
class Solution {
    public int maxScore(String s) {
        int score = 0;

        for (int i = 1; i < s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);
            int zero = 0;
            int one = 0;

            for(int j=0; j<left.length(); j++){
                if(left.charAt(j)=='0'){
                    zero+=1;
                }
            }
            for(int j=0; j<right.length(); j++){
                if(right.charAt(j)=='1'){
                    one+=1;
                }
            }
            int a = zero + one;
            if(a>score){
                score = a;
            }
        }

        return score;
    }
}