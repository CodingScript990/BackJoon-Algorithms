package com.backjoon.backjoon.may.day4;

import java.util.Scanner;

public class BackJoon2480 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputOne = sc.nextInt();
				int inputTwo = sc.nextInt();
				int inputThird = sc.nextInt();

				if (inputOne != inputTwo && inputTwo != inputThird && inputOne != inputThird) {
						int inputMax = 0;

						if (inputOne > inputTwo) {
								if (inputThird > inputOne) {
										inputMax = inputThird;
								} else {
										inputMax = inputOne;
								}
						} else {
								if (inputThird > inputTwo) {
										inputMax = inputThird;
								} else {
										inputMax = inputTwo;
								}
						}
						System.out.printf("%d\n", inputMax * 100);
				} else {
						if (inputOne == inputTwo && inputOne == inputThird) {
								System.out.printf("%d\n", 10000 + inputOne * 1000);
						} else {
								if (inputOne == inputTwo || inputOne == inputThird) {
										System.out.printf("%d\n", 1000 + inputOne * 100);
								} else {
										System.out.printf("%d\n", 1000 + inputTwo * 100);
								}
						}
				}
		}
}
