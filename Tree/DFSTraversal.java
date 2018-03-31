import java.util.ArrayList;
import java.util.List;

public class DFSTraversal {

	TreeNode root;

	public List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<>();

		if (root == null)
			return new ArrayList<>();

		list.add(root.info);

		if (root.left != null)
			list.addAll(preorderTraversal(root.left));

		if (root.right != null)
			list.addAll(preorderTraversal(root.right));

		return list;
	}

	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<>();

		if (root == null)
			return new ArrayList<>();

		if (root.left != null)
			list.addAll(inorderTraversal(root.left));

		list.add(root.info);

		if (root.right != null)
			list.addAll(inorderTraversal(root.right));

		return list;
	}

	public List<Integer> postorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<>();

		if (root == null)
			return new ArrayList<>();

		if (root.left != null)
			list.addAll(postorderTraversal(root.left));

		if (root.right != null)
			list.addAll(postorderTraversal(root.right));

		list.add(root.info);

		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFSTraversal tree2 = new DFSTraversal();
		tree2.root = new TreeNode(8);

		tree2.root.left = new TreeNode(5);
		tree2.root.right = new TreeNode(15);

		tree2.root.left.left = new TreeNode(3);
		tree2.root.left.right = new TreeNode(6);

		tree2.root.right.left = new TreeNode(12);
		tree2.root.right.right = new TreeNode(18);

		System.out.print("Preorder Traversal-->");
		System.out.println(tree2.preorderTraversal(tree2.root));

		System.out.print("Inorder Traversal-->");
		System.out.println(tree2.inorderTraversal(tree2.root));

		System.out.print("Postorder Traversal-->");
		System.out.println(tree2.postorderTraversal(tree2.root));
	}
}