// Last updated: 8/4/2025, 6:57:39 PM
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        int total = (int) Math.pow(2,n);
        for (int i = 0; i < total; i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }
}