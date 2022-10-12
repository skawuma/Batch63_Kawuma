package com.cogent;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author samuelkawuma
 *Oct 5, 2022
 *3:25:56 PM
 */

public class PriorityQueue_Impl {
	public static void main(String[] args) {
		Queue<String> PQ = new PriorityQueue<>();	
		PQ.add("abcd");
		PQ.add("1234");
		PQ.add("23bc");
		PQ.add("zzxx");
		PQ.add("abxy");
		System.out.println("Strings Stored in Natural Ordering in a Priority Queue\n");
		while (!PQ.isEmpty()) {
			System.out.println(PQ.peek());
			break;
		}

		System.err.println("***************");	

		while (!PQ.isEmpty()) {
			System.out.println(PQ.poll());

		}		
			
		System.err.println("***************");	


	}
}
