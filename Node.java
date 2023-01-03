package linkedList;

import java.util.LinkedList;

public class Node <T> {
	T key;
	Node next;
	
	public Node(T key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", next=" + next + "]";
	}

}

