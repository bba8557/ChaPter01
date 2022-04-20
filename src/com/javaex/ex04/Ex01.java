package com.javaex.ex04;

public class Ex01 {
	public static void main(String[] args) {
//초기값+조건식+증강식 한세트

		//카운트(초기값)
		int i = 1;
		
		int num = 0;
		
		//while(식) 반복구간 조건식이 맞으면계속 들어옴(조건식)
		while(i<=5) {//1<=5 --> T 2<=5--> T...6<=5--> F 
			System.out.println("I like java"+num);
			num++;//num=num+1;
			
			i++; //i=i+1;  
			//자기자신에게 다시 돌아온다 질문을 계속 바꿔준다(증강식)
		}
		//이런걸 디버깅 이라고 한다
		
		
	}
}
