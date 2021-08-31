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

	public void printLinkedList() {
		Node<K> temp = head;
		while(temp != null) {
			if(temp.getNext()!= null) {
				System.out.print(temp.getKey()+"->");
				temp = temp.getNext();
			}
			else {
				System.out.println(temp.getKey());
				temp = temp.getNext();
			}
		}
	}

	public void add(Node<K> node) {

		if(head == null) {
			head = node;
			tail = node;
			tail.setNext(null);
		}
		else {
			node.setNext(head);
			head = node;
		}
	}

	public void append(Node<K> node) {

		if(head == null) {
			head = node;
			tail = node;
		}
		else{
			tail.setNext(node);
			tail = node;
			tail.setNext(null);
		}
	}
}
