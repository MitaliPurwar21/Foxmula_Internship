import java.io.*; 
class Node{
    Node next;
    int value; // the first node
 
    //we can also skip constructor here
    Node()
    {
        next=null;
    }
    // nest class to define linkedlist node
    }

public class Stack_ll
   {
       private Node head;
       int top;
       int len;

       Stack_ll(){
           head=new Node();
           top=-1;
           len=0;
           //or
           //head=null;
       }
       Stack_ll(int n){
           head=null;
            top=-1;
            len=n;
       }

 
    // Remove value from the beginning of the list for demonstrating behaviour of stack
    public void pop() {
        if (head == null || top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        top--;
        int val = head.value;
        head = head.next;
        System.out.println("Element deleted ="+val);
    }
 
    // Add value to the beginning of the list for demonstrating behaviour of stack
    public void push(int value) {
        if(top == len-1)
        {
            System.out.println("Stack is full. Can't push element : "+value);
            return;
        }
        top ++;
        Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = oldHead;
    }
    
    public void compareSize(Stack_ll obj) {
    	if(this.top==obj.top)
    		System.out.println("Each of the stacks have "+ (top+1) + " elements.");
    }
 
    public static void main(String args[])throws Exception
    {
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Stack_ll Stack1=new Stack_ll(5);
        Stack_ll Stack2=new Stack_ll(5);
        boolean flag = false;
		while(!flag)
		{
			System.out.println("Enter 1 to push element in First stack , 2 to pop element in First stack");
			System.out.println("Enter 3 to push element in second stack , 4 to pop element in second stack");
			int o=Integer.parseInt(br.readLine());
			switch(o)
			{
			case 1:
				Stack1.push(Integer.parseInt(br.readLine()));
				Stack1.compareSize(Stack2);
				break;
			case 2:
				Stack1.pop();
				Stack1.compareSize(Stack2);
				break;
			case 3:
				Stack2.push(Integer.parseInt(br.readLine()));
				Stack2.compareSize(Stack1);
				break;
			case 4:
				Stack2.pop();
				Stack2.compareSize(Stack1);
			default:
				System.out.println("Invalid Input. You are thrown out of menu.");
				flag=true;
			}
	}
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }
}