package Week4.recursionPlaylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void helper(int idx, int nums[], List<List<Integer>> result, List<Integer>temp){
        result.add(new ArrayList<Integer>(temp));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            helper(i+1,nums,result,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        helper(0,nums,result,new ArrayList<>());
        return result;
    }
}
public class SubsetSumII {
    public static void main(String[] args){
        Solution st=new Solution();
        int nums[]={1,2,2,3,3};
        List<List<Integer>> ans=st.subsetsWithDup(nums);
        System.out.println(ans);
    }
}
