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
		listObject.insertAtTop(58);
		System.out.println(listObject);
	}
	public void addDataAtLast() {
		listObject = new LinkedList<>();
		listObject.append(56);
		listObject.append(30);
		listObject.append(70);
		listObject.append(71);
		System.out.println(listObject);
	}
}

