package com.javaex.ex03;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		//switch를 if로 작업해봤을때
		if(month==1) {
			System.out.println("31일 입니다.");
		}else if(month==2) {
			System.out.println("28일 입니다.");
		}else if(month==3) {
			System.out.println("31일 입니다.");
		}else if(month==4) {
			System.out.println("30일 입니다.");
		}else if(month==5) {
			System.out.println("31일 입니다.");
		}else if(month==6) {
			System.out.println("30일 입니다.");
		}else if(month==7) {
			System.out.println("31일 입니다.");
		}else if(month==8) {
			System.out.println("31일 입니다.");
		}else if(month==9) {
			System.out.println("30일 입니다.");
		}else if(month==10) {
			System.out.println("31일 입니다.");
		}else if(month==11) {
			System.out.println("30일 입니다.");
		}else if(month==12) {
			System.out.println("31일 입니다.");
		}
		sc.close();
	}
}

