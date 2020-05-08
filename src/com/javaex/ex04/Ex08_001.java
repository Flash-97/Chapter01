package com.javaex.ex04;

public class Ex08_001 {
	
	public static void main(String[] args) {

		int line;
		int star;
		
		for (line=1; line<=6; line++) {
			for (star=1; star<=6-line; star++) {
			//for (star=6; star>=line; star--) // 역 삼각형 이것도 가능공식
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

