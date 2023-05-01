package com.backjoon.backjoon.april.day1;

import java.util.Scanner;

// April.27 Thursday
public class BackJoon10869 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputOne = sc.nextInt();
				int inputTwo = sc.nextInt();

				int resultSum = inputOne + inputTwo;
				int resultMinus = inputOne - inputTwo;
				int resultMultiplication = inputOne * inputTwo;
				int resultDivision = inputOne / inputTwo;
				int resultRemainder = inputOne % inputTwo;

				System.out.printf("%d\n", resultSum);
				System.out.printf("%d\n", resultMinus);
				System.out.printf("%d\n", resultMultiplication);
				System.out.printf("%d\n", resultDivision);
				System.out.printf("%d\n", resultRemainder);
		}
}
