package com.linkedlist;

public class LinkedList<T> {
	Node<T> head;
	Node<T> temp;

	public void addNode(T data) {
		// Create a new node
		Node<T> newNode = new Node<>(data);

		// Checks if the list is empty
		if (this.head == null) {
			// If list is empty, both head and temp will point to new node
			head = newNode;
			temp = newNode;
		} else {
			// newNode will be added after temp such that temp's next will point to newNode
			temp.next = newNode;
			// newNode will become new temp of the list
			temp = newNode;
		}
	}
	void insertAtTop(T data) {
		Node<T> node = new Node<T>(data);
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node<T> temp;
			temp = head;
			head = node;
			head.next = temp;
		}
	}

	// method will display all the nodes present in the list
	public void display() {
		// temp will point to head
		Node<T> temp = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (temp != null) {
			// Prints each node by incrementing pointer
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	// To display the LinkedList
    //@Override
    public String toString()
    {
 
        String S="";
 
        Node<T> temp = head;
 
        if (temp == null)
            return S;
 
        while (temp.next != null) {
            S += String.valueOf(temp.data) + " -> ";
            temp = temp.next;
        }
 
        S += String.valueOf(temp.data);
        return S;
    }
}
