package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//키보드 연결 외울것
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //<--키보드 입력값 (3 56 ??)
		System.out.println("입력하신 숫자는" + num + "입니다.");
		
		sc.close();
	}

}
