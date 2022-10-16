package com.bptn.courseweek4;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(78);
		stack.push(113);
		stack.push(90);
		stack.push(120);
		
		System.out.println("Stack size: " + stack.size());
		
		System.out.println("Get 0: " + stack.get(0));
		
		System.out.println("Search 113: " + stack.search(113));
		
		while(!stack.empty()) {			
			System.out.println(stack.pop());
		}
		System.out.println("Stack size: " + stack.size());
		
		// removes the element at the top of the stack
//		System.out.println(stack.pop());
//		System.out.println("Stack size: " + stack.size());
//		
//		System.out.println(stack.pop());
//		System.out.println("Stack size: " + stack.size());
//		
//		System.out.println(stack.pop());
//		System.out.println("Stack size: " + stack.size());
//		
//		System.out.println(stack.pop());
//		System.out.println("Stack size: " + stack.size());

	}

}
