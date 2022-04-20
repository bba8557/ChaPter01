package com.javaex.ex01;

public class Ex04 {
	public static void main(String[] args) {
		//글자 한글자만 표현 ""안된다. 
		char ch01 = 'A';
		char ch02 = '안';
		
		System.out.println(ch01);
		System.out.println(ch02);
		//유니코드 상에 65가 A라 A로 출력하여 보여준다
		//A->코드표 찾고->65(저장)
		//65->코드표 찾고->A
		char ch03 = 65;
		System.out.println(ch03);
		//숫자로 표현하고 싶으면 따옴표로표시 한글자만 가능
		char ch04 = '3';
		System.out.println(ch04);
//////////////////앞에 8개는 무조건 소문자로 시작된다(기본자료형)/////////////
		
		
		//한글자 이상 쓸때 사용 쌍따움표로 표현
		//평소에 한 글자라도 이걸로 사용된다 보편적 상용화
		String ch05 = "안";
		System.out.println(ch05);
	}

}
