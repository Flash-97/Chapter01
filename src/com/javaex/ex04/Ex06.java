package com.javaex.ex04;

public class Ex06 {

	public static void main(String[] args) {
		
		//변수
		int dan;
		int i;
		int result;
		
		//조건: dan이 10보다 커질때까지 반복
		for (dan=2; dan<10; dan++) {
			for (i=1; i<10; i++) {
				result = dan*i;
				System.out.print(dan+"*"+i+"="+result+"  ");
			}
			System.out.println();
			
			
		}
		
	}

}
