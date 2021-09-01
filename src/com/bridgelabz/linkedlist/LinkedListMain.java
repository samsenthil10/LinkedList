package com.bridgelabz.linkedlist;

public class LinkedListMain {
	
	public static void main(String[] args) {
		
		
		SortedLinkedList<Integer> sortedLinkedList = new SortedLinkedList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		NodeImpl<Integer> firstNode = new NodeImpl<>();
		firstNode.setKey(56);
		NodeImpl<Integer> secondNode = new NodeImpl<>();
		secondNode.setKey(30);
		NodeImpl<Integer> thirdNode = new NodeImpl<>();
		thirdNode.setKey(70);
		
		sortedLinkedList.addOrderedList(firstNode, linkedList);
		linkedList.printLinkedList();
		sortedLinkedList.addOrderedList(secondNode, linkedList);
		linkedList.printLinkedList();
		sortedLinkedList.addOrderedList(thirdNode, linkedList);
		linkedList.printLinkedList();
	}
}
