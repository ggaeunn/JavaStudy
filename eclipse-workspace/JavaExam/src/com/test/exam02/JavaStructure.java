package com.test.exam02; //java 파일의 최상단

import java.util.Scanner; //외부 패키지로부터 클래스를 가져온다

public class JavaStructure {

	public static int sum(int a, int b) {
		
		return a+b;
		
	}
	public static void main(String[] agrv) {
		
		int i = 10;
		long l_value = 10;
		double d_value = 10;
		float f_value = 10;
		
		System.out.println("Integer i =" + i + "\n" + "Long type l_value = " + l_value + "\n");
		System.out.println("double d_value = " + d_value + "\n" + "float f_value = " + f_value + "\n");
		
		String[] names = new String[3];
		int size = names.length;
		
		Scanner put = new Scanner(System.in);
		
		for(int index=0; index <size; index++) {
			
			System.out.println("이름을 입력하세요");
			names[index] = put.nextLine();
			
		}
		
		for(int index=0; index < size; index++)
			System.out.println("이름 : " + names[index]);
		
		put.close();
	}
}
