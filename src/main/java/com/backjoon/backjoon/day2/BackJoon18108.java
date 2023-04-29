package com.backjoon.backjoon.day2;

import java.util.Scanner;

// April.29 Saturday
public class BackJoon18108 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputYear = sc.nextInt();

				if (inputYear >= 1000) {
						int thailandYear = inputYear - 543;
						System.out.printf("%d\n", thailandYear);
				} else if (inputYear <= 3000) {
						int thailandYear = inputYear - 543;
						System.out.printf("%d\n", thailandYear);
				}
		}
}
