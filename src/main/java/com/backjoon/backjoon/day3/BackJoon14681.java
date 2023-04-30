package com.backjoon.backjoon.day3;

import java.util.Scanner;
// April.30 Sunday
public class BackJoon14681 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputComaX = sc.nextInt();
				int inputComaY = sc.nextInt();

				int result = inputComaX > 0 ? inputComaY > 0 ? 1 : 4 : inputComaY > 0 ? 2 : 3;

				System.out.printf("%d\n", result);
		}
}
