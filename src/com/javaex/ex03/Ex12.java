package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		//이렇게도 짤수있다.직관적이지는 않는다
		switch(month) {
			case 4:
			case 6:
			case 9:
			case 11:
				//days는 입력할수 없다 int로인해 오류가 생김
				System.out.println("30");
				break;
				
			case 2:
				//days는 입력할수 없다 int로인해 오류가 생김
				System.out.println("28");
				break;
				
			default:
				//days는 입력할수 없다 int로인해 오류가 생김
				System.out.println("31");
				break;
				
		}
		sc.close();
	}
	
}
	
