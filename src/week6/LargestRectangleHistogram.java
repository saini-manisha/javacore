package week6;

import java.util.Stack;

class Solution3 {
    public static void previousSmallerElement(int[] heights,int[] pse){

        int n=heights.length;

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            while(st.size()>0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }

            if(st.size()==0 )
            {
                pse[i]=-1;

            }
            else{
                pse[i]=st.peek();

            }
            st.push(i);
        }


    }

    public static void nextSmallerElement(int[] heights,int[] nse){
        int n=heights.length;

        Stack<Integer> st=new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0){
                nse[i]=n;
            }
            else{
                nse[i]=st.peek();
            }

            st.push(i);
        }
    }
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxArea=0;
        int pse[]=new int[n];
        int nse[]=new int[n];

        previousSmallerElement(heights,pse);
        nextSmallerElement(heights,nse);

        for(int i=0;i<n;i++){
            int len=nse[i]-pse[i]-1;
            maxArea=Math.max(maxArea,len*heights[i]);
        }

        return maxArea;
    }
}
public class LargestRectangleHistogram {
    public static void main(String[] args){
        Solution3 obj=new Solution3();
        System.out.println(obj.largestRectangleArea(new int[]{2,1,5,6,2,3}));

    }
}
