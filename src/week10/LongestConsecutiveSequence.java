package week10;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Map<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],true);
        }
        int maxConse=0;
        for(int i=0;i<n;i++){
            int ele=nums[i];
            int cnt=1;
            ele++;
            while(map.containsKey(ele)){
                map.remove(ele);
                cnt++;
                ele++;
            }
            ele=nums[i]-1;
            while(map.containsKey(ele)){
                map.remove(ele);
                cnt++;
                ele--;

            }
            maxConse=Math.max(maxConse,cnt);
        }
        return maxConse;
    }
}
