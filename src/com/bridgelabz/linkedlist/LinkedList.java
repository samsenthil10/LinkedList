package com.bridgelabz.linkedlist;

public class LinkedList<K> {

	private Node<K> head;
	private Node<K> tail;

	public Node<K> getHead() {
		return head;
	}
	public void setHead(Node<K> head) {
		this.head = head;
	}
	public Node<K> getTail() {
		return tail;
	}
	public void setTail(Node<K> tail) {
		this.tail = tail;
	}
}
