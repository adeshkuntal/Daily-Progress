// Last updated: 8/4/2025, 6:54:27 PM
class Solution {
    public String[] findRestaurant(String[] l1, String[] l2) {
        int sum_i = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();

        for (int i = 0; i < l1.length; i++) {
            String a = l1[i];
            for (int j = 0; j < l2.length; j++) {
                if (a.equals(l2[j])) {
                    if (i + j < sum_i) {
                        sum_i = i + j;
                        result.clear(); // Clear the previous results
                        result.add(a);  // Add the current string
                    } else if (i + j == sum_i) {
                        result.add(a);  // Add the current string if it has the same minimum sum
                    }
                }
            }
        }

        return result.toArray(new String[result.size()]);
    }
}