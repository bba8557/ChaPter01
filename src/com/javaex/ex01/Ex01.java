/*
작성자: 장희만
작성일: 2022-04-13
설 명: 나이기록 프로그램
*/

package com.javaex.ex01;

public class Ex01 {

	// 기본틀(외워야함) 정수
	public static void main(String[] args) {
		/*
		   *공간마련 공간이름(변수선언)
		   int myAge; 
		   *내용 "=" 오른쪽 내용을 왼쪽에 넣어라(초기화)
		   myAge = 30; 
		   
		   *한호흡(변수선언+초기화)
		   int myAge = 25; 
		   
		   *메모리의 값을 출력하는
		    메소드 콘솔창에 출력 명령어(외워야함) 
		   System.out.println(myAge);
		   myAge = 31; 
		   System.out.println(myAge);
		 */
		
		byte no;
		no = 127;
		System.out.println(no);
		no = -128;
		System.out.println(no);
		
		long no2;
		/* int 범위까지는 L을 붙이지 않아도된다.*/
		no2 = 2147483647;
		System.out.println(no2);
		/* int 범위를 벗나면 long 마직막에 L을 써줘야된다 */
		no2 = 999999999999999999L;
		System.out.println(no2);
		
		///////////////////////////////////////
		//변수선언, 초기화/////////////////////////
		///////////////////////////////////////
		
		//영소문자가 와야함 숫자 안됨
		//변수여러개일때 변수선언, 초기화
		int var01; 
		int var02;
		int var03;
		//int var01, var02, var03;
		
		var01 = 10;
		var02 = 20;
		var03 = 30;
		
		//변수여러개일때 변화선언+초기화
		int var04 = 10; 
		int var05 = 20; 
		int var06 = 30;
		//int var04 = 10, var05 = 20, var06 = 30;
		
		
	}
}
