// Last updated: 3/25/2026, 10:01:51 PM
// class Solution {
//     public int largestPrime(int n) {
//         if (n == 2) return 2;

//         int max = 0;
//         for (int i = 3; i <= n; i++) {
//             if (isPrime(i) && isSumofConsecutivePN(i)) {
//                 max = i;
//             }
//         }
//         return max;
//     }

//     public static boolean isPrime(int n) {
//         if (n <= 1) return false;
//         if (n == 2) return true;
//         if (n % 2 == 0) return false;
//         for (int i = 3; i * i <= n; i += 2) {
//             if (n % i == 0) return false;
//         }
//         return true;
//     }

//     public static boolean isSumofConsecutivePN(int n) {
//         int sum = 0;
//         int count = 0;

//         for (int i = 2; i < n; i++) {
//             if (isPrime(i)) {
//                 sum += i;
//                 count++;
//                 if (sum == n && count >= 2) return true;
//                 if (sum > n) return false;
//             }
//         }
//         return false;
//     }
// }


class Solution {
    private boolean isPrime(int n) {
        if(n % 2 == 0) return false;
        for(int i = 3; i*i <= n; i += 2) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public int largestPrime(int n) {
        if(n == 1) return 0;
        int ans = 2, m = 3, sum = 2, i = 0;
        while(sum + m <= n) {
            if(isPrime(m)) {
                sum += m;
                if(isPrime(sum)) ans = sum;
            }
            m += 2;
        }
        return ans;
    }
}