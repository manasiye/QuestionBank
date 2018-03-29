import java.util.LinkedList;
import java.util.Queue;

//Level order traversal --BFS traversal

public class LevelOrderTraversal {

	TreeNode root;

	void BFS(TreeNode root) {

		if (root == null)
			return;

		Queue<TreeNode> q = new LinkedList<>();

		q.add(root);
		// push the root node in queue

		while (!q.isEmpty()) {

			TreeNode current = q.peek();

			// print the node in queue
			System.out.print(current.info + " ");

			// if the node has children -- push them on the queue
			if (current.left != null) {
				q.offer(current.left);
			}
			if (current.right != null) {
				q.offer(current.right);
			}
			// remove the first node in queue
			q.poll();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelOrderTraversal tree2 = new LevelOrderTraversal();
		tree2.root = new TreeNode(8);

		tree2.root.left = new TreeNode(5);
		tree2.root.right = new TreeNode(15);

		tree2.root.left.left = new TreeNode(3);
		tree2.root.left.right = new TreeNode(6);

		tree2.root.right.left = new TreeNode(12);
		tree2.root.right.right = new TreeNode(18);
		System.out.println("---------LEVEL ORDER TRAVERSAL <-> BREADTH FIRST SEARCH --------");
		tree2.BFS(tree2.root);
	}

}
