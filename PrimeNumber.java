package com.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the number = ");
	 int num = scanner.nextInt();
	 boolean isPrime = true;
	 for (int divisor = 2; divisor <= num/2; divisor++) {
		 if(num % divisor == 0) {
			 isPrime = false;
			 break;
		 }
		 }
	if (isPrime == true) {
		System.out.println("Number is prime");
	}else {
		System.out.println("Number is not prime");
	}
	scanner.close();
	}
	
}
