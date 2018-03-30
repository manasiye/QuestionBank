public class InorderSuccessorBST {

	Node root;

	public Node successor(Node root, Node node) {
		if (node.right != null)
			return findMin(node.right);

		Node succ = null;
		while (root != null) {
			if (node.data < root.data) {
				succ = root;
				root = root.left;
			} else if (node.data > root.data) {
				root = root.right;
			} else
				break;
		}
		return succ;
	}

	// leftmost child on the right subtree of the given node
	public Node findMin(Node node) {
		Node current = node;
		while (current.left != null) {
			current = current.left;
		}
		return current;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InorderSuccessorBST tree2 = new InorderSuccessorBST();
		tree2.root = new Node(8);

		tree2.root.left = new Node(5);
		tree2.root.right = new Node(15);

		tree2.root.left.left = new Node(3);
		tree2.root.left.right = new Node(6);

		tree2.root.right.left = new Node(12);
		tree2.root.right.right = new Node(18);

		System.out.println(tree2.successor(tree2.root, tree2.root.left.right).data);
		System.out.println(tree2.successor(tree2.root, tree2.root.left).data);
		System.out.println(tree2.successor(tree2.root, tree2.root).data);
	}

}
