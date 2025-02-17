package com.gautam;

public class ExceptionHandler {

	public static void demonstrateCustomException() throws CustomException {
		throw new CustomException("exception message");
	}

	public static void demonstrateExceptionHierarchy() throws CustomException {
		try {
			demonstrateCustomException();
		} catch (CustomException e) {
			System.out.println(e);
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			demonstrateExceptionHierarchy();
		} catch (CustomException e) {
			System.out.println("Exception handled: " + e);
		} finally {
			System.out.println("Finally block");
		}
	}
}
