// Last updated: 9/4/2025, 7:15:48 PM
class Solution {
    public int getLeastFrequentDigit(int n) {
        String s = Integer.toString(n);
        int min = Integer.MAX_VALUE;
        int digit = -1;
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            int count = 0;
            for(int k=0; k<s.length(); k++){
                if(s.charAt(k)==a){
                    count++;
                }
            }
            if(count < min || (count == min && a-'0' < digit)){
                min = count;
                digit = a - '0';
            }
        }
        return digit;
    }
}
