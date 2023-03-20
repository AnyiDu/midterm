package Problem2;

import javax.swing.tree.TreeNode;

public class Problem2 {



		int count = 0;

		public int countUnivalSubtrees (TreeNode root){
		if (root == null) {
			return 0;
		}
		isUnival(root);
		return count;
	}

		private boolean isUnival (TreeNode node){
		if (node.left == null && node.right == null) {
			count++;
			return true;
		}

		boolean isUnival = true;
		if (node.left != null) {
			isUnival = isUnival(node.left) && isUnival && node.left.val == node.val;
		}
		if (node.right != null) {
			isUnival = isUnival(node.right) && isUnival && node.right.val == node.val;
		}

		if (isUnival) {
			count++;
		}

		return isUnival;
	}
	}

