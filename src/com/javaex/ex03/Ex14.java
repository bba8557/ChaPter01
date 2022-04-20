package com.javaex.ex03;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		//if를 짧게 만들수도 있다.
		if((month == 4)||(month == 6)||(month == 9)||(month == 11)) {
			//days는 입력할수 없다 int로인해 오류가 생김
			System.out.println("30");
		}else if(month == 2) {
			//days는 입력할수 없다 int로인해 오류가 생김
			System.out.println("28");
		}else {
			//days는 입력할수 없다 int로인해 오류가 생김
			System.out.println("31");
		}
		sc.close();
	}
}