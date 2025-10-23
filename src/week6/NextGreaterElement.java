package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class Solution1 {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();

        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>(n);
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                ans.add(-1);
            }
            else{
                ans.add(st.peek());
            }

            st.push(arr[i]);
        }

        Collections.reverse(ans);

        return ans;
    }
}
public class NextGreaterElement {
    public static void main(String[] args){
        Solution1 obj=new Solution1();
        System.out.println(obj.nextLargerElement(new int[]{1, 3, 2, 4}));
    }
}
