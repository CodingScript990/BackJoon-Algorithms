package com.backjoon.backjoon.may.day4;

import java.util.Scanner;

public class BackJoon8393 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputOne = sc.nextInt();

				int inputSum = 0;

				for (int i = 1; i <= inputOne; i++) {
						inputSum += i;
				}
				System.out.printf("%d\n", inputSum);
		}
}
