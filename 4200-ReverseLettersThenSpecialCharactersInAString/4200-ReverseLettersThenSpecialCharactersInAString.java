// Last updated: 3/25/2026, 10:01:20 PM
class Solution {
    public String reverseByType(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] arr = s.toCharArray();

        //for lowercase
        while(left <= right){
            char c1 = arr[left];
            char c2 = arr[right];
            if((c1 >= 'a' && c1 <= 'z') && c2 >= 'a' && c2 <= 'z'){
                arr[left] = c2;
                arr[right] = c1;
                left++;
                right--;
            }
            else if(!(c1 >= 'a' && c1 <= 'z')){
                left++;
            }
            else{
                right--;
            }
        }

        //for special character
        int l = 0;
        int r = s.length()-1;
        
        while(l <= r){
            char c1 = arr[l];
            char c2 = arr[r];
            if(!Character.isLetterOrDigit(c1) && !Character.isLetterOrDigit(c2)){
                arr[l] = c2;
                arr[r] = c1;
                l++;
                r--;
            }
            else if(Character.isLetterOrDigit(c1)){
                l++;
            }
            else{
                r--;
            }
        }

        return new String(arr);
    }
}