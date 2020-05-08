package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		
		String name = "이현준";
		
		System.out.println("안녕하세요");
		System.out.println(name);
		System.out.println("name");
		
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println(str);
		System.out.println(str+str);
		System.out.println(str+i); // 문자열+정수
		System.out.println(str +" 랑 "+  i); // 굿모닝 랑 2345 문자열+문자열+정수
		System.out.println(str+d); //문자열+실수
		
		System.out.println(c);
		System.out.println(c+c); // 조심
		System.out.println(s+c);
		
		// 제 이름은 이현준 입니다.
		System.out.println("제 이름은 "+name+" 입니다.");
		
		//제 이름은 "이현준" 입니다.
		System.out.println("제 이름은 \"" + name+ "\" 입니다.");
		
		//제 이름은 \이현준\ 입니다.
		System.out.println("제이름은 \\" + name + "\\ 입니다.");
		
		//안녕
		//하세요
		System.out.println("안녕\n하세요");
		
		//안녕     하세요
		System.out.println("안녕\t하세요");
		
	}

}
