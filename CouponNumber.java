package com.logicalprograms;

public class CouponNumber {

	public static void main(String[] args) {
		char[] number="1234567890".toCharArray();
		int max=100000000;
		int random=(int) (Math.random()*max);	
		StringBuffer sb=new StringBuffer();
		
		while (random>0)
		{
			sb.append(number[random % number.length]);
			random /= number.length;
		}

		String couponCode=sb.toString();
		System.out.println("Coupon Code: "+couponCode);	

	}

}
