// Last updated: 3/25/2026, 10:01:47 PM
class Solution {
    public boolean completePrime(int num) {
        String s = String.valueOf(num);
        int n = s.length();
        for(int i=1; i<=n; i++){
            int x = Integer.parseInt(s.substring(0,i));
            if(!isPrime(x)){
                return false;
            }
        }
        for(int i=0; i<n; i++){
            int y = Integer.parseInt(s.substring(i,n));
            if(!isPrime(y)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int x){
        if(x == 2){
            return true;
        }
        if(x < 2){
            return false;
        }
        if(x % 2 == 0){
            return false;
        }
        int r = (int)Math.sqrt(x);
        for(int i=3; i<=r; i+=2){
            if(x % i == 0){
                return false;
            }
        }

        return true;
    }
}