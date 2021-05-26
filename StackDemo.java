import java.io.*;
class Stack{
	int arr[], top=-1;
	public void push(int val){
		if(checkFull()){
			System.out.println("Stack is full");
			return;
		}
		arr[++top]=val;
	}
	
	public void pop(){
		if(checkEmpty()){
			System.out.println("stack is empty");
			return;
		}
		top--;
	}
	
	public boolean checkEmpty(){
		if(top==-1)
			return true;
		return false;
	}
	
	public boolean checkFull(){
		if(top>arr.length)
			return true;
		return false;
	}
	public void display() {
		for(int i=0;i<=top;i++) {
			System.out.println(arr[i]);
		}}
	
	public void compareSize(Stack obj){
		if(this.top==obj.top) {
			System.out.println("Number of elements in each stack = "+ (top+1) );
		}
	}
}
public class StackDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of first stack");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Enter the size of second stack");
		int m = Integer.parseInt(br.readLine());
		Stack obj1 = new Stack();
		Stack obj2 = new Stack();
		obj1.arr=new int[n];
		obj2.arr=new int[m];
		boolean flag = false;
		while(!flag)
		{
			System.out.println("Enter 1 to push element in First stack , 2 to pop element in First stack");
			System.out.println("Enter 3 to push element in second stack , 4 to pop element in second stack");
			int o=Integer.parseInt(br.readLine());
			switch(o)
			{
			case 1:
				obj1.push(Integer.parseInt(br.readLine()));
				obj1.compareSize(obj2);
				break;
			case 2:
				obj1.pop();
				obj1.compareSize(obj2);
				break;
			case 3:
				obj2.push(Integer.parseInt(br.readLine()));
				obj1.compareSize(obj2);
				break;
			case 4:
				obj2.pop();
				obj1.compareSize(obj2);
			default:
				System.out.println("Invalid Input. You are thrown out of menu.");
				flag=true;
			}
	}

	}}
