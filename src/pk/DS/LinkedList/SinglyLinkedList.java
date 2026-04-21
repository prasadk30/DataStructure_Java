package pk.DS.LinkedList;


public class SinglyLinkedList {
	Node head;
	
	// 1. Insert at begining: O(1) 
	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	
	// 2. Insert at end : O(n)
	public void insertAtEnd(int data) {
		Node newNode =new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node current= head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
	}
	
	// 3. Delete a node by value 
	public void deleteByValue(int val) {
		Node current = head, prev=null;
		
		// Case 1. Head node holds the value/key
		if(current!=null && current.data==val) {
			head=current.next;
			return;
		}
		
		// Case 2. Search for value/key
		while(current!=null && current.data!=val) {
			prev=current;
			current=current.next;
		}
		
		// Case 3. Value/ key not found
		if(current ==null) return;
		
		// Unlink node 
		prev.next=current.next;
		
	}
	// Display the list 
	public void display() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+" -> ");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		SinglyLinkedList list =new SinglyLinkedList();
		
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtHead(5);
		list.display();
		
		list.deleteByValue(20);
		list.display();
	}
}
