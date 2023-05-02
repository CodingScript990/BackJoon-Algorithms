package com.backjoon.backjoon.may.day5;

import java.util.Scanner;
// May.2 Tuesday
public class ProgrammersOddToEven {
		// 리팩토링
		public static int isOddEven(int n) {

				if (n % 2 == 0) {
						System.out.printf("%d is even\n", n);
				} else {
						System.out.printf("%d is odd\n", n);
				}
				return n;
		}

		public static void main(String[] args) {

				// 홀짝 구분하기

				Scanner sc = new Scanner(System.in);

				int n = sc.nextInt();

				isOddEven(n);
		}
}
