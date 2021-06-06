package com.stack;

public class StackUC1 {

	class Node {
		int data;
		Node link;
	}
	Node top;
	StackUC1() {
		this.top =null;
	}
	public void push (int data) {
		Node temp = new Node();
		temp.data = data;
		temp.link = top;
		top = temp;
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
		StackUC1 list = new StackUC1();

		list.push(70);	
		list.push(30);
		list.push(56);
         
		System.out.println("Printed Stack list");
		list.display();
	}
}
