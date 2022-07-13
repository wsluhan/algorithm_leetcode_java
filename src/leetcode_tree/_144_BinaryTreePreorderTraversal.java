package leetcode_tree;

import fcc_code_example_recursion.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) return res;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            res.add(temp.val);
            if (temp.right != null) stack.add(temp.right);
            if (temp.left != null) stack.add(temp.left);
        }

        return res;
    }
}

public class _144_BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);

        root.right = t1;
        t1.left = t2;

        Solution144 slt = new Solution144();
        List<Integer> res = slt.preorderTraversal(root);
        System.out.println(res);
    }
}
