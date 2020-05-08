package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		//점수
		int num; 
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//점수 출력
		System.out.print("점수를 입력하세요: ");
		
		//점수 입력
		num = sc.nextInt();
		
		//조건 A=90이상, B=80이상, C=70이상, D=60이상, F=60미만
		if (num>=90) {
			System.out.println("A등급");
		} else if (num>=80) {
			System.out.println("B등급");
		} else if (num>=70) {
			System.out.println("C등급");
		} else if (num>=60) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
		
		//스캐너닫기
		sc.close();
	}

}
