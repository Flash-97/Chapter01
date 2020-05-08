package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int point; //점수
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//점수출력
		System.out.println("점수를 입력하세요");
		
		//점수입력
		point = sc.nextInt();
		
		if (point%3==0) { 
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다");
		}
		
		
		
		
		
		
		//스캐너 닫기
		sc.close();
	}

}
