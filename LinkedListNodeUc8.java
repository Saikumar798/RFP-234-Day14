package linkedList;

import java.util.LinkedList;

public class LinkedListNodeUc8 {
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

	public boolean insertAfter(Object searchData, Object insertData) {
		Node node = new Node<>(insertData);
		Node searchedNode = search(searchData);
		if (searchedNode != null) {
			node.next = searchedNode.next;
			searchedNode.next = node;
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList();
		LinkedListNodeUc8 list = new LinkedListNodeUc8();

		System.out.println("List Before Insertion");
		list.add(70);
		list.add(30);
		list.add(56);
		list.display();
		System.out.println("-----");

		System.out.println("List After Insertion");
		list.insertAfter(30, 40);
		list.display();
	}

}
