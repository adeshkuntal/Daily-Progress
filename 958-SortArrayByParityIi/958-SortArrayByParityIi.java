// Last updated: 8/4/2025, 6:52:39 PM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> odd= new ArrayList<>();
        List<Integer> even= new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }
            else {
                odd.add(nums[i]);
            }
        }
        int odd_n = 0;
        int even_n = 0;
        for(int i=0; i< nums.length; i++){
            if(i%2==0){
                nums[i]= even.get(even_n);
                even_n+=1;
            }
            else {
                nums[i]=odd.get(odd_n);
                odd_n+=1;
            }
        }
        return nums;
    }
}