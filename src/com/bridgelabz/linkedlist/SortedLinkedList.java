package com.bridgelabz.linkedlist;

public class SortedLinkedList<K extends Comparable<K>> {
	   
	
	public void addOrderedList(NodeImpl<K> node, LinkedList<K> linkedList) {
		if (linkedList.getHead() == null || linkedList.getHead().getKey().compareTo(node.getKey()) >=0) {
			node.setNext(linkedList.getHead());
			linkedList.setHead(node);
		}
		else {
			NodeImpl<K> current = linkedList.getHead();

			while (current.getNext() != null && current.getNext().getKey().compareTo(node.getKey()) <=0)
				current = current.getNext();
			node.setNext((current.getNext()));
			current.setNext(node);
		}
	}
}
