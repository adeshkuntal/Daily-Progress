// Last updated: 8/4/2025, 6:53:38 PM
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i=left; i<=right; i++){
            if(is_number(i)){
                count+=1;
            }
        }
        return count;
    }
    public static boolean is_number(int n){
        String s = "";
        while (n > 0){
            int a = n%2;
            n = n/2;
            s = a + s;
        }
        int one_c = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                one_c+=1;
            }
        }
        int ans=0;
        for(int i=1; i<=one_c; i++){
            if(one_c%i==0){
                ans+=1;
            }
        }
        if(ans==2){
            return true;
        }
        else {
            return false;
        }
    }
}