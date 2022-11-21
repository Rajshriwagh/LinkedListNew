package com.linkedlist;

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome To LinkedList Implementation!");
		// Creating new empty Integer linked list
		LinkedList<Integer> listObject = new LinkedList<>();
		listObject.addNode(56);
		listObject.addNode(30);
		listObject.addNode(70);
		listObject.display();

	}
}