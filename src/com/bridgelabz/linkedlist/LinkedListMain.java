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
		
		linkedList.addOrderedList(firstNode);
		linkedList.printLinkedList();
		linkedList.addOrderedList(secondNode);
		linkedList.printLinkedList();
		linkedList.addOrderedList(thirdNode);
		linkedList.printLinkedList();
		linkedList.addOrderedList(thirdNode1);
		linkedList.printLinkedList();
		
	}
}
