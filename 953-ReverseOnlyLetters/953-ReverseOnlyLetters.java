// Last updated: 8/4/2025, 6:52:40 PM
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int right = arr.length - 1;
        int left = 0;

        while (left < right) {
            if (Character.isLetter(arr[left]) && Character.isLetter(arr[right])) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            }
        }

        String r = new String(arr);
        return r;
    }
}