package com.linkedlist;

public class MyLinkedList {
	LinkedList<Integer> listObject;
	void addData() {
		listObject = new LinkedList<>();
		listObject.addNode(56);
		listObject.addNode(30);
		listObject.addNode(70);
		listObject.display();
	}

	void addDataAtStart() {
		listObject = new LinkedList<>();
		listObject.insertAtTop(70);
		listObject.insertAtTop(30);
		listObject.insertAtTop(56);
		System.out.println(listObject);
	}
}
