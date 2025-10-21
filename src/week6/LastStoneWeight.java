package week6;

import java.util.PriorityQueue;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b)->b-a);


        for(int x:stones){
            pq.add(x);
        }
        while(pq.size()>1){
            int y=pq.poll();
            int x=pq.poll();
            if(x!=y)
                pq.add(y-x);
        }

        return pq.isEmpty()?0:pq.poll();
    }
    public static void main(String[] args){
        int stones[]={2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));


    }
}
