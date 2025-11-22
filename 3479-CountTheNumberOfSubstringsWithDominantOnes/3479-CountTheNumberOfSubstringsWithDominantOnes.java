// Last updated: 11/22/2025, 1:17:22 PM
// class Solution {
//     public int numberOfSubstrings(String s) {
//         int n = s.length();
//         int count = 0;

//         for(int i = 0; i < n; i++){
//             int one = 0;
//             int zero = 0;
//             for(int j = i; j < n; j++){
//                 if(s.charAt(j) == '1'){
//                     one++;
//                 }
//                 else{
//                     zero++;
//                 }
//                 if(one >= zero * zero){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }




class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] countones = new int[n];
        int result = 0;
        countones[0] = (s.charAt(0) == '1') ? 1 : 0;
        for(int i = 1; i < n; i++){
            countones[i] = countones[i-1] + ((s.charAt(i) == '1') ? 1 : 0);
        }

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int ones = countones[j] - ((i > 0) ? countones[i-1] : 0);
                int zeroes = (j-i+1) - ones;
                if(zeroes*zeroes > ones){
                   
                    j += zeroes * zeroes - ones -1;
                }else if(zeroes*zeroes == ones){
                    result += 1;
                }else{
                    result++;
                    int k = (int)Math.sqrt(ones) - zeroes;
                    if(j+k >= n){
                        result += n-j-1;
                        break;
                    }else{
                        result += k;
                    }
                    j += k;
                }
            }
        }
        return result;
    }
}
