// Last updated: 8/4/2025, 6:54:57 PM
class Solution {
    public String convertToBase7(int n) {
        if(n==0){
            return "0";
        }
        int num = Math.abs(n);
        String s = "";
        while(num>0){
            int a = num%7;
            num = num/7;
            s=a+s;
        }
        if(n<0){
            s="-"+s;
        }
        return s;
    }
}