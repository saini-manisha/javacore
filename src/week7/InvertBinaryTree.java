package week7;

 //* Definition for a binary tree node.
  class TreeNode1 {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode1() {}
      TreeNode1(int val) { this.val = val; }
      TreeNode1(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution1 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;

        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
public class InvertBinaryTree {
}
