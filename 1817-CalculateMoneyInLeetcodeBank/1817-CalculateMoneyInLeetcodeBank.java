// Last updated: 8/4/2025, 6:50:12 PM
class Solution {
    public int totalMoney(int n) {
        int a = 1;
        int result = 0;
        if(n <= 7){
            while(n > 0){
                result += a;
                a++;
                n--;
            }
        } else {
            int x = n / 7;
            int remain = n % 7;
            int z = 0;
            int y = 1;
            while(x > 0){
                z = 0;
                a = y;
                while(z < 7){
                    result += a;
                    a++;
                    z++;
                }
                y++;
                x--;
            }
            a = y; 
            while(remain > 0){
                result += a;
                a++;
                remain--;
            }
        }

        return result;
    }
}