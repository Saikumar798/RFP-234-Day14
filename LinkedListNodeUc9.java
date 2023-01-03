package linkedList;

import java.util.LinkedList;

public class LinkedListNodeUc9 {
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

	public void deleteElement(Object key) {
		Node searchedNode = search(key);
		Node temp = head;
		while (temp.next != searchedNode) {
			temp = temp.next;
		}
		temp.next = searchedNode.next;
	}

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList();
		LinkedListNodeUc9 list = new LinkedListNodeUc9();

		System.out.println("List Before Deletion");
		list.add(70);
		list.add(40);
		list.add(30);
		list.add(56);
		list.display();
		System.out.println("-----");

		System.out.println("List After Deletion");
		list.deleteElement(40);
		list.display();

	}
}
