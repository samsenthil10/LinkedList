package com.bridgelabz.linkedlist;

public class LinkedListMain {
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		Node<Integer> firstNode = new Node<>();
		firstNode.setKey(56);
		Node<Integer> secondNode = new Node<>();
		secondNode.setKey(30);
		Node<Integer> thirdNode = new Node<>();
		thirdNode.setKey(70);
		
		linkedList.add(thirdNode);
		linkedList.printLinkedList();
		linkedList.add(secondNode);
		linkedList.printLinkedList();
		linkedList.add(firstNode);
		linkedList.printLinkedList();
	}
}
