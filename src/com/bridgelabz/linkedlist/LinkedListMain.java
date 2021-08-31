package com.bridgelabz.linkedlist;

public class LinkedListMain {
	
	public static void main(String[] args) {
		
		Node<Integer> firstNode = new Node<>();
		firstNode.setKey(56);
		Node<Integer> secondNode = new Node<>();
		secondNode.setKey(30);
		Node<Integer> thirdNode = new Node<>();
		thirdNode.setKey(70);
		
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		
		new LinkedList<Integer>().printLinkedList(firstNode);
	}
}
