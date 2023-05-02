package com.backjoon.backjoon.may.day5;

import java.util.Scanner;
// May.2 Tuesday
public class ProgrammersRepeatedPrint {
		public static void main(String[] args) {

				// 문자열 반복해서 출력하기

				Scanner sc = new Scanner(System.in);

				String str = sc.next();
				int n = sc.nextInt();

				for (int i = 1; i <=n; i++) {
						System.out.printf("%s", str);
				}
		}
}
