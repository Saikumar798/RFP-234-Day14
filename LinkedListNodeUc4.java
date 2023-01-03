package linkedList;

import java.util.LinkedList;

import practiseProblemsDay14.Node;

public class LinkedListNodeUc4<T> {

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

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList();
		LinkedListNodeUc4 list = new LinkedListNodeUc4();

		list.append(56);
		list.append(70);
		list.insert(30);
		list.display();

	}

}
