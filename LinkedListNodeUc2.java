package linkedList;

import java.util.LinkedList;

public class LinkedListNodeUc2 {

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

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList();
		LinkedListNodeUc2 list = new LinkedListNodeUc2();

		list.add(70);
		list.add(30);
		list.add(56);
		list.display();

	}

}
