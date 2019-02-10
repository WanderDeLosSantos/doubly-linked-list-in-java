package DoublyLinkedList;

public class LinkedList {
	protected DoublyNode start, end;
	public int size;
	
//	Constructor
	public LinkedList() {
		start = null;
		end = null;
		size = 0;
		
	}
	
//	Method to check is list is empty
	public boolean isEmpty() {
		return start == null;
	}
	
//	Method to get list size
	public int getSize() {
		return size;
	}
	
//	Methods to insert Elements@SuppressWarnings("unchecked")
	public void insertAtStart(int val) { //Inserting at the beginning
		DoublyNode nptr = new DoublyNode(val, null, null);
		
		if(start == null) {
			
			start = nptr;
			end = start;
			
		} else {
			start.setLinkPrev(nptr);
			nptr.setLinkNext(start);
			start = nptr;
		}
		size++;
	}
	
	public void insertAtEnd(int val) { // Inserting at the End
		DoublyNode nptr = new DoublyNode(val, null, null);
		
		if(start == null) {
			
			start = nptr;
			end = start;
			
		} else {
			nptr.setLinkPrev(end);
			end.setLinkNext(nptr);
			end = nptr;
		}
		
		size++;
	}
	
	public void insertAtPos(int val, int pos) { // Inserting element at position
		DoublyNode nptr = new DoublyNode(val, null, null);
		if(pos == 1) {
			insertAtStart(val);
			return;
		}
		DoublyNode ptr = start;
		for(int i = 2; i <= size; i++) {
			if(i == pos) {
				DoublyNode tmp = ptr.getLinkNext();
				ptr.setLinkNext(nptr);
				nptr.setLinkPrev(ptr);
				nptr.setLinkNext(tmp);
				tmp.setLinkPrev(nptr);
			}
			
			ptr = ptr.getLinkNext();
		}
		
		size++;
	}
	
	public void deleteAtPos(int pos) {// Deleting element at position
		if(pos == 1) {
			if(size == 1) {
				start = null;
				end = null;
				size = 0;
				return;
			}
			
			start = start.getLinkNext();
			start.setLinkPrev(null);
			size--;
			return;
		}
		
		if(pos == size) {
			end = end.getLinkPrev();
			end.setLinkNext(null);
			size--;
		}
		
		DoublyNode ptr = start.getLinkNext();
		for(int i =2; i <= size; i++) {
			if(i == pos) {
				DoublyNode p = ptr.getLinkPrev();
				DoublyNode n = ptr.getLinkNext();
				
				p.setLinkNext(n);
				n.setLinkPrev(p);
				size--;
				return;
			}
			
			ptr = ptr.getLinkNext();
		}
	}
	
//	Method to display list status
	public void display() {
		System.out.print("\nDoubly Linked List = ");
		if(size == 0) {
			System.out.print("\nEmpty");
			return;
		}
		
		if(start.getLinkNext() == null) {
			System.out.println(start.getData());
			return;
		}
		
		DoublyNode ptr = start;
		System.out.print(start.getData() + " <-> ");
		ptr = start.getLinkNext();
		while (ptr.getLinkNext() != null) {
			System.out.print(ptr.getData() + " <-> ");
			ptr = ptr.getLinkNext();
		}
		
		System.out.print(ptr.getData() + "\n");
	}
	
	
}















