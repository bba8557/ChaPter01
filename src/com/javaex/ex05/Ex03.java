package com.javaex.ex05;

public class Ex03 {
	public static void main(String[] args) {
		//메모리의 구조
		int[] nums = new int[6];
		
		/*for사용 가능 일정한 값(규칙)이 있었기에 가능
		nums[0] = (int)(Math.random()*45)+1;
		nums[1] = (int)(Math.random()*45)+1;
		nums[2] = (int)(Math.random()*45)+1;
		nums[3] = (int)(Math.random()*45)+1;
		nums[4] = (int)(Math.random()*45)+1;
		nums[5] = (int)(Math.random()*45)+1;
		*/
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*45)+1;
		}
		
		System.out.println(nums[0]);
		System.out.println(nums[4]);
		System.out.println("========================");
		
		//메모리와 연동 <= 이러면 6까지 가야된다 없는방.
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}
}
