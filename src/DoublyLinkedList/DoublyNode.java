package DoublyLinkedList;

public class DoublyNode{

	protected int data;
	protected DoublyNode next, prev;
	
//	variable setting constructor
	public DoublyNode() {
		next = null;
		prev = null;
		data = 0;
	}
	
//	constructor
	public DoublyNode(int d, DoublyNode n, DoublyNode p) {
		data = d;
		next = n;
		prev = p;
	}
	
//	Method to set link to next, previous , and data nodes
	public void setLinkNext(DoublyNode n) {
		next = n;
	}

	public void setLinkPrev(DoublyNode p) {
		prev = p;
	}
	
	public void getData(int d) {
		data = d;
	}
	
	
//	Method to get link to next, previous , and data nodes
	public DoublyNode getLinkNext() {
		return next;
	}
	

	public DoublyNode getLinkPrev() {
		return prev;
	}
	
	public int getData() {
		return data;
	}
	
	
}




