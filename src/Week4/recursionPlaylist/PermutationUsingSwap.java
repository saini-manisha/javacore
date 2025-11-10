package Week4.recursionPlaylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    public static void helper(int idx,int[] nums,List<List<Integer>> result){
        if(idx==nums.length){
            result.add(new ArrayList<Integer>(Arrays.stream(nums).boxed().toList()));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            int temp=nums[idx];
            nums[idx]=nums[i];
            nums[i]=temp;
            helper(idx+1,nums,result);
            temp=nums[idx];
            nums[idx]=nums[i];
            nums[i]=temp;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();


        helper(0,nums,result);
        return result;

    }
}
public class PermutationUsingSwap {
    public static void main(String[] args){
        Solution2 s=new Solution2();
        int nums[]={1,2,3};
        List<List<Integer>> ans=s.permute(nums);
        System.out.println(ans);
    }
}
