package week6;

class Solution {
    // public static int mini(int[] tickets){
    //     int ans=Integer.MAX_VALUE;
    //     int len=tickets.length;
    //     for(int i=0;i<len;i++){
    //         if(tickets[i]==0) continue;
    //         if(ans>tickets[i]){
    //             ans=tickets[i];
    //         }
    //     }

    //     return ans;
    // }
    public int timeRequiredToBuy(int[] tickets, int k) {

        int len=tickets.length;
        int ans=0;
        // int newLen=len;

        while(tickets[k]!=0){
            // int miniTickets=mini(tickets);//
            // int newLen=tickets.length;
            // ans+=miniTickets*newLen;
            // int count=0;
            for(int i=0;i<len;i++){
                if(tickets[i]>0){
                    tickets[i]--;
                    ans++;
                    if(i==k && tickets[k]==0){
                        return ans;
                    }
                }
            }
            // newLen=count;
        }


        return ans;

    }
}
public class TimeNeededToBuyTickets {
    public static void main(String[] args){
        Solution obj =new Solution();
        int [] tickets = {2,3,2};
        int k = 2;
        System.out.println(obj.timeRequiredToBuy(tickets,k));
    }
}
