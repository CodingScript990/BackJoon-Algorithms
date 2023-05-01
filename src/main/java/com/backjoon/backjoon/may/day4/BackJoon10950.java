package com.backjoon.backjoon.may.day4;

import java.util.Scanner;

public class BackJoon10950 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputT = sc.nextInt();

				for (int i = 0; i < inputT; i++) {
						int inputOne = sc.nextInt();
						int inputTwo = sc.nextInt();

						System.out.printf("%d\n", inputOne + inputTwo);
				}
		}
}
