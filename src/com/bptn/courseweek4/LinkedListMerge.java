package com.bptn.courseweek4;

class LinkedList {

	private Node head;

	public void add(int data) {
		if (head == null) { // check if the linkedlist is empty
			head = new Node(data);
			return;
		}
		Node node = new Node(data);
		node.setNext(null);
		Node tail = head;
		while (tail.getNext() != null) {
			tail = tail.getNext();
		}
		tail.setNext(node);
	}

	public Node getHead() {
		return head;
	}

	@Override
	public String toString() {
		return "LinkedList{" +
				"head=" + head +
				'}';
	}
}



class Node {
	private int data;
	private Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node{" +
				"data=" + data +
				", next=" + next +
				'}';
	}
}

class MergedLinkedList {

	LinkedList linklist1, linklist2; // declare class attributes

	MergedLinkedList (LinkedList linklist1, LinkedList linklist2) {
		this.linklist1 = linklist1;
		this.linklist2 = linklist2;
	}

	public LinkedList merge(){

		LinkedList linkedListMerged = new LinkedList();

		Node head1 = linklist1.getHead();
		Node head2 = linklist2.getHead();

		Node tail1 = head1;
		Node tail2 = head2;
		// if statement to check if any linkedlist is empty
		if (head1 == null) {
			linkedListMerged = linklist2;
			return linkedListMerged;
		}
		else if (head2 == null) {
			linkedListMerged = linklist1;
			return linkedListMerged;
		}
		
		// loop through both lists, compare values set at their tails
		while (tail1.getNext() != null && tail2.getNext() != null) {
			if (tail1.getData() <= tail2.getData()) {
				linkedListMerged.add(tail1.getData());
				tail1 = tail1.getNext();
			}
			else if (tail2.getData() <= tail1.getData()) {
				linkedListMerged.add(tail2.getData());
				tail2 = tail2.getNext();
			}
		}
		
		// if statement to handle case when only one item is left in one of the list
		if (tail1.getData() <= tail2.getData()) {
			linkedListMerged.add(tail1.getData());
			linkedListMerged.add(tail2.getData());
		}
		else if (tail2.getData() <= tail1.getData()){
			linkedListMerged.add(tail2.getData());
			linkedListMerged.add(tail1.getData());
		}

		// while loop to add the items left in one linkedlist when the last item in
		// the other list has been handled
		while (tail1.getNext() != null) {
			tail1 = tail1.getNext();
			linkedListMerged.add(tail1.getData());
		}

		while (tail2.getNext() != null) {
			tail2 = tail2.getNext();
			linkedListMerged.add(tail2.getData());
		}


		return linkedListMerged;

	}
}

public class LinkedListMerge {

	public static void main(String[] args) {
		LinkedList linkedList1 = new LinkedList();  
		// creating 2 sorted linked lists 
		linkedList1.add(1);
		linkedList1.add(2);
		linkedList1.add(4);
		System.out.println(linkedList1);

		LinkedList linkedList2 = new LinkedList();
		linkedList2.add(1);
		linkedList2.add(3);
		linkedList2.add(4);
		System.out.println(linkedList2);

		// creating an object of the class MergedLinkedList
		MergedLinkedList linkedListMerged = new MergedLinkedList(linkedList1, linkedList2);

		LinkedList result = linkedListMerged.merge(); //merged linkedlist

		System.out.println(result); 

	}
}

