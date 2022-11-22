package com.linkedlist;

public class Stack<T> {
	LinkedList<T> linkedList = new LinkedList<T>();
	Node<T> Top;
	public Stack() {
        this.Top = null;
    }
	public void push(T data){
		linkedList.insertAtTop(data);
	}
	public void pop() {
	    linkedList.pop();
	    Top = linkedList.head; 
	  }
	public T peek() {
		Top = linkedList.head; 
        // check for empty stack
        if (!isEmpty()) {
            return Top.data;
        }
        else {
            System.out.println("Stack is empty");
            return null;
        }
	  }
	// check stack is empty
    public boolean isEmpty() {
        return Top == null;
    }
	public void printStack() {
		linkedList.display();
	  }
	
}
