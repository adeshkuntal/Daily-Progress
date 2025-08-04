// Last updated: 8/4/2025, 6:55:24 PM
class Solution {
    public int compress(char[] chars) {
        int index = 0; // Position to insert characters in the compressed array
        int i = 0; // Iterator for the original array

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count consecutive characters
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            chars[index++] = currentChar; // Add character to the compressed array

            // Add count if greater than 1
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index; // New length of the compressed array
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = sol.compress(chars);

        // Print the compressed array
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}