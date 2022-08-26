package com.logicalprograms;

import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {
		double start= 0, stop = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 1 to start");
		scanner.next();
		start = System.currentTimeMillis();
		System.out.println("enter 2 to stop");
		scanner.next();
		stop = System.currentTimeMillis();
		System.out.println("Total time is " + (stop - start) / 1000 + " Seconds");
	scanner.close();
	}
}
