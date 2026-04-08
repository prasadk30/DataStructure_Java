package pk.DS.LinkedList;

public class StackLinkedMain {

	public static void main(String[] args) {
		StackLinkedList sList= new StackLinkedList();
		
		
		sList.push(20);
		sList.push(10);
		sList.push(30);
		sList.display();
		System.out.println(sList.pop());
		sList.display();
		sList.peek();
		
	}

}
