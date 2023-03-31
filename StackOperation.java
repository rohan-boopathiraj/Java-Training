package Assignment1;


import java.util.*;

interface stack{
	public void push(int num);
	
	public void pop();
}

class fixedStack implements stack{
	int size;
	int top;
	int arr[];
	
	public fixedStack(int size)
	{
		this.size=size;
		arr = new int[size];
	}
	
	public void push(int num)
	{
		if(top+1>size)
		{
			System.out.println("Stack is full");
		}
		else
		{
			arr[top]=num;
			System.out.println(num + " is pushed to the stack in the position "+ top);
			System.out.println(arr[0] + " top index --> "+ top);
			top++;
		}
	}
	public void pop()
	{
		if(top<1)
		{
			System.out.println("Stack is empty");
		}
		else {			
			System.out.println(arr[--top]+" "+"is popped");
		}
	}
}


class dynamicStack implements stack{
		int top=0;
		int arr[] = new int[0];
		
		public void push(int num) {
			int[] copy = Arrays.copyOf(arr, ++top);
			arr = copy;
			arr[top-1]=num;
			System.out.println(num + " is pushed to the stack in the position "+ top);
		}
		public void pop() {
			if(top==0) {
				System.out.println("stack is empty");
			}
			else {
				int[] copy = Arrays.copyOf(arr, --top);
				arr = copy;
				System.out.println("poped");
			}
		}
	}



public class StackOperation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sizeFixedStack = 5;
		fixedStack obj = new fixedStack(sizeFixedStack);
		dynamicStack obj1 = new dynamicStack();
		System.out.println("Press 1 for Fixed Stack, Press 2 for Dynamic Stack");
		int option = sc.nextInt();
		
		if(option == 1) {
		
		
		while(true) {
			
			System.out.println("Fixed Stack\nEnter:\n1 for push\n2 for pop\n3 to exit");
			int b = sc.nextInt();
			if(b==1) {
				System.out.println("Enter the number to be pushed");
				int push=sc.nextInt();
				obj.push(push);
			}
			else if(b==2) {
				obj.pop();
			}
			else if(b==3){
				break;
			}
			else {
				System.out.println("invalid input1");
			}
		}
		}
		
		else if(option == 2) {
		while(true) {
			
			System.out.println("Dynamic Stack\nEnter:\n1 for push\n2 for pop\n3 to exit");
			int b = sc.nextInt();
			if(b==1) {
				System.out.println("Enter the number to be pushed");
				int push=sc.nextInt();
				obj1.push(push);
			}
			else if(b==2) {
				obj1.pop();
			}
			else if(b==3){
				break;
			}
			else {
				System.out.println("invalid input");
			}
		}
		}
		else {
			System.out.println("Invalid input");
		}
		

	}

}















	
