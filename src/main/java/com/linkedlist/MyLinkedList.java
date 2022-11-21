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

	void addNodeAtStart() {
		listObject = new LinkedList<>();
		listObject.insertAtTop(70);
		listObject.insertAtTop(30);
		listObject.insertAtTop(56);
		listObject.insertAtTop(58);
		System.out.println(listObject);
	}

	public void addNodeAtLast() {
		listObject = new LinkedList<>();
		listObject.append(56);
		listObject.append(30);
		listObject.append(70);
		listObject.append(71);
		System.out.println(listObject);
	}

	public void insertNodeInBetween() {
		listObject = new LinkedList<>();
		listObject.append(56);
		listObject.append(30);
		listObject.append(70);
		System.out.println("list of Object before");
		System.out.println(listObject);
		listObject.insert(2, 40);
		System.out.println("list of Object after");
		System.out.println(listObject);
	}

	public void deletFromStart() {
		listObject = new LinkedList<>();
		listObject.append(56);
		listObject.append(30);
		listObject.append(70);
		System.out.println(listObject);
		listObject.popFirst();
		System.out.println("printing list after deleting first node");
		System.out.println(listObject);

	}

	public void deleteFromEnd() {
		listObject = new LinkedList<>();
		listObject.append(56);
		listObject.append(30);
		listObject.append(70);
		System.out.println(listObject);
		listObject.popLast();
		System.out.println("printing list after deleting last node");
		System.out.println(listObject);
	}

	public void searchElement() {
		listObject = new LinkedList<>();
		listObject.append(56);
		listObject.append(30);
		listObject.append(70);
		System.out.println(listObject);
		Node<Integer> node = listObject.search(80);
		if (node == null) {
			System.out.println("Element Not Found");
		} else {
			System.out.println("Element present in linked list ");

		}
	}
}
