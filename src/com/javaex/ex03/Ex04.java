package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int time;
		int pay;
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//"출력"
		System.out.print("근무시간: ");
		
		//"입력"
		time = sc.nextInt();
		
		if (time>8) {
			pay = 8*10000 + (time-8)*12000;
			//System.out.println("임금은 " + pay + "원 입니다.");
		} else {
			pay = time*10000;
			//System.out.println("임금은 " + pay + "원 입니다.");
		}
			System.out.println("임금은" + pay + "원 입니다.");
		
		
		
		
		
		//스캐너닫기
		sc.close();
	}

}
