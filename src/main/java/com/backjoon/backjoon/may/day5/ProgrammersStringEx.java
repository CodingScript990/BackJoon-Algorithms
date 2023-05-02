package com.backjoon.backjoon.may.day5;

import java.util.Scanner;
// May.2 Tuesday
public class ProgrammersStringEx {
		public static void main(String[] args) {

				// 문자열 돌리기

				Scanner sc = new Scanner(System.in);

				String a = sc.next();
				String[] strArr = a.split("");

				for(int i = 0; i < strArr.length; i++) {
						System.out.printf("%s\n", strArr[i]);
				}
		}
}
