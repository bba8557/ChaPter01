package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args) {
		
		//일반적인 방식
		double pi = 3.14;
		double result01 = pi*5*5;
		System.out.println(result01);
		
		//pi값이 변경되는 경우
		pi=3.1415926;
		double result02 = pi*5*5;
		System.out.println(result02);
		
		//상수로 정의할 경우-상수는 변수를 암묵적으로 대문자로 씀.
		final double PI = 3.14;//final 고정시켜준다.
		double result03 = pi*5*5;
		System.out.println(result03);
		
		//상수의 값을 변경할려고 할때(오류나는이유)
		/*
		PI = 3.1415926; //PI가 상수로 선언되어 변경되지 않는다.
		double result04 = pi*5*5;
		System.out.println(result04);
		*/
	}

}
