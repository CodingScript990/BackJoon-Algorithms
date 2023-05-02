package com.backjoon.backjoon.may.day5;

import java.util.Scanner;
// May.2 Tuesday
public class WhileStarEx {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputNum = sc.nextInt();

				for (int i = 0; i <= inputNum; i++) {
						for (int j = 0; j <= inputNum; j++) {
								if (j >= inputNum - i) {
										System.out.printf("*");
								}
						}
						System.out.printf("\n");
				}
		}
}
