// Last updated: 8/4/2025, 6:51:33 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        boolean ans = true;
        int count = 1;
        int a = arr[0];
        Set<Integer> countSet = new HashSet<>();
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == a){
                count++;
            }
            else {
                if(countSet.contains(count)){
                    ans = false;
                    break;
                }
                countSet.add(count);
                count = 1;
                a = arr[i];
            }
        }
        if(countSet.contains(count)){
            ans = false;
        }
        return ans;
    }
}