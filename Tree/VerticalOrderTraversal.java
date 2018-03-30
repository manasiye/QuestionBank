import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class VerticalOrderTraversal {

	Node1 root = null;

	static class Node1 {
		int data;
		int dist;
		Node1 left;
		Node1 right;

		Node1(int data) {
			this.data = data;
			left = right = null;
		}

	}

	public void traversal(Node1 root) {

		if (root == null)
			return;
		Queue<Node1> q = new LinkedList<>();
		Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
		q.add(root);
		root.dist = 0;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(root.data);
		map.put(root.dist, list);

		while (!q.isEmpty()) {
			Node1 temp = q.poll();
			// System.out.println(temp.data + " " + temp.dist);

			if (temp.left != null) {
				temp.left.dist = temp.dist - 1;
				if (!map.containsKey(temp.left.dist)) {
					ArrayList<Integer> listLeft = new ArrayList<>();
					listLeft.add(temp.left.data);
					map.put(temp.left.dist, listLeft);
				} else
					map.get(temp.left.dist).add(temp.left.data);
				q.add(temp.left);
			}

			if (temp.right != null) {
				temp.right.dist = temp.dist + 1;
				if (!map.containsKey(temp.right.dist)) {
					ArrayList<Integer> listRight = new ArrayList<>();
					listRight.add(temp.right.data);
					map.put(temp.right.dist, listRight);
				} else
					map.get(temp.right.dist).add(temp.right.data);
				q.add(temp.right);
			}
		}

		for (Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {
			ArrayList<Integer> val = e.getValue();
			System.out.println(val + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VerticalOrderTraversal vot = new VerticalOrderTraversal();

		vot.root = new Node1(8);

		vot.root.left = new Node1(5);
		vot.root.right = new Node1(15);

		vot.root.left.left = new Node1(3);
		vot.root.left.right = new Node1(6);

		vot.root.right.left = new Node1(12);
		vot.root.right.right = new Node1(18);

		vot.traversal(vot.root);
	}
}
