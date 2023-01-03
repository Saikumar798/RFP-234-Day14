package linkedList;

import java.util.LinkedList;

public class LinkedListNodeUc7 {
	Node head;
	Node tail;

	void add(Object key) {
		Node node = new Node(key);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.key + " ");
			temp = temp.next;
		}
	}

	public Node search(Object key) {
		Node temp = head;
		while (temp != null) {
			if (temp.key.equals(key))
				return temp;
			temp = temp.next;
		}
		return null;

	}

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList();
		LinkedListNodeUc7 list = new LinkedListNodeUc7();

		list.add(56);
		list.add(30);
		list.add(70);
		list.display();
		list.search(70);
		System.out.println(list.search(30));
	}
}
