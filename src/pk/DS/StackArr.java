package pk.DS;
class Stack{
	private int maxSize;
	private int[] stackArray;
	private int top ; 
	
	// constructor 
	public Stack(int size) {
		maxSize=size;
		stackArray =new int[maxSize];
		top=-1;
	}
	
	//push operation
	public void push(int value) {
		if(top==maxSize-1) {
			System.out.println("Stack overflow! cannot push. "+value);
		}else {
			stackArray[++top]=value;
			System.out.println("Pushed to the stack");
		}
	}
	// pop operation
	public int pop(){
		if(top==-1) {
			System.out.println("Stack underflow! cannot pop");
			return -1;
		}else {
			return stackArray[top--];
		}
	}
	
	// peek operation
	public int peek() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return -1;
		}else {
			return stackArray[top];
		}
	}
	
	// check stack is empty
	public boolean isEmpty() {
		return(top==-1);
	}
	
	// display the stack elements
	public void display() {
		if (top==-1) {
			System.out.println("Stack is empty");
			}else {
				System.out.println("Stack elements:");
				for(int i=top; i >=0; i--) {
					System.out.println(stackArray[i]);
				}
			}
	}
}
public class StackArr {

	public static void main(String[] args) {
		System.out.println("Stack using Arrays: -> ");
		Stack stack=new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.display();
		System.out.println("Poped: "+stack.pop());
		System.out.println("Top Element: "+stack.peek());
		stack.display();
	}

}
