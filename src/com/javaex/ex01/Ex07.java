package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {
		/*5/4 1.25지만 정수로 계산되어 소수점이 사라진 1만 남는다 고로 1을 실수로
		  변환하면 1.0이 된다*/
		double v01 = 5/4;
		System.out.println(v01);
		/*0.5/4가 되지만 실수로 계산되기 위해서 정수를 실수로 변화되어 0.5/0.4로
		  계산된다*/
		double v02 = (double)5/4;
		System.out.println(v02);
		
		double v03 = 5/(double)4;
		System.out.println(v03);
		
		double v04 = (double)5/(double)4;
		System.out.println(v04);
		/*실수지만 정수로 강제변환되어 소수점이 사라지고 1만남아 계산된다*/
		int v05 = (int)1.3+(int)1.8;
		System.out.println(v05);
	}
	

}
