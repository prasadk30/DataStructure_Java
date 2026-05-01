package pk.DS.LinkedList;

public class Node {
	int data;   // value of the node
	Node next;  // Reference to the next node
	Node prev;
	
	// Constructor to create n new node
	public Node(int data) {
		this.data = data;
		this.prev= next = null;
		
		
	}
	
	
}
