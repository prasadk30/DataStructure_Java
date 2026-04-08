package pk.DS.LinkedList;

public class StackLinkedList {

	private Node top;
	
	public StackLinkedList() {
		this.top=null;
	}
	
	// push operation
	public void push(int data) {
		Node node=  new Node(data);
		 node.next= top;
		 top=node;
		
	}
	
	// pop operation
		public int pop() {
			if(isEmpty()) {
				System.out.println("List is Empty");
				return -1;
			}else {
				int data= top.data;
				top=top.next;
				return data;
			}
		}
	
	
	// peek operation
	public int peek() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return -1;
		}else {
			return top.data;
		}
			
	}
	
	// is Empty
	public boolean isEmpty() {
		if(this.top==null) {
			System.out.println("Stack is empty");
			return true;
		}else {
			return false;
		}
	}
	
	// display
	public void display() {
		if(isEmpty()) {
			System.out.println("Empty");
			return;
		}else {
			Node temp=top;
			while(temp!=null)
			{
				System.out.print(temp.data+ "\t");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	

}
