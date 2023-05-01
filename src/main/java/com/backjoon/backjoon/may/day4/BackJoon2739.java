package com.backjoon.backjoon.may.day4;

import java.util.Scanner;

public class BackJoon2739 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputNum = sc.nextInt();

				for (int i = 1; i < 10; i++) {
						System.out.printf("%d * %d = %d\n", inputNum, i, (inputNum * i));
				}
		}
}
