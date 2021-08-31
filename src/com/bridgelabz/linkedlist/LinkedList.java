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

	public void printLinkedList(Node<K> node) {
		while(node != null) {
			if(node.getNext()!=null) {
				System.out.print(node.getKey()+"->");
				node = node.getNext();
			}
			else {
				System.out.println(node.getKey());
				node = node.getNext();
			}
		}
	}
}
