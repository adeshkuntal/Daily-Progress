// Last updated: 10/4/2025, 8:19:35 PM
import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        Fn(nums,res,new ArrayList<Integer>(),0);
        return res;
    }

    public void Fn(int[] nums, List<List<Integer>> res, List<Integer> temp, int idx){
        if(idx == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        int next = idx + 1;
        while(next < nums.length && nums[next] == nums[idx]){
            next++;
        }

        Fn(nums,res,temp,next);

        temp.add(nums[idx]);
        Fn(nums,res,temp,idx+1);
        temp.remove(temp.size()-1);
    }
}
