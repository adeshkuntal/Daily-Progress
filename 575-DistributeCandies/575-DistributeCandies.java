// Last updated: 8/4/2025, 6:54:32 PM
class Solution {
    public int distributeCandies(int[] c) {
        Arrays.sort(c);
        int n = c.length/2;
       int count = 1;
       int a = c[0];
       for(int i=1; i<c.length; i++){
           if(c[i]!=a){
               count+=1;
               a=c[i];
           }
       }
       if(n>=count){
           return count;
       }
       else {
           return n;
       }
    }
}