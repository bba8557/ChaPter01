package com.javaex.ex05;

public class Ex01 {
	public static void main(String[] args) {
		/*
		  int num = (int)(Math.random()*10)+1; 
		  System.out.println(num);
		 */
		
		int no1, no2, no3, no4, no5, no6;
		
		no1 = (int)(Math.random()*45)+1;
		no2 = (int)(Math.random()*45)+1;
		no3 = (int)(Math.random()*45)+1;
		no4 = (int)(Math.random()*45)+1; 
		no5 = (int)(Math.random()*45)+1; 
		no6 = (int)(Math.random()*45)+1;
		
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		System.out.println(no4);
		System.out.println(no5);
		System.out.println(no6);
		
		
		// 반복문 for로(no1..등)메모리 연동 안됨다 단독은 됨
		/*
		  for (int i = 1; i <= 6; i++) {
		  	int num = (int) (Math.random() * 45) + 1;
		  	system.out.println("no"+i);}//no1 no2....이렇게 나옴
		  	System.out.println(num);}
		*/
		

	}
}