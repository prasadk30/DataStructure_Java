package pk.DS.LinkedList;

public class DoublyLinkedList {
	Node head; // Points to the start of the list
	Node tail;
	
	// Adding a node at the front
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next= head;
		newNode.prev=null;
		
		if(head!=null) {
			head.prev=newNode;
		}
		head=newNode;
	}
	
	// push back
	public void pushBack(int data) {
		Node newNode = new Node(data);
		
		// Case1 List is empty
		if(head==null) {
			head=newNode;
			return;
		}
		
		// case2 Traverse to last node
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		// Link new node 
		temp.next=newNode;
		newNode.prev=temp;
		
	}
	
	// pop front node (delete first node)
	public void popFront() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		// only one node
		if(head.next==null) {
			head=null;
			return;
		}
		// Move head forward
		head=head.next;
		head.prev=null;
	}
	
	// pop back (delete end node)
	public void popBack() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		// Only one node
		if(head.next==null) {
			head=null;
			return;
		}
		Node temp=head;
		// Traverse to the last node
		while(temp.next!=null) {
			temp=temp.next;
		}
		// remove last node
		temp.prev.next=null;
				
	}
	
	
	// Display list
	public void display() {
		Node temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data +" <-> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dl=new DoublyLinkedList();
		dl.push(10);
		dl.push(15);
		dl.push(20);
		dl.push(25);
		
		dl.pushBack(30);
		
		dl.popFront();
		dl.popBack();
		
		dl.display();
		
		System.out.println();
	}
}
