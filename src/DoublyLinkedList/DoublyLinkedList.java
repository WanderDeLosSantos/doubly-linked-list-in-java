package DoublyLinkedList;
import java.util.Scanner;

public class DoublyLinkedList {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		Object Creation
		LinkedList list = new LinkedList();
		
		System.out.println("Doubly Linked List Test\n");
		
		char ch;
		
//		Operations
		do {
			
			System.out.println("\nDoubly Linked List Operation List");
			System.out.println("1. Insert Integer element at the begining");
			System.out.println("2. Insert Integer element at the end");
			System.out.println("3. Insert Integer element at position");
			System.out.println("4. Delete Integer element at position");
			System.out.println("5. Check Empty");
			System.out.println("6. Check Size");
			
			int choice = scan.nextInt();
			
			switch (choice) {
			
			case 1:
				System.out.println("Enter the integer element to insert");
				list.insertAtStart(scan.nextInt());
				break;
				
			case 2:
				System.out.println("Enter city name to insert");
				list.insertAtEnd(scan.nextInt());
				break;
				
			case 3:
				System.out.println("Enter the integer element to insert");
				int num = scan.nextInt();
				System.out.println("Enter position");
				int pos = scan.nextInt();
				if(pos < 1 || pos > list.getSize()) {
					System.out.println("\nInvalid posistion");
				} else {
					list.insertAtPos(num, pos);
				}
				break;
				
			case 4:
				System.out.println("Enter position");
				int p = scan.nextInt();
				if(p < 1 || p > list.getSize()) {
					System.out.println("\nInvalid Position");
				} else {
					list.deleteAtPos(p);
				}
				break;
				
			case 5:
				System.out.println("Empty Status = " + list.isEmpty());
				break;
				
			case 6:
				System.out.println("Size = " + list.getSize() + "\n");
				break;
				
			default:
				System.out.println("Wrong Entry");
				break;
			}
//			Display List
			list.display();
			System.out.println("\nDo you want to continue (Type y or n)\n");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y' );
		

	}

}
