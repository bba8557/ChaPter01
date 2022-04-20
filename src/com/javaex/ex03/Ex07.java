package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int poit = sc.nextInt();
		if(poit>=90) {
			System.out.println("A등급");
			
			//if(poit>=80)
		}else if(90>poit && poit>=80){
			System.out.println("B등급");
			
			//if(poit>=70)
		}else if(80>poit && poit>=70) {
			System.out.println("C등급");
		
			//if(poit>=60)
		}else if(70>poit && poit>=60) {
			System.out.println("D등급");
			
		}else if(60>poit) {
			System.out.println("F등급");
		}
		sc.close();
	}

}
