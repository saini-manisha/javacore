package Week4.recursionPlaylist;

import java.util.ArrayList;
import java.util.List;

class Solution1 {
    public static void helper(int[] nums, List<List<Integer>> result, boolean[] marking, ArrayList<Integer> temp){
        if(temp.size()==nums.length){
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(marking[i]==false){
                temp.add(nums[i]);
                marking[i]=true;
                helper(nums,result,marking,temp);
                marking[i]=false;
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        boolean [] marking=new boolean[nums.length];

        helper(nums,result,marking,new ArrayList<Integer>());
        return result;

    }
}
public class Permutations {
    public static void main(String[] args){
        Solution1 s1=new Solution1();
        int nums[]={1,2,3};
        List<List<Integer>> ans=s1.permute(nums);
        System.out.println(ans);

    }
}
