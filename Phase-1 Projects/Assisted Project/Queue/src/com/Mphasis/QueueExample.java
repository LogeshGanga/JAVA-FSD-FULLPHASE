package com.Mphasis;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<String> locationsQueue = new LinkedList<>();
		locationsQueue.add("Chennai");
		locationsQueue.add("Andhra Pradesh");
		locationsQueue.add("Hyderbad");
		locationsQueue.add("Bangalore");
		locationsQueue.add("Nagpur");
		System.out.println("Queue is : " + locationsQueue);
		System.out.println("Head of Queue : " + locationsQueue.peek());
		locationsQueue.remove();
		System.out.println("After removing Head of Queue : " + locationsQueue);
		System.out.println("Size of Queue : " + locationsQueue.size());
	}
}