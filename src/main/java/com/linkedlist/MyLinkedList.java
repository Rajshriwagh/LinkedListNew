package com.linkedlist;

public class MyLinkedList {
	LinkedList<Integer> listObject;
	Stack<Integer> stack;
	Queue<Integer> queue;
	
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
		listObject.pop();
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
		Node<Integer> node = listObject.search(30);
		if (node == null) {
			System.out.println("Element Not Found from above linkedlist");
		} else {
			System.out.println("Element present in above linkedlist ");

		}
	}
	// Insert Element After Given Element
		public void insertAfterElement() {
			listObject = new LinkedList<>();
			listObject.append(56);
			listObject.append(30);
			listObject.append(70);
			System.out.println(listObject);
			int position = listObject.index(30);
			if (position == -1) {
				System.out.println("Element Not Found");
			} else {
				listObject.insert(position + 1, 40);
			}
			System.out.println(listObject);

		}
		public void deleteElement() {
			listObject = new LinkedList<>();
			listObject.append(56);
			listObject.append(30);
			listObject.append(40);
			listObject.append(70);
			System.out.println(listObject);
			boolean result=listObject.deleteNode(40);
			if (result==false) {
				System.out.println("Element Not Found");
			} else {
				System.out.println("Element is delete from list");
				System.out.println(listObject);
			}
			System.out.println("Linked list size is " +listObject.size());
		}
		public void orderdList() {
			SortedLinkedList<Integer> orderedList= new SortedLinkedList<>();
			orderedList.add(56);
			orderedList.add(30);
			orderedList.add(40);
			orderedList.add(70);
			System.out.println(orderedList);
		}
		public void implementStack() {
			stack=new Stack<>();
	        stack.push(70);
	        stack.push(30);
	        stack.push(56);
	        System.out.println("printing elements in stack");
	        stack.printStack();
	        System.out.println("peeking stack");
	        int topAtElement=(int)stack.peek();
	        System.out.println("Element at the top of stack "+topAtElement);
	        System.out.println("poping first item from stack");
	        stack.pop();
	        stack.printStack();
		}
		public void implementQueue() {
			queue=new Queue<>();
			queue.enqueue(56);
			queue.enqueue(30);
			queue.enqueue(70);
			System.out.println("print elements of Queue");
	        queue.printQueue();
		}
}
