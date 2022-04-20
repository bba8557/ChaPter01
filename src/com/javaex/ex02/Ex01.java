package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		int i = 2345;
		double d = 3.15;
		char c = '한';
		String s = "한";
		String str = "굿모닝";
		String name = "장희만";
		
		System.out.println("안녕하세요");
		System.out.println(str);
		
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println(str + str);
		System.out.println(str + i + "잘잤냐");
		System.out.println(str + d + "잘잤냐");
		System.out.println(str + d + i);
		System.out.println(d + i);
		System.out.println(c);
		System.out.println(c + c);// 숫자로 연산된다
		System.out.println(s);
		System.out.println(s + s);
		System.out.println("제이름은 " + name + " 입니다.");
		System.out.println("제이름은 장희만 입니다.");
		
		//줄바꿈 \n -->안녕
		//			 하세요
		//탭	   \t -->안녕		하세요
		//따움표 \" -->안녕"하"세요
		//슬러쉬 \\ -->안녕\하\세요
	}

}
