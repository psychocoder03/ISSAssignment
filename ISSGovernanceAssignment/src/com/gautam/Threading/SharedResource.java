package com.gautam.Threading;

public class SharedResource {
	private volatile int counter = 0;
	private final Object lock = new Object();

	public synchronized void increment() {
		counter++;
	}

	public void incrementWithBlock() {
		synchronized (lock) {
			counter++;
		}
	}

	public int getValue() {
		return counter;
	}
}
