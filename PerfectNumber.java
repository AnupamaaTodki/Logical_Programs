package com.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number to check perfect number or not");
	int num = scanner.nextInt();
	int sum = 0;
	for (int divisor = 1; divisor < num; divisor++) {
		if (num % divisor == 0)
			sum += divisor;
	}
	if(num == sum){
		System.out.println("Entered number is perfect number");
	}else{
		System.out.println("Entered number is not perfect number");
	}
	scanner.close();
}
}
