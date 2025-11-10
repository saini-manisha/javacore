package week7;

public class MinimumAbsoluteDifferenceInBST {
    int minDiff=Integer.MAX_VALUE;
    Integer prev=null;
    void inorderTraversal(TreeNode root){
        if(root==null) return;

        inorderTraversal(root.left);
        if(prev!=null){
            if((root.val-prev)<minDiff){
                minDiff=root.val-prev;
            }
        }
        prev=root.val;
        inorderTraversal(root.right);

    }
    public int getMinimumDifference(TreeNode root) {
        inorderTraversal(root);
        return minDiff;

    }
}
