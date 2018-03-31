public static Node reverseListRecursively(Node head) {
		if (head == null || head.next == null)
			return head;

		// get second node
		Node second = head.next;
		// set first's next to be null
		head.next = null;

		Node rest = reverseListRecursively(second);
		second.next = head;
		return rest;
	}

	public static Node reverseIteratively(Node head) {
		if (head == null) {
			return null;
		}

		Node curr = head;
		Node prev = null;
		Node next=null;

		while (curr != null) {
			next=curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head=prev;
		return head;
	}
