package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//점수"출력"
		System.out.print("점수: ");
		
		//점수"입력"
		int score = sc.nextInt();
		
		if (score>=60) {
			System.out.println("합격입니다"); // true
		} else {
			System.out.println("불합격입니다"); // false
		}
		
		//스캐너 닫기
		sc.close();
		

	}

}
