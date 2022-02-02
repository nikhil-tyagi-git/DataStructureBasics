package com.nikhil.stack;

public class ArrayImplStack {
		int arr[];
		int top;
		int cap;
		
		ArrayImplStack(int c){
			top=-1;
			cap=c;
			arr=new int[cap];
		}
		
		void push(int n) {
			if(cap == top+1) {
				System.out.println("Stack Overflow");
				throw new UnsupportedOperationException();
			}
			top++;
			arr[top]=n;
		}
		
		int pop() {
			if(top == -1) {
				System.out.println("Stack underflow");
				throw new UnsupportedOperationException();
			}
			int res=arr[top];
			top--;
			return res;
		}
		
		int size() {
			return top+1;
		}
		
		int peek() {
			if(top == -1) {
				System.out.println("Stack underflow");
				throw new UnsupportedOperationException();
			}
			return arr[top];
		}
		
		boolean isEmpty() {
			return (top == -1);
		}

		public static void main(String[] args) {
			ArrayImplStack s = new ArrayImplStack(2);
			//System.out.println(s.pop());
			s.push(10);
			System.out.println(s.peek());
			s.push(20);
			s.push(30);
			System.out.println(s.peek());
			System.out.println(s.pop());
			System.out.println(s.peek());
					
		}
}
