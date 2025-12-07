package week10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        int len=s.length();
        List<String>ans=new ArrayList<>();
        if(len<=10){
            return ans;
        }
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<len-9;i++){
            String temp=s.substring(i,i+10);
            System.out.println(temp);
            if(map.containsKey(temp)){
                if(map.get(temp)==1){
                    ans.add(temp);

                }

            }
            map.put(temp,map.getOrDefault(temp,0)+1);
        }

        return ans;




    }
}
