// Last updated: 8/4/2025, 6:58:40 PM
class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        
        String[] phone = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };
        
        List<String> combinations = new ArrayList<>();
        backtrack(combinations, new StringBuilder(), digits, phone, 0);
        return combinations;
    }
    
    private void backtrack(List<String> combinations, StringBuilder path, String digits, String[] phone, int index) {
        if (index == digits.length()) {
            combinations.add(path.toString());
            return;
        }
        
        String possibleLetters = phone[digits.charAt(index) - '0'];
        for (char letter : possibleLetters.toCharArray()) {
            path.append(letter);
            backtrack(combinations, path, digits, phone, index + 1);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
