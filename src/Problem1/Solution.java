package Problem1;
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class Solution {
	//Define a binary tree node.
	public TreeNode upsideDownBinaryTree(TreeNode root) {
		TreeNode newRoot = null;
		TreeNode parent = null;
		TreeNode right = null;
		while (root != null) {
			TreeNode left = root.left;
			root.left = right;
			right = root.right;
			root.right = parent;
			parent = root;
			root = left;
			if (newRoot == null) {
				newRoot = parent;
			}
		}
		return newRoot;
	}
}
