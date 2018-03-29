import java.util.ArrayList;
import java.util.List;

//Given a binary tree, return all root-to-leaf paths.
//eg-  ["1->2->5", "1->3"]

public class BinaryTreePaths {

	static Node root;

	static List<String> binaryTreePaths(Node root) {
		List<String> answer = new ArrayList<>();
		if (root != null)
			searchBT(root, "", answer);
		return answer;
	}

	static void searchBT(Node root, String path, List<String> answer) {
		if (root.left == null && root.right == null)
			answer.add(path + root.data);
		if (root.left != null)
			searchBT(root.left, path + root.data + "->", answer);
		if (root.right != null)
			searchBT(root.right, path + root.data + "->", answer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreePaths tree2 = new BinaryTreePaths();

		tree2.root = new Node(8);

		tree2.root.left = new Node(5);
		tree2.root.right = new Node(15);

		tree2.root.left.left = new Node(3);
		tree2.root.left.right = new Node(6);

		tree2.root.right.left = new Node(12);
		tree2.root.right.right = new Node(18);

		tree2.root.left.left.left = new Node(1);
		tree2.root.left.left.right = new Node(4);

		tree2.root.right.right.left = new Node(16);
		tree2.root.right.right.right = new Node(20);

		System.out.println(tree2.binaryTreePaths(tree2.root));

	}

}
