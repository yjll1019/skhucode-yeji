package io;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 23일
 * 내 용 : 별찍기 - 1
 * 		첫째 줄부터 N번째 줄 까지 차례대로 별을 출력.
 */
public class Code_2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		
	
		for(int i=1; i<=num; ++i) {
			sb.append("*");
		}
		
		for(int i=1; i<=num; ++i) {
			System.out.println(sb.substring(0, i));
		}
	}
}
