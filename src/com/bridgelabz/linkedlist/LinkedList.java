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

	public void insertInBetween(Node<K> node, Node<K> previousNode, Node<K> nextNode) {
		Node<K> temp = head;
		while(temp != null) {
			if(temp == previousNode && temp.getNext() == nextNode) {
				break;
			}
			temp = temp.getNext();
		}
		if (temp != null) {
			Node<K> temp1 = temp.getNext();
			temp.setNext(node);
			node.setNext(temp1);
		}
		else {
			System.out.println("Nodes Not Found!");
		}
	}

	public void deleteAtFirst() {
		if(head == null) {
			return;
		}
		else if(head == tail)
		{
			head = tail = null;
		}
		else {

			Node<K> temp = head;
			head = temp.getNext();
			temp = null;
		}
	}

	public void deleteAtLast() {
		if(head == null) {
			return;
		}
		else if(head == tail)
		{
			head = tail = null;
		}
		else {
			Node<K> temp = head;
			while(temp.getNext() != tail) {
				temp=temp.getNext();
			}
			tail = temp;
			tail.setNext(null);
		}
	}

	public Node<K> search(K key) {
		Node<K> temp = head;
		while(temp!=null) {
			if(temp.getKey().equals(key)) {
				break;
			}
			temp=temp.getNext();
		}
		return temp;
	}
}
