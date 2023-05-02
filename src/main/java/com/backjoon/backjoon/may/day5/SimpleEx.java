package com.backjoon.backjoon.may.day5;
// May.2 Tuesday
public class SimpleEx {
		public static void main(String[] args) {

				int inputSum = 0;
				while (inputSum <= 1000) {
						inputSum++;
						if (inputSum % 3 ==0) {
								System.out.printf("%d\n", inputSum);
						}
				}
		}
}
