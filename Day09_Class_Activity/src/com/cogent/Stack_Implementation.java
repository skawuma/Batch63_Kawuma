package com.cogent;

/**
 * @author samuelkawuma
 *Sep 29, 2022
 *2:29:37 PM
 */

public class Stack_Implementation {
	
	int arr[];
    int cap;
    int top;
    
    
    /**
	 * @param arr
	 * @param cap
	 * @param top
	 */
	//public Stack_Implementation(int[] arr, int cap, int top) {
	//	super();
	//	this.arr = arr;
	///	this.cap = cap;
	//	this.top = top;
	//}
	
	public Stack_Implementation (int c){
        top=-1;
        cap=c;
        arr=new int [cap];
        
    }

	void push(int x){
        if(top==cap-1){System.out.println("Stack is full");
        return;}
        top++;
        arr[top]=x;
    }
    
    int pop(){
        if(top==-1){System.out.println("Stack is Empty");
        return Integer.MIN_VALUE;}
        int res=arr[top];
        top--;
        return res;
    }
    
    int peek(){
        if(top==-1){System.out.println("Stack is Empty");
        
        return Integer.MIN_VALUE;}
        return arr[top];
    }
    
    int size(){
        return (top+1);
    }
    
    boolean isEmpty(){
        return top==-1;
    }
    
    public static void main(String[] args) {
    	Stack_Implementation s = new Stack_Implementation(5);
    
    	s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    	
    	
	}

}

