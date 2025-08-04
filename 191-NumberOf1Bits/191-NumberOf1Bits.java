// Last updated: 8/4/2025, 6:56:59 PM
class Solution {
    public int hammingWeight(int n) {
        String s = "";
        int count =0;
        while(n>0){
            int a = n%2;
            n = n/2;
            s=a+s;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count+=1;
            }
        }
        return count;
    }
}