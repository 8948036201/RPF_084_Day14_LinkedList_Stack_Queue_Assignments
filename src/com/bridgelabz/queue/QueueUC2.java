package com.bridgelabz.queue;

public class QueueUC2 {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(56);
		queue.getElements();
		queue.enqueue(30);
		queue.getElements();
		queue.enqueue(70);
		queue.getElements();
		queue.dequeue();
		queue.getElements();
		queue.dequeue();
		queue.getElements();
		queue.dequeue();
		queue.getElements();
	}
}
