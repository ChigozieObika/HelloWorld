package com.bptn.courseweek4;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class Id {
	static void insertNextId (List<Integer> list) {
		int max = 0;
		// 1. Find the maximum id in the list
		synchronized (list) {
			
			for (int id: list) {
				if (id > max) {
					max = id;
				}
			}
			// increase maximum id by i unit and add it to the list
			list.add(++max); // ++max = pre-increment, max++ = post-increment
		}
		
		System.out.println("Inserted: " + Thread.currentThread().getName() + ", " + max);
	}
}

class MyThread1 extends Thread {
	List<Integer> list;

	public MyThread1(String name, List<Integer> list) {
		super(name);
		this.list = list;
	}
	
	@Override
	public void run() {
		System.out.println("Running: " + this.getName());
		Id.insertNextId(this.list);
		System.out.println("Exiting: " + this.getName());
	}
	
}

public class ThreadSynchronization {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(5, 1, 4, 3, 6, 2));
		
		MyThread1 t1 = new MyThread1("T1", list);
		
		MyThread1 t2 = new MyThread1("T2", list);
		
		t1.start();
		
//		Thread.sleep(1000);
		
		t2.start();
		
		//We need to wait until the threads die
		t1.join();
		t2.join();
		
		System.out.println(list);

	}

}



















