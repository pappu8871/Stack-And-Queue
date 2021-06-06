package com.stack;

public class StackUC2 {
	class Node {
		int data;
		Node link;

	}
	Node top;
	StackUC2() {
		this.top =null;
	}
	public void push (int data) {
		Node temp = new Node();
		temp.data = data;
		temp.link = top;
		top = temp;
	}

	public boolean isEmpty()
	{
		return top == null;
	}

	public int peek() {
		if (!isEmpty()) {
			return top.data;
		} else {
			return 1 ;
		}
	}

	public void pop() {
		if (top == null) {
			return;
		}
		top = (top).link;
	}

	public void display() {
		if (top == null) {
			return;
		}
		else {
			Node temp = top;
			while (temp != null) {

				System.out.print( " " + temp.data);
				temp = temp.link;
			}
		}
	}

	public static void main(String[] args){
		StackUC2 list = new StackUC2();

		list.push(70);	
		list.push(30);
		list.push(56);

		System.out.println("Printed Stack list");
		list.display();
		System.out.println();

		list.pop();
		System.out.println("After pop data is dipaly");
		list.display();
		System.out.println();

		System.out.println("peek of data ");
		list.peek();
		list.display();

	}
}
