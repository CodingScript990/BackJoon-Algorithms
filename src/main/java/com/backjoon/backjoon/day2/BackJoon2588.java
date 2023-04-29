package com.backjoon.backjoon.day2;

import java.util.Scanner;

// April.29 Saturday
public class BackJoon2588 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int[] inputOne = new int[]{sc.nextInt()};
				int[] inputTwo = new int[]{sc.nextInt()};

				// 1의자리
				int operationOne = inputOne[0] * (inputTwo[0] % 10);

				// 10의자리
				int operationTen = inputOne[0] * ((inputTwo[0] % 100) / 10);

				// 100의자리
				int operationHundred = inputOne[0] * ((inputTwo[0] % 1000) / 100);

				// Total
				int operationTotal = inputOne[0] * inputTwo[0];

				System.out.printf("%d\n", operationOne);
				System.out.printf("%d\n", operationTen);
				System.out.printf("%d\n", operationHundred);
				System.out.printf("%d\n", operationTotal);
		}
}
