package com.javaex.ex01;

public class Ex02 {
	
	public static void main(String[] args) {	
		/* 실수
		double var01;
		var01 = 3.14;
		System.out.println(var01);
		*/
		
		//범위가 없다 넣는데로 들어는감.8byte
		double var01 = 3.14;
		//float은 무족건 F를 써줘야된다.4byte
		float var02 = 3.14F;
		System.out.println(var01);
		System.out.println(var02);
		
		/*
		float var02;
		var = 3.14F;
		System.out.println(var02);
		*/
		
		//출력할떄 문제가 생긴다 길면
		double var03 = 0.1234567890123456789;
		float var04 = 0.1234567890123456789F;
		System.out.println(var03);
		System.out.println(var04);
	}
}