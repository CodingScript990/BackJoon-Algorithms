package com.backjoon.backjoon.may.day5;

import java.util.Scanner;
// May.2 Tuesday
public class ProgrammersToUpperCaseEx {
		public static void main(String[] args) {

				// 대소문자 바꿔서 출력하기

				Scanner sc = new Scanner(System.in);

				String str = sc.next();

				String answer = "";

				for (int i = 0; i < str.length(); i++) {
						char innerChar = str.charAt(i);

						if (Character.isLowerCase(innerChar)) {
								answer += Character.toUpperCase(innerChar);
						} else {
								answer += Character.toLowerCase(innerChar);
						}
				}
				System.out.printf("%s",answer);
		}
}
