public class IsBinarySearchTree {

	TreeNode root;

	// check whether a tree is a binary tree
	static boolean isBinaryTree(TreeNode root, int min, int max) {
		if (root == null) {
			return true;
		}
		if (min < root.info && max > root.info && isBinaryTree(root.left, min, root.info)
				&& isBinaryTree(root.right, root.info, max)) {
			return true;
		} else
			return false;
	}

	static boolean isBST(TreeNode root) {

		if (isBinaryTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsBinarySearchTree tree2 = new IsBinarySearchTree();
		tree2.root = new TreeNode(8);

		tree2.root.left = new TreeNode(5);
		tree2.root.right = new TreeNode(15);

		tree2.root.left.left = new TreeNode(3);
		tree2.root.left.right = new TreeNode(6);

		tree2.root.right.left = new TreeNode(12);
		tree2.root.right.right = new TreeNode(18);

		System.out.println("Is the tree Valid BST???-->" + tree2.isBST(tree2.root));
	}

}
