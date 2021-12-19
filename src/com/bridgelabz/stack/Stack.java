package com.bridgelabz.stack;

public class Stack {

	LinkedList list = new LinkedList();

	public void push(Object data) {
		list.addLast(data);
	}

	public void pop() {
		list.pop();
	}

	public void showElements() {
		list.print();
	}
}
