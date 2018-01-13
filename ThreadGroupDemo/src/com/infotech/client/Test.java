package com.infotech.client;

import com.infotech.workers.MyThread;


public class Test {

	public static void main(String[] args) {
		MyThread r = new MyThread();
		
		ThreadGroup groupA = new ThreadGroup("groupA");
		ThreadGroup groupB = new ThreadGroup("groupB");
		
		Thread t1 = new Thread(groupA,r, "T1");
		Thread t2 = new Thread(groupA,r,"T2");
		Thread t3 = new Thread(groupA,r, "T3");
		Thread t4 = new Thread(groupA,r,"T4");
		
		Thread t5 = new Thread(groupB,r, "T5");
		Thread t6 = new Thread(groupB,r,"T6");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		groupA.setMaxPriority(Thread.MAX_PRIORITY);
		int activeCount = groupA.activeCount();
		System.out.println("activeCount in GroupA:"+activeCount);
		groupB.list();
		
	}
}
