package com.bptn.courseweek4;

public class LinkedListSearch {

	// Do not modify the code in the main function
	public static void main(String[] args) {
		LinkedListNew linkedList = new LinkedListNew();
		//add 41->12->10->3->1
		linkedList.add(41);
		linkedList.add(12);
		linkedList.add(10);
		linkedList.add(3);
		linkedList.add(1);
		System.out.println(linkedList);

		// Complete the search function in LinkedList class below before running the code below
		System.out.println(linkedList.search(3)); 
		System.out.println(linkedList.search(13));   
	}
}

class LinkedListNew {

	private NodeNew head;

	public void add(int data) {
		if (head == null) {
			head = new NodeNew(data);
			return;
		}
		NodeNew node = new NodeNew(data);
		node.setNext(null);
		NodeNew tail = head;
		while (tail.getNext() != null) {
			tail = tail.getNext();
		}
		tail.setNext(node);
	}

	// Complete the function below
	public boolean search(int n){
		if (head == null) { // checking if linked list is empty
			return false;
		}
		NodeNew tail = head;   // starting at first node
		if (tail.getData() == n) { //confirming if stored data is the same as n
			return true;
		}
		while (tail.getNext() != null) { //checking if pointer points to another node
			if (tail.getData() == n) { //confirming if stored data is the same as n
				return true;
			}
			tail = tail.getNext();
		} 
		if (tail.getData() == n) {
			return true;
		} //confirming if stored data is the same as n
		else                                 
			return false;       // n not found in the linked list
	}

	@Override
	public String toString() {
		return "LinkedList{" +
				"head=" + head +
				'}';
	}
}



class NodeNew {
	private int data;
	private NodeNew next;

	NodeNew(int data) {
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public NodeNew getNext() {
		return next;
	}

	public void setNext(NodeNew next) {
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


