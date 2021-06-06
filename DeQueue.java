package com.queue;

public class DeQueueUC2 {

	static Node rear = null;
	static Node front =null;
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void ensertqueue(int data) {
		Node temp  = new Node (data);
		Node rear = null;
		Node front =null;

		System.out.print( " " + data);
	        if (rear == null)
	        {
	            front = temp;
	            rear = temp;
	        } else {
	            rear.next = temp;
	            rear = temp;
	        }
	    }

	public static int dequeue() {
        if (front == null) {

            System.exit(1);
        }
 
        Node temp = front;
        System.out.print(temp.data);
 
        front = front.next;

        if (front == null) {
            rear = null;
        }
        int item = temp.data;
        return item;
    }

	public static void main(String[] args){
		DeQueueUC2 dequeue = new DeQueueUC2();
	       
		dequeue.ensertqueue(56);
		dequeue.ensertqueue(30);
		dequeue.dequeue();
		dequeue.ensertqueue(70);

	}
}
