package com.gautam.Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);

		SharedResource resource = new SharedResource();

		for (int i = 0; i < 5; i++) {
			executor.submit(new Worker(resource, i));
		}

		executor.shutdown();
	}
}
