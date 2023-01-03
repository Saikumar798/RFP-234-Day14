package linkedList;

import java.util.LinkedList;

public class LinkedListNodeUc5 {
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

	void append(Object key) {
		Node node = new Node(key);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}

	void insert(Object key) {
		Node node = new Node(key);
		head.next = node;
		node.next = tail;
	}

	Object deleteFirst() {
		Object deletedElement = head.key;
		head = head.next;
		return deletedElement;
	}

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList();
		LinkedListNodeUc5 list = new LinkedListNodeUc5();

		System.out.println("Before Deleting");
		list.add(70);
		list.add(30);
		list.add(56);
		list.display();

		System.out.println("After Deleting");
		list.deleteFirst();
		list.display();
	}

}
