public class LowestCommonAncestor {

	public static TreeNode lca(TreeNode root, TreeNode n1, TreeNode n2) {

		if (root == null) {
			return null;
		}
		// if root equals either of the node values
		if (root == n1 || root == n2) {
			return root;
		}

		TreeNode left = lca(root.left, n1, n2);
		TreeNode right = lca(root.right, n1, n2);

		if (left != null && right != null) {
			return root;
		}
		return left != null ? left : right;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode n1 = new TreeNode(3);
		TreeNode n2 = new TreeNode(6);
		TreeNode n3 = new TreeNode(8);
		TreeNode n4 = new TreeNode(2);
		TreeNode n5 = new TreeNode(11);
		TreeNode n6 = new TreeNode(13);
		TreeNode n7 = new TreeNode(9);
		TreeNode n8 = new TreeNode(5);
		TreeNode n9 = new TreeNode(7);

		MyBinaryTree tree = new MyBinaryTree(n1);

		tree.root = n1;

		tree.root.left = n2;
		tree.root.right = n3;

		tree.root.left.left = n4;
		tree.root.left.right = n5;

		tree.root.right.right = n6;

		tree.root.left.right.left = n7;
		tree.root.left.right.right = n8;

		tree.root.right.right.left = n9;
		
		LowestCommonAncestor lowCA = new LowestCommonAncestor();
		TreeNode t = lowCA.lca(tree.root, n4, n8);
		System.out.println("LCA of " + n4.info + " and " + n8.info + " is " + t.info);// 6

		t = lowCA.lca(tree.root, n3, n9);
		System.out.println("LCA of " + n3.info + " and " + n9.info + " is " + t.info);// 8

		t = lowCA.lca(tree.root, n3, n5);
		System.out.println("LCA of " + n3.info + " and " + n5.info + " is " + t.info);// 3

	}
}
