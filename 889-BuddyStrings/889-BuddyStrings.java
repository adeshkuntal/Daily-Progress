// Last updated: 8/4/2025, 6:52:58 PM
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            Set<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                if (!set.add(c)) {
                    return true;
                }
            }
            return false;
        }
        List<Integer> mismatchedIndices = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                mismatchedIndices.add(i);
            }
        }
        if (mismatchedIndices.size() != 2) {
            return false;
        }
        int i = mismatchedIndices.get(0);
        int j = mismatchedIndices.get(1);
        return (s.charAt(i) == goal.charAt(j) && s.charAt(j) == goal.charAt(i));
    }
}