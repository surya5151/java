package com.xworkz.java.collection.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		
		System.out.println(stack);	//[1,2,3,4,5,6,7]
		stack.pop();
		System.out.println(stack);	//[1,2,3,4,5,6]
		System.out.println(stack.pop());	//6
		stack.pop();
		System.out.println(stack); 	// [1,2,3,4]
		System.out.println(stack.peek()); //4
		System.out.println(stack.search(3));	//2
		System.out.println(stack.search(9));	//-1
		
		
		
	}
}
