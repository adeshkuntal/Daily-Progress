// Last updated: 10/6/2025, 10:16:42 PM

class Solution {
    public String frequencySort(String s) {
        int count = 0;
        int max = 0;
        String ans = "";

        // Count frequency of each character
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            freq.put(a, freq.getOrDefault(a, 0) + 1);
            if (freq.get(a) > max){
                max = freq.get(a);
            }
        }

        // Prepare buckets where index = frequency
        List<List<Character>> buckets = new ArrayList<>();
        for (int i = 0; i <= max; i++){
            buckets.add(new ArrayList<>());
        }

        // Fill characters into frequency buckets
        for (char ch : freq.keySet()) {
            int f = freq.get(ch);
            buckets.get(f).add(ch);
        }

        // Build answer from highest freq to lowest
        for (int i = max; i >= 1; i--) {
            for (char ch : buckets.get(i)) {
                ans += String.valueOf(ch).repeat(i);
            }
        }

        return ans;
    }
}