package com.gao.LinkedList;

public class Node {
	 Node previous;
	 Node next;
	 Object current;
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Node(Node previous, Node next, Node current) {
		super();
		this.previous = previous;
		this.next = next;
		this.current = current;
	}
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Object getCurrent() {
		return current;
	}
	public void setCurrent(Object current) {
		this.current = current;
	}
	
	
	
}
