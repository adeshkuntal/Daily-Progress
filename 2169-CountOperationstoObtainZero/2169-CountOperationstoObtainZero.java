// Last updated: 11/9/2025, 2:41:43 PM
class Solution {
    public int countOperations(int num1, int num2) {
        int count = 0;
        while(num1 != 0 && num2 != 0){
            if(num1 >= num2){
                count += num1 / num2;
                num1 = num1 % num2;
            } else {
                count += num2 / num1;
                num2 = num2 % num1;
            }
        }
        return count;
    }
}
