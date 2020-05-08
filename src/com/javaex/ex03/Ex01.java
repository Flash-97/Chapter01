package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//점수"출력"
		System.out.print("점수: ");
		
		//점수"입력"
		int point = sc.nextInt();
		
		//60이 넘어야 합격
		if (point>=60) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
		}
		
		//스캐너 닫아주기
		sc.close();
		
		
		
	}

}
