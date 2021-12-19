package com.bridgelabz.queue;

public class Queue {
	
	  LinkedList list=new LinkedList();
      
      public void enqueue(Object data) {
              list.addFirst(data);
      }
     
      public void dequeue()
      {
              list.popLast();
      }
     
      public void getElements()
      {
              list.print();
      }
}
