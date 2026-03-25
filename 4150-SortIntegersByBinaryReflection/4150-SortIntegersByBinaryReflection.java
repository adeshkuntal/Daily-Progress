// Last updated: 3/25/2026, 10:01:36 PM
class Solution {
    public int[] sortByReflection(int[] nums) {
        int n = nums.length;
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr,(a,b) -> {
            int ra = reflect(a);
            int rb = reflect(b);
            if(ra != rb){
                return ra - rb;
            }
            return a- b;
        });

        for(int i=0; i<n; i++){
            nums[i] = arr[i];
            
        }
        return nums;
    }

    public static int reflect(int x){
        String s = Integer.toBinaryString(x);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return Integer.parseInt(sb.toString(),2);
    }
}