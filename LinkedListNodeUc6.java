package linkedList;

import java.util.LinkedList;

public class LinkedListNodeUc6 {

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

	Object deleteLast() {
		Object deletedElement = tail.key;
		Node temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}
		temp.next = null;
		temp = tail;
		return deletedElement;

	}

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList();
		LinkedListNodeUc6 list = new LinkedListNodeUc6();

		System.out.println("Before Deleting");
		list.add(70);
		list.add(30);
		list.add(56);
		list.display();

		System.out.println("After Deleting");
		list.deleteLast();
		list.display();

	}
}
