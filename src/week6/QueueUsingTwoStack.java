package week6;

import java.util.Stack;
class MyQueue {
    private Stack<Integer>s1,s2;
    //s1 for pushing
    //s2 for pop and peek;

    public MyQueue() {
        this.s1=new Stack<Integer>();
        this.s2=new Stack<Integer>();
    }

    public void push(int x) {// o(1)
        this.s1.push(x);

    }

    public int pop() {
        while(this.s1.size()>1){
            this.s2.push(this.s1.pop());
        }
        int ans=this.s1.pop();
        while(this.s2.size()>0){
            this.s1.push(this.s2.pop());
        }
        return ans;
    }

    public int peek() {
        while(this.s1.size()>1){
            this.s2.push(this.s1.pop());
        }
        int ans=this.s1.peek();
        while(this.s2.size()>0){
            this.s1.push(this.s2.pop());
        }
        return ans;
    }




    public boolean empty() {
        if(this.s1.size()==0) return true; // O(1)
        return false;
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
public class QueueUsingTwoStack {
    public static void main(String[] args){
        MyQueue obj=new MyQueue();
        obj.push(1);
        obj.push(33);
        obj.push(12);
        int param_2 = obj.pop();
        System.out.println(param_2);
        int param_3 = obj.peek();
        System.out.println(param_3);
        boolean param_4 = obj.empty();
        System.out.println(param_4);


    }
}
