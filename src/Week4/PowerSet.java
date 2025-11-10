package Week4;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void helper(List<List<Integer>> result,int nums[], int idx,int n,List<Integer> temp){
        if(idx>=n){
            result.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[idx]);
        helper(result,nums,idx+1,n,temp);
        temp.remove(temp.size()-1);
        helper(result,nums,idx+1,n,temp);

    }
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result= new ArrayList<>();
        int n=nums.length;
        List<Integer> temp=new ArrayList<>();

        helper(result,nums,0,n,temp);
        return result;
    }
}

public class PowerSet {

    public static void main(String [] args){
        Solution s=new Solution();
        int arr[]={3,2,1};
        List<List<Integer>> ans=s.subsets(arr);

        System.out.println(ans);

    }

}
