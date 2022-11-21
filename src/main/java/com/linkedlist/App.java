package com.linkedlist;

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome To LinkedList Implementation!");
		// Creating new empty Integer linked list
		MyLinkedList list = new MyLinkedList();
		list.addData();
		System.out.println("Adding node at start of the linkedlist");
		list.addNodeAtStart();
		System.out.println("Adding node at last of the linkedlist");
		list.addNodeAtLast();
		System.out.println("Adding node at given position of linkedlist");
		list.insertNodeInBetween();
		list.popFront();
	}
}