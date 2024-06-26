package com.gautam.Threading;

public class Worker implements Runnable {
	private final SharedResource resource;
	private final int id;

	public Worker(SharedResource resource, int id) {
		this.resource = resource;
		this.id = id;
	}

	@Override
	public void run() {
		resource.increment();
		System.out.println("Worker " + id + " incremented value using synchronized method to: " + resource.getValue());

		resource.incrementWithBlock();
		System.out.println("Worker " + id + " incremented value using synchronized block to: " + resource.getValue());
	}
}