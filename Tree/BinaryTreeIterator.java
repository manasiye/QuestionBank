import java.util.Stack;

public class BinaryTreeIterator {
	static TreeNode root;
	Stack<TreeNode> stack;

	/** constructor */
	public BinaryTreeIterator(TreeNode root) {
		stack = new Stack<>();
		while (root != null) {
			stack.push(root);
			root = root.left;
		}
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return !stack.isEmpty();
	}

	/** @return the next smallest number */
	public int next() {
		TreeNode node = stack.pop();
		int res = node.info;
		if (node.right != null) {
			node = node.right;
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root = new TreeNode(8);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);

		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(6);

		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(18);

		// root.left.left.left = new TreeNode(1);
		root.left.left.right = new TreeNode(4);

		root.right.right.left = new TreeNode(16);
		root.right.right.right = new TreeNode(20);

		BinaryTreeIterator bst = new BinaryTreeIterator(root);

		System.out.println(bst.hasNext());
		System.out.println(bst.next());
	}

}
