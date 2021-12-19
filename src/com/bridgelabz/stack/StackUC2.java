package com.bridgelabz.stack;

public class StackUC2 {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(70);
		stack.showElements();
		stack.push(30);
		stack.showElements();
		stack.push(56);
		stack.showElements();
		stack.pop();
		stack.showElements();
		stack.pop();
		stack.showElements();
		stack.pop();
		stack.showElements();
	}
}
